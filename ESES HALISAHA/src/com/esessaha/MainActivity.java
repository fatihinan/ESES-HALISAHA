package com.esessaha;


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
import com.esessaha.R;

public class MainActivity extends Activity {

	final List<Halisaha> halisahalar =new ArrayList<Halisaha>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final ListView listemiz = (ListView) findViewById(R.id.liste);
		final DBHelper dbHelper = new DBHelper(getApplicationContext());
        SharedPreferences settings = getSharedPreferences("SQL", 0);
		listemiz.setBackgroundResource(R.drawable.arayuz1);
        boolean firstTime = settings.getBoolean("firstTime", true);
	    if (firstTime) {
	    	
		  dbHelper.insertCountry(new Halisaha("DEMÝRSPOR ALTYAPI ve HALI SAHA TESÝSLERÝ",
				  "Telefon: 0222 224 24 10",
                  "Açýk Saha",
                  "Hoþnudiye Mah. Basýn Þehitleri Cad. Tülomsaþ Lojmanlarý Yaný",
                  "39.773414",
                  "30.493933"));
		  
	      dbHelper.insertCountry(new Halisaha("ATATÜRK TEKNÝK ve ENDÜSTRÝ MESLEK LÝSESÝ",
	    		  "Telefon: 0222 230 15 67",
                  "Açýk Saha",
                  "M.Kemal Atatürk Cad. No:55 Odunpazarý",
                  "39.768417",
                  "30.514607"));
	      
	      dbHelper.insertCountry(new Halisaha("ES PLANET PARK",
	    		  "Telefon 1: 0222 239 21 21 - Telefon 2: 0222 229 31 64",
                  "Açýk Saha," + " Kapalý Saha",
                  "Yenikent Mh. Kaymaz Sk. No:36",
                  "39.749374",
                  "30.515395"));
	      
	      dbHelper.insertCountry(new Halisaha("FETHÝ HEPER HALI SAHA",
	    		  "Telefon: 0222 237 30 03",
                  "Açýk Saha 1, Açýk Saha 2",
                  "Ankara Yolu 71 Evler Kavþaðý",
                  "39.753725",
                  "30.589974"));
	      
		  dbHelper.insertCountry(new Halisaha("ESSPOR SPOR TESÝSLERÝ",
				  "Telefon: 0222 245 02 45",
                  "Açýk Saha, " + "Kapalý Saha",
                  "Vadiþehir Mah. Uluaðaç Sk. No:4/A (Ýsmar Yaný) Odunpazarý",
                  "39.739184",
                  "30.547008"));
		  
	      dbHelper.insertCountry(new Halisaha("ESBAY HALI SAHA",
	    		  "Telefon: 0222 335 60 70",
                  "Açýk Saha 1, Açýk Saha 2",
                  "Yenibaðlar Mah. Üniversite Cad. Yorulmaz Sk. No:1/A",
                  "39.788657",
                  "30.504985"));
	      
	      dbHelper.insertCountry(new Halisaha("EKOL HALI SAHA",
	    		  "Telefon 1: 0222 320 36 20 - Telefon 2: 0505 599 76 64",
                  "Açýk Saha",
                  "Ertuðrulgazi Mah. Ayþen Sk. No:20 (ACI BADEM HASTANESÝ ARKASI)",
                  "39.782716",
                  "30.494037"));
	      
	      dbHelper.insertCountry(new Halisaha("SPORLAND HALI SAHA",
	    		  "---",
                  "Açýk Saha 1, Açýk Saha 2",
                  "Büyükdere Mah. Balözü Sk. No:5 (Cemevi Arkasý)",
                  "39.753053",
                  "30.505735"));
	      
	      
		  dbHelper.insertCountry(new Halisaha("SPORTMEN CLUP",
				  "Telefon 1: 0222 227 00 61 - Telefon 2: 0546 826 26 06",
                  "Açýk Saha 1,Açýk Saha 2,Kapalý Saha",
                  "Gökmeydan Mah. Kaðýthane Sk. No:51 (Turgut Reis Teknik Ve Endüstri Meslek Lisesi Bahçesi)",
                  "39.769941",
                  "30.553494"));
		  
		 
	      dbHelper.insertCountry(new Halisaha("ÇAVUÞOÐLU HALISAHA TESÝSLERÝ", 
	    		  "Telefon: 0222 224 25 15",
                  "Kapalý Saha",
                  "Osmangazi Mah. Basýn Þehitleri Cad. Orhangazi ÝlkÖðretim Okul Bahçesi",
                  "39.769655",
                  "30.484286"));
	      
	      dbHelper.insertCountry(new Halisaha("ÞAH HALI SAHA", 
	    		  "---",
                  "Kapalý Saha",
                  "Ihlamurken Mah. Kartopu Cad. No:75 Tilla AVM Yaný",
                  "39.741229",
                  "30.532014"));
	      
	      dbHelper.insertCountry(new Halisaha("ÇAVUÞOÐLU ÖMÜR TESÝSÝ", 
	    		  "---",
                  "Kapalý Saha",
                  "Ömür Mah. Çember Sk. Kütayha Yolu",
                  "39.749722",
                  "30.459362"));
	      
	      dbHelper.insertCountry(new Halisaha("ÞEKERSPOR HALI SAHA", 
	    		  "Telefon: 0 222 230 27 44",
                  "Açýk Saha",
                  "Þeker Fabrikasý Lojmanlarý",
                  "39.775948",
                  "30.539013"));
	      
	      dbHelper.insertCountry(new Halisaha("1965 EFSANE HALI SAHA", 
	    		  "Telefon 1: 0222 320 30 03 - Telefon 2: 0533 762 99 77",
                  "Açýk Saha",
                  "Uluönder Mah. Cansen Sk. No:5 TEPEBAÞI",
                  "39.786051",
                  "30.492492"));
	      
	      dbHelper.insertCountry(new Halisaha("GALÝP TÜRKAN HALI SAHA", 
	    		  "Telefon: 0222 320 03 33",
                  "Açýk Saha",
                  "Ýsmet Ýnönü 2 Caddesi ( Ford - Opet Birmot Karþýsý)",
                  "39.790119",
                  "30.480504"));
	      
	      dbHelper.insertCountry(new Halisaha("ES ES HALI SAHA", 
	    		  "Telefon 1:  0546 546 81 26 - Telefon 2: 0555 386 12 08",
                  "Açýk Saha",
                  "Viþnelik Mah. Erenkuþ Sk. (kanlýkavak parký yaný)",
                  "39.768486",
                  "30.496648"));
	      
	      dbHelper.insertCountry(new Halisaha("DENÝZ HALI SAHA", 
	    		  "Telefon: 0222 225 11 88",
                  "Açýk Saha",
                  " Viþnelik Mah. Seda Sk. Odunpazarý",
                  "39.766014",
                  "30.504178"));
	      
	      dbHelper.insertCountry(new Halisaha("ESKÝÞEHÝR HALI SAHA TESÝSLERÝ - ESKÝÞEHÝR OSMANGAZÝ ÜNÝVERSÝTESÝ",
	    		  "Telefon 1: 0222 239 37 50 - Dahili: 1369",
                  "Açýk Saha 1, Açýk Saha 2, Kapalý Saha",
                  "Meþelik Kampüsü Büyükdere Mah. Odunpazarý",
                  "39.750411",
                  "30.478344"));

	      
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

	            Intent intent = new Intent(MainActivity.this, Ayrintilar.class);
	            intent.putExtra("position", position);
	            MainActivity.this.startActivity(intent);
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
