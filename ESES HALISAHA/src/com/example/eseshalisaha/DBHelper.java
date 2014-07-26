
package com.example.eseshalisaha;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {

   private static final String DATABASE_ISIM   = "EsEsHalisahaUygulamasi";

   private static final String TABLO_HALISAHALAR = "halisahalar";

   public DBHelper(Context context) {
      super(context, DATABASE_ISIM, null, 1);
   }

   @Override
   public void onCreate(SQLiteDatabase db) {
      String sql = "CREATE TABLE " + TABLO_HALISAHALAR + "(id INTEGER PRIMARY KEY, halisaha_isim TEXT, halisaha_telefon TEXT," +
      		       "halisaha_sahalar TEXT, halisaha_adres TEXT, halisaha_enlem TEXT, halisaha_boylam TEXT " + ")";
      Log.d("DBHelper", "SQL : " + sql);
      db.execSQL(sql);
   }

   @Override
   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
      db.execSQL("DROP TABLE IF EXISTS " + TABLO_HALISAHALAR);
      onCreate(db);
   }

   public void insertCountry(Halisaha saha) {
      SQLiteDatabase db = this.getWritableDatabase();

      ContentValues values = new ContentValues();
      values.put("halisaha_isim", saha.IsimGetir());
      values.put("halisaha_telefon", saha.TelefonGetir());
      values.put("halisaha_sahalar", saha.SahaGetir());
      values.put("halisaha_adres", saha.AdresGetir());
      values.put("halisaha_enlem", saha.EnlemGetir());
      values.put("halisaha_boylam", saha.BoylamGetir());
      
      db.insert(TABLO_HALISAHALAR, null, values);
      db.close();
   }

   public List<Halisaha> ButunHalisahalariGetir() {
      List<Halisaha> halisahalar = new ArrayList<Halisaha>();
      SQLiteDatabase db = this.getWritableDatabase();

      Cursor cursor = db.query(TABLO_HALISAHALAR, new String[]{"id", "halisaha_isim", "halisaha_telefon", "halisaha_sahalar", "halisaha_adres"}, null, null, null, null, null);
      while (cursor.moveToNext()) {
    	  Halisaha saha = new Halisaha();
         saha.IdAl(cursor.getInt(0));
         saha.IsimAl(cursor.getString(1));
         saha.TelefonAl(cursor.getString(2));
         saha.SahaAl(cursor.getString(3));
         saha.AdresAl(cursor.getString(4));
         halisahalar.add(saha);
      }
      return halisahalar;
   }
   
   
   
   
// Getting single contact
   Halisaha getContact(int id) {
       SQLiteDatabase db = this.getReadableDatabase();

       Cursor cursor = db.query(TABLO_HALISAHALAR, new String[]{"id", "halisaha_isim", "halisaha_telefon", "halisaha_sahalar", "halisaha_adres", "halisaha_enlem", "halisaha_boylam"}, "id" + "=?", new String[]{String.valueOf(id)}, null, null, null, null);

       if (cursor != null)
           cursor.moveToFirst();

       Halisaha saha = new Halisaha();
       saha.IdAl(cursor.getInt(0));
       saha.IsimAl(cursor.getString(1));
       saha.TelefonAl(cursor.getString(2));
       saha.SahaAl(cursor.getString(3));
       saha.AdresAl(cursor.getString(4));
       saha.EnlemAl(cursor.getString(5));
       saha.BoylamAl(cursor.getString(6));
       
       return saha;

   }

}
