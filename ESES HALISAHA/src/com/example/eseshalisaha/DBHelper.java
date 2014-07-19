
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
      String sql = "CREATE TABLE " + TABLO_HALISAHALAR + "(id INTEGER PRIMARY KEY, halisaha_isim TEXT, halisaha_telefon TEXT, halisaha_simge BLOB" + ")";
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
      values.put("halisaha_simge", saha.SimgeGetir());
      
      db.insert(TABLO_HALISAHALAR, null, values);
      db.close();
   }

   public List<Halisaha> ButunHalisahalariGetir() {
      List<Halisaha> halisahalar = new ArrayList<Halisaha>();
      SQLiteDatabase db = this.getWritableDatabase();

      // String sqlQuery = "SELECT  * FROM " + TABLE_COUNTRIES;
      // Cursor cursor = db.rawQuery(sqlQuery, null);

      Cursor cursor = db.query(TABLO_HALISAHALAR, new String[]{"id", "halisaha_isim", "halisaha_telefon", "halisaha_simge"}, null, null, null, null, null);
      while (cursor.moveToNext()) {
    	  Halisaha saha = new Halisaha();
         saha.IdAl(cursor.getInt(0));
         saha.IsimAl(cursor.getString(1));
         saha.TelefonAl(cursor.getString(2));
         saha.SimgeAl(cursor.getBlob(3));
         halisahalar.add(saha);
      }

      return halisahalar;
   }

}