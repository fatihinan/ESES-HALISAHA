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
	    	
		  dbHelper.insertCountry(new Halisaha("DEM�RSPOR ALTYAPI ve HALI SAHA TES�SLER�",
				  "Telefon: 0222 224 24 10",
                  "A��k Saha",
                  "Ho�nudiye Mah. Bas�n �ehitleri Cad. T�lomsa� Lojmanlar� Yan�",
                  "39.770123",
                  "30.484476"));
		  
	      dbHelper.insertCountry(new Halisaha("ATAT�RK TEKN�K ve END�STR� MESLEK L�SES�",
	    		  "Telefon: 0222 230 15 67",
                  "A��k Saha",
                  "M.Kemal Atat�rk Cad. No:55 Odunpazar�",
                  "39.768911",
                  "30.515008"));
	      
	      dbHelper.insertCountry(new Halisaha("ES PLANET PARK",
	    		  "Telefon 1: 0222 239 21 21 - Telefon 2: 0222 229 31 64",
                  "A��k Saha," + " Kapal� Saha",
                  "Yenikent Mh. Kaymaz Sk. No:36",
                  "39.749309",
                  "30.515755"));
	      
	      dbHelper.insertCountry(new Halisaha("FETH� HEPER HALI SAHA",
	    		  "Telefon: 0222 237 30 03",
                  "A��k Saha 1, A��k Saha 2",
                  "Ankara Yolu 71 Evler Kav�a��",
                  "39.757993",
                  "30.581458"));
	      
		  dbHelper.insertCountry(new Halisaha("ESSPOR SPOR TES�SLER�",
				  "Telefon: 0222�245 02 45",
                  "A��k Saha, " + "Kapal� Saha",
                  "Vadi�ehir Mah. Ulua�a� Sk. No:4/A (�smar Yan�) Odunpazar�",
                  "39.746558",
                  "30.539623"));
		  
	      dbHelper.insertCountry(new Halisaha("ESBAY HALI SAHA",
	    		  "Telefon:�0222 335 60 70",
                  "A��k Saha 1, A��k Saha 2",
                  "Yeniba�lar Mah. �niversite Cad. Yorulmaz Sk. No:1/A",
                  "39.788487",
                  "30.505052"));
	      
	      dbHelper.insertCountry(new Halisaha("EKOL HALI SAHA",
	    		  "Telefon 1: 0222 320 36 20 - Telefon 2: 0505 599 76 64",
                  "A��k Saha",
                  "Ertu�rulgazi Mah. Ay�en Sk. No:20 (ACI BADEM HASTANES� ARKASI)",
                  "39.782728",
                  "30.493726"));
	      
	      dbHelper.insertCountry(new Halisaha("SPORLAND HALI SAHA",
	    		  "---",
                  "A��k Saha 1, A��k Saha 2",
                  "B�y�kdere Mah. Bal�z� Sk. No:5 (Cemevi Arkas�)",
                  "39.752901",
                  "30.506540"));
	      
	      
		  dbHelper.insertCountry(new Halisaha("SPORTMEN CLUP",
				  "Telefon 1: 0222 227 00 61 - Telefon 2: 0546 826 26 06",
                  "A��k Saha 1,A��k Saha 2,Kapal� Saha",
                  "G�kmeydan Mah. Ka��thane Sk. No:51 (Turgut Reis Teknik Ve End�stri Meslek Lisesi Bah�esi)",
                  "39.769543",
                  "30.553853"));
		  
		 
	      dbHelper.insertCountry(new Halisaha("�AVU�O�LU HALISAHA TES�SLER�", 
	    		  "Telefon: 0222 224 25 15",
                  "Kapal� Saha",
                  "Osmangazi Mah. Bas�n �ehitleri Cad. Orhangazi �lk��retim Okul Bah�esi",
                  "39.770048",
                  "30.484357"));
	      
	      dbHelper.insertCountry(new Halisaha("�AH HALI SAHA", 
	    		  "---",
                  "Kapal� Saha",
                  "Ihlamurken Mah. Kartopu Cad. No:75 Tilla AVM Yan�",
                  "39.741229",
                  "30.532014"));
	      
	      dbHelper.insertCountry(new Halisaha("�AVU�O�LU �M�R TES�S�", 
	    		  "---",
                  "Kapal� Saha",
                  "�m�r Mah. �ember Sk. K�tayha Yolu",
                  "39.750180",
                  "30.459947"));
	      
	      dbHelper.insertCountry(new Halisaha("�EKERSPOR HALI SAHA", 
	    		  "Telefon: 0 222 230 27 44",
                  "A��k Saha",
                  "�eker Fabrikas� Lojmanlar�",
                  "39.775888",
                  "30.539940"));
	      
	      dbHelper.insertCountry(new Halisaha("1965 EFSANE HALI SAHA", 
	    		  "Telefon 1: 0222 320 30 03 - Telefon 2: 0533 762 99 77",
                  "A��k Saha",
                  "Ulu�nder Mah. Cansen Sk. No:5 TEPEBA�I",
                  "39.783996",
                  "30.488753"));
	      
	      dbHelper.insertCountry(new Halisaha("GAL�P T�RKAN HALI SAHA", 
	    		  "Telefon: 0222 320 03 33",
                  "A��k Saha",
                  "�smet �n�n� 2 Caddesi ( Ford - Opet Birmot Kar��s�)",
                  "39.790118",
                  "30.480757"));
	      
	      dbHelper.insertCountry(new Halisaha("ES ES HALI SAHA", 
	    		  "Telefon 1:  0546 546 81 26 - Telefon 2: 0555 386 12 08",
                  "A��k Saha",
                  "Vi�nelik Mah. Erenku� Sk. (kanl�kavak park� yan�)",
                  "39.768490",
                  "30.496666"));
	      
	      dbHelper.insertCountry(new Halisaha("DEN�Z HALI SAHA", 
	    		  "Telefon: 0222 225 11 88",
                  "A��k Saha",
                  " Vi�nelik Mah. Seda Sk. Odunpazar�",
                  "39.766021",
                  "30.504270"));
	      
	      dbHelper.insertCountry(new Halisaha("ESK��EH�R HALI SAHA TES�SLER� - ESK��EH�R OSMANGAZ� �N�VERS�TES�",
	    		  "Telefon 1: 0222 239 37 50 - Telefon 2:0222 239 13 69",
                  "A��k Saha 1, A��k Saha 2, Kapal� Saha",
                  "Me�elik Kamp�s� B�y�kdere Mah. Odunpazar�",
                  "39.750414",
                  "30.478301"));

	      
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
