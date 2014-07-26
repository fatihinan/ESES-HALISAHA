package com.example.eseshalisaha;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
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
		
		View background = findViewById(R.id.background);
		
		background.setBackgroundResource(R.drawable.esbay);
		
		Halisaha hs = new Halisaha();
		hs = db.getContact(++position);
		
		harita = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		harita.setMapType(GoogleMap.MAP_TYPE_HYBRID);
		harita.setMyLocationEnabled(true);
        
		TextView tw_saha_adi = (TextView) findViewById(R.id.tw_saha_adi);
		TextView tw_adres = (TextView) findViewById(R.id.tw_adres);
		TextView tw_sahalar = (TextView) findViewById(R.id.tw_sahalar);
		TextView tw_telefon_numarasý = (TextView) findViewById(R.id.tw_telefon_numarasi);
		
		tw_saha_adi.setText(hs.IsimGetir());
		tw_adres.setText(hs.AdresGetir());
		tw_sahalar.setText(hs.SahaGetir());
		tw_telefon_numarasý.setText(hs.TelefonGetir());

	}
	
	


}
