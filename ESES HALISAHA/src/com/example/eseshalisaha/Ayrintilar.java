package com.example.eseshalisaha;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Ayrintilar extends Activity
{
	GoogleMap harita = null;
	DBHelper db;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ayrintilar);
		
		db = new DBHelper(this);
		
		Bundle extras = getIntent().getExtras();
		int position = extras.getInt("position");
		
		Halisaha hs = new Halisaha();
		hs = db.getContact(++position);
		
		harita = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		harita.setMapType(GoogleMap.MAP_TYPE_HYBRID);
		harita.setMyLocationEnabled(true);
        
		TextView tw_saha_adi = (TextView) findViewById(R.id.tw_saha_adi);
		TextView tw_adres = (TextView) findViewById(R.id.tw_adres);
		TextView tw_sahalar = (TextView) findViewById(R.id.tw_sahalar);
		TextView tw_telefon_numaras� = (TextView) findViewById(R.id.tw_telefon_numarasi);
		ImageView iw_logo = (ImageView) findViewById(R.id.iw_logo);
		
		tw_saha_adi.setText("Saha Ad� : " + hs.IsimGetir());
		tw_adres.setText("Adres : " + hs.AdresGetir());
		tw_sahalar.setText("Sahalar : " + hs.SahaGetir());
		tw_telefon_numaras�.setText("Telefon Numaras� : " + hs.TelefonGetir());

	}
	
	


}
