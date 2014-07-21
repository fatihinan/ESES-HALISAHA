package com.example.eseshalisaha;


import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
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
	    	
		  dbHelper.insertCountry(new Halisaha("DEMÝRSPOR ALTYAPI ve HALI SAHA TESÝSLERÝ", "Telefon 1: 0 222 224 24 10"
                  ,"Açýk Saha 1","Hoþnudiye Mah. Basýn Þehitleri Cad. Tülomsaþ Lojmanlarý Yaný"));
		  
	      dbHelper.insertCountry(new Halisaha("ATATÜRK TEKNÝK VE ENDÜSTRÝ MESLEK LÝSESÝ", "Telefon 1: 0222 230 15 67"
                  ,"Açýk Saha 1","M.Kemal Atatürk Cad. No:55 Odunpazarý"));
	      
	      dbHelper.insertCountry(new Halisaha("ES PLANET PARK", "Telefon 1: 0222 239 21 21 Telefon 2: 0222 229 31 64"
                  ,"Açýk Saha 1, Kapalý Saha 1","Yenikent Mh. Kaymaz Sk. No:36"));
	      
	      dbHelper.insertCountry(new Halisaha("FETHÝ HEPER HALI SAHA", "Telefon 1: 0222 237 30 03"
                  ,"Açýk Saha 1, Açýk Saha 2","Ankara Yolu 71 Evler Kavþaðý"));
	      
		  dbHelper.insertCountry(new Halisaha("ESSPOR SPOR TESÝSLERÝ", "Telefon 1: 0222 245 02 45"
                  ,"Açýk Saha 1,  Kapalý Saha 1","Vadiþehir Mahallesi Uluaðaç Sokak No:4 / A (Ýsmar Yaný) Odunpazarý"));
		  
	      dbHelper.insertCountry(new Halisaha("ESBAY HALI SAHA", "Telefon 1: 0222 335 60 70"
                  , "Açýk Saha 1, Açýk Saha 2","Yenibaðlar Mah. Üniversite Cad. Yorulmaz Sk. No 1 A"));
	      
	      dbHelper.insertCountry(new Halisaha("EKOL HALI SAHA", "Telefon 1: 0 222 320 36 20, Telefon 2 0505 599 76 64"
                  ,"Açýk Saha 1","Ertuðrulgazi Mah. Ayþen Sok. No:20 (ACI BADEM HASTANESÝ ARKASI)"));
	      
	      dbHelper.insertCountry(new Halisaha("SPORLAND HALI SAHA", "-"
                  ,"Açýk Saha 1, Açýk Saha 2","Büyükdere Mah. Balözü Sok. No:5 (Cemevi Arkasý)"));
	      
	      
		  dbHelper.insertCountry(new Halisaha("SPORTMEN CLUP", "Telefon 1: 0222 227 00 61 Telefon 2: 0546 826 26 06"
                  ,"Açýk Saha 1,Açýk Saha 2,Kapalý Saha 1","Gökmeydan Mah. Kaðýthane Sok. No:51 (Turgut Reis Teknik Ve Endüstri Meslek Lisesi Bahçesi)"));
		  
		 
	      dbHelper.insertCountry(new Halisaha("ÇAVUÞOÐLU HALISAHA TESÝSLERÝ", "Telefon 1: 0222 224 25 15"
                  ,"Kapalý Saha","Osmangazi Mah. Basýn Þehitleri Cad. Orhangazi ÝlkÖðretim Okul Bahçesi"));
	      
	      SharedPreferences.Editor editor = settings.edit();
	      editor.putBoolean("firstTime", false);
	      editor.commit(); 
	      
	    }
	    
	    List<Halisaha> halisahalar = dbHelper.ButunHalisahalariGetir();
	    ListViewAdapter list_adapter = new ListViewAdapter(MainActivity.this, halisahalar);
	    listemiz.setAdapter(list_adapter);
	    listemiz.setOnItemClickListener(new OnItemClickListener() {
	         @Override
	         public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
//	            Toast.makeText(getApplicationContext(),
//	                           ((Halisaha) listemiz.getAdapter().getItem(position)).TelefonGetir()+" "+((Halisaha) listemiz.getAdapter().getItem(position)).SahaGetir()+" "+((Halisaha) listemiz.getAdapter().getItem(position)).AdresGetir(),
//	                           Toast.LENGTH_LONG).show();

	            Intent myIntent = new Intent(MainActivity.this, Ayrintilar.class);
	            MainActivity.this.startActivity(myIntent);
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
