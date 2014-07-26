
package com.example.eseshalisaha;

import java.io.Serializable;

public class Halisaha implements Serializable {

   private static final long serialVersionUID = 1L;

   private int               id;

   private String            halisaha_isim;

   private String            halisaha_telefon;
   
   private String            halisaha_sahalar;
   
   private String            halisaha_adres;
   
   private String            halisaha_enlem; //latitude
   
   private String            halisaha_boylam; //longitude

   public Halisaha() {
      super();
   }

   public Halisaha(String halisaha_isim, String halisaha_telefon, String halisaha_sahalar, String halisaha_adres, String halisaha_enlem, String halisaha_boylam) {
      super();
      this.halisaha_isim = halisaha_isim;
      this.halisaha_telefon = halisaha_telefon;
      this.halisaha_sahalar = halisaha_sahalar;
      this.halisaha_adres = halisaha_adres;
      this.halisaha_enlem = halisaha_enlem;
      this.halisaha_boylam = halisaha_boylam;
   }
   
   public Halisaha(int id, String halisaha_isim, String halisaha_telefon, String halisaha_sahalar, String halisaha_adres, String halisaha_enlem, String halisaha_boylam) {
	      super();
	      this.id = id;// Upgrading database
	      this.halisaha_isim = halisaha_isim;
	      this.halisaha_telefon = halisaha_telefon;
	      this.halisaha_sahalar = halisaha_sahalar;
	      this.halisaha_adres = halisaha_adres;
	      this.halisaha_enlem = halisaha_enlem;
	      this.halisaha_boylam = halisaha_boylam;
	   }

   public String TelefonGetir() {
      return halisaha_telefon;
   }

   public void TelefonAl(String halisaha_telefon) {
      this.halisaha_telefon = halisaha_telefon;
   }

   public int IdGetir() {
      return id;
   }

   public void IdAl(int id) {
      this.id = id;
   }

   public String IsimGetir() {
      return halisaha_isim;
   }

   public void IsimAl(String halisaha_isim) {
      this.halisaha_isim = halisaha_isim;
   }
   
   public String SahaGetir() {
	   return halisaha_sahalar;
   }

   public void SahaAl(String halisaha_sahalar) {
	   this.halisaha_sahalar = halisaha_sahalar;
   }
	   
   public String AdresGetir() {
	   return halisaha_adres;
   }

   public void AdresAl(String halisaha_adres) {
	   this.halisaha_adres = halisaha_adres;
   }
   
   public String EnlemGetir() {
	   return halisaha_enlem;
   }

   public void EnlemAl(String halisaha_enlem) {
	   this.halisaha_enlem = halisaha_enlem;
   }
   
   public String BoylamGetir() {
	   return halisaha_boylam;
   }

   public void BoylamAl(String halisaha_boylam) {
	   this.halisaha_boylam = halisaha_boylam;
   }
}
