package com.example.eseshalisaha;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Ayrintilar extends Activity
{
	GoogleMap harita = null;
	DBHelper db;
	Marker saha_konum;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ayrintilar);
		
		db = new DBHelper(this);
		
		Bundle extras = getIntent().getExtras();
		int position = extras.getInt("position");
		
//		View background = findViewById(R.id.background);
//		background.setBackgroundResource(R.drawable.esbay);
		
		Halisaha halisaha = new Halisaha();
		halisaha = db.getContact(++position);
		
		harita = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		harita.setMapType(GoogleMap.MAP_TYPE_HYBRID);
		harita.setMyLocationEnabled(true);
        
		TextView tw_saha_adi = (TextView) findViewById(R.id.tw_saha_adi);
		TextView tw_adres = (TextView) findViewById(R.id.tw_adres);
		TextView tw_sahalar = (TextView) findViewById(R.id.tw_sahalar);
		TextView tw_telefon_numarasý = (TextView) findViewById(R.id.tw_telefon_numarasi);
		
		tw_saha_adi.setText(halisaha.IsimGetir());
		tw_adres.setText(halisaha.AdresGetir());
		tw_sahalar.setText(halisaha.SahaGetir());
		tw_telefon_numarasý.setText(halisaha.TelefonGetir());
		
		double d_enlem = Double.parseDouble(halisaha.EnlemGetir());
		double d_boylam = Double.parseDouble(halisaha.BoylamGetir());
		
		saha_konum = harita.addMarker(new MarkerOptions()
        .position(new LatLng(d_enlem, d_boylam))
        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        .title(halisaha.IsimGetir()));
		saha_konum.showInfoWindow();
		
		harita.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(d_enlem, d_boylam), 17));

	}
	
	


}
