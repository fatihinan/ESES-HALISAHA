package com.example.eseshalisaha;


import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	final List<Halisaha> halisahalar =new ArrayList<Halisaha>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final ListView listemiz = (ListView) findViewById(R.id.liste);
		DBHelper dbHelper = new DBHelper(getApplicationContext());
        SharedPreferences settings = getSharedPreferences("SQL", 0);
		listemiz.setBackgroundResource(R.drawable.arayuz1);
        boolean firstTime = settings.getBoolean("firstTime", true);
	    if (firstTime) {
	      
	    	
	      Bitmap logo1 = BitmapFactory.decodeResource(getResources(),R.drawable.demirspor);
		  Bitmap logo2 = BitmapFactory.decodeResource(getResources(),R.drawable.ataturkmesleklisesi);
		  Bitmap logo3 = BitmapFactory.decodeResource(getResources(),R.drawable.esplanetpark);
		  Bitmap logo4 = BitmapFactory.decodeResource(getResources(),R.drawable.fethiheperhalisaha);
		  Bitmap logo5 = BitmapFactory.decodeResource(getResources(),R.drawable.logoyok);
		  Bitmap logo6 = BitmapFactory.decodeResource(getResources(),R.drawable.esbay);
		  Bitmap logo7 = BitmapFactory.decodeResource(getResources(),R.drawable.logoyok);
		  Bitmap logo8 = BitmapFactory.decodeResource(getResources(),R.drawable.logoyok);
		  Bitmap logo9 = BitmapFactory.decodeResource(getResources(),R.drawable.sportmen);
		  Bitmap logo10 = BitmapFactory.decodeResource(getResources(),R.drawable.cavusoglu);
		  
		  
	      ByteArrayOutputStream resim_stream1 = new ByteArrayOutputStream();
	      ByteArrayOutputStream resim_stream2 = new ByteArrayOutputStream();
	      ByteArrayOutputStream resim_stream3 = new ByteArrayOutputStream();
	      ByteArrayOutputStream resim_stream4 = new ByteArrayOutputStream();
	      ByteArrayOutputStream resim_stream5 = new ByteArrayOutputStream();
	      ByteArrayOutputStream resim_stream6 = new ByteArrayOutputStream();
	      ByteArrayOutputStream resim_stream7 = new ByteArrayOutputStream();
	      ByteArrayOutputStream resim_stream8 = new ByteArrayOutputStream();
	      ByteArrayOutputStream resim_stream9 = new ByteArrayOutputStream();
	      ByteArrayOutputStream resim_stream10 = new ByteArrayOutputStream();
	      
	      
		  logo1.compress(Bitmap.CompressFormat.JPEG, 100, resim_stream1);
		  byte resim_byte[] = resim_stream1.toByteArray();
		  dbHelper.insertCountry(new Halisaha("DEM�RSPOR ALTYAPI ve HALI SAHA TES�SLER�", "Telefon 1: 0 222 224 24 10"
                  , resim_byte,"A��k Saha 1","Ho�nudiye Mah. Bas�n �ehitleri Cad. T�lomsa� Lojmanlar� Yan�"));
		  
		  logo2.compress(Bitmap.CompressFormat.JPEG, 100, resim_stream2);
		  resim_byte= resim_stream2.toByteArray();
	      dbHelper.insertCountry(new Halisaha("ATAT�RK TEKN�K VE END�STR� MESLEK L�SES�", "Telefon 1: 0222 230 15 67"
                  , resim_byte,"A��k Saha 1","M.Kemal Atat�rk Cad. No:55 Odunpazar�"));
	      
	      logo3.compress(Bitmap.CompressFormat.JPEG, 100, resim_stream3);
		  resim_byte= resim_stream3.toByteArray();
	      dbHelper.insertCountry(new Halisaha("ES PLANET PARK", "Telefon 1: 0222 239 21 21 Telefon 2: 0222 229 31 64"
                  , resim_byte,"A��k Saha 1, Kapal� Saha 1","Yenikent Mh. Kaymaz Sk. No:36"));
	      
	      logo4.compress(Bitmap.CompressFormat.JPEG, 100, resim_stream4);
		  resim_byte= resim_stream4.toByteArray();
	      dbHelper.insertCountry(new Halisaha("FETH� HEPER HALI SAHA", "Telefon 1: 0222 237 30 03"
                  , resim_byte,"A��k Saha 1, A��k Saha 2","Ankara Yolu 71 Evler Kav�a��"));
	      
	      logo5.compress(Bitmap.CompressFormat.JPEG, 100, resim_stream5);
		  resim_byte= resim_stream5.toByteArray();
		  dbHelper.insertCountry(new Halisaha("ESSPOR SPOR TES�SLER�", "Telefon 1: 0222�245 02 45"
                  , resim_byte,"A��k Saha 1,  Kapal� Saha 1","Vadi�ehir Mahallesi Ulua�a� Sokak No:4 / A (�smar Yan�) Odunpazar�"));
		  
		  logo6.compress(Bitmap.CompressFormat.JPEG, 100, resim_stream6);
		  resim_byte= resim_stream6.toByteArray();
	      dbHelper.insertCountry(new Halisaha("ESBAY HALI SAHA", "Telefon 1:�0222 335 60 70"
                  , resim_byte,"A��k Saha 1, A��k Saha 2","Yeniba�lar Mah. �niversite Cad. Yorulmaz Sk. No 1 A"));
	      
	      logo7.compress(Bitmap.CompressFormat.JPEG, 100, resim_stream7);
		  resim_byte= resim_stream7.toByteArray();
	      dbHelper.insertCountry(new Halisaha("EKOL HALI SAHA", "Telefon 1: 0 222 320 36 20, Telefon 2 0505 599 76 64"
                  , resim_byte,"A��k Saha 1","Ertu�rulgazi Mah. Ay�en Sok. No:20 (ACI BADEM HASTANES� ARKASI)"));
	      
	      logo8.compress(Bitmap.CompressFormat.JPEG, 100, resim_stream8);
		  resim_byte= resim_stream8.toByteArray();
	      dbHelper.insertCountry(new Halisaha("SPORLAND HALI SAHA", "-"
                  , resim_byte,"A��k Saha 1, A��k Saha 2","B�y�kdere Mah. Bal�z� Sok. No:5 (Cemevi Arkas�)"));
	      
	      logo9.compress(Bitmap.CompressFormat.JPEG, 100, resim_stream9);
		  resim_byte= resim_stream9.toByteArray();
		  dbHelper.insertCountry(new Halisaha("SPORTMEN CLUP", "Telefon 1: 0222 227 00 61 Telefon 2: 0546 826 26 06"
                  , resim_byte,"A��k Saha 1,A��k Saha 2,Kapal� Saha 1","G�kmeydan Mah. Ka��thane Sok. No:51 (Turgut Reis Teknik Ve End�stri Meslek Lisesi Bah�esi)"));
		  
		  logo10.compress(Bitmap.CompressFormat.JPEG, 100, resim_stream10);
		  resim_byte= resim_stream10.toByteArray();
	      dbHelper.insertCountry(new Halisaha("�AVU�O�LU HALISAHA TES�SLER�", "Telefon 1: 0222 224 25 15"
                  , resim_byte,"Kapal� Saha","Osmangazi Mah. Bas�n �ehitleri Cad. Orhangazi �lk��retim Okul Bah�esi"));
	      
	      SharedPreferences.Editor editor = settings.edit();
	      editor.putBoolean("firstTime", false);
	      editor.commit(); 
	      
	      deleteFile("cavusoglu.jpg");
	    }
	    
	    List<Halisaha> halisahalar = dbHelper.ButunHalisahalariGetir();
	    ListViewAdapter list_adapter = new ListViewAdapter(MainActivity.this, halisahalar);
	    listemiz.setAdapter(list_adapter);
	    listemiz.setOnItemClickListener(new OnItemClickListener() {
	         @Override
	         public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
	            Toast.makeText(getApplicationContext(),
	                           ((Halisaha) listemiz.getAdapter().getItem(position)).TelefonGetir()+" "+((Halisaha) listemiz.getAdapter().getItem(position)).SahaGetir()+" "+((Halisaha) listemiz.getAdapter().getItem(position)).AdresGetir(),
	                           Toast.LENGTH_LONG).show();
	         }
	      });

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	
}
