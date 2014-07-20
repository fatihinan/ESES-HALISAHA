
package com.example.eseshalisaha;

import java.io.Serializable;

public class Halisaha implements Serializable {

   private static final long serialVersionUID = 1L;

   private int               id;

   private String            halisaha_isim;

   private String            halisaha_telefon;
   
   private byte[]            halisaha_logo;
   
   private String            halisaha_sahalar;
   
   private String            halisaha_adres;

   public Halisaha() {
      super();
   }

   public Halisaha(String halisaha_isim, String halisaha_telefon, byte[] halisaha_logo, String halisaha_sahalar, String halisaha_adres) {
      super();
      this.halisaha_isim = halisaha_isim;
      this.halisaha_telefon = halisaha_telefon;
      this.halisaha_logo = halisaha_logo;
      this.halisaha_sahalar = halisaha_sahalar;
      this.halisaha_adres = halisaha_adres;
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

   public void LogoAl(byte[] halisaha_logo) {
       this.halisaha_logo = halisaha_logo;
   }
   
   public byte[] LogoGetir() {
       return halisaha_logo;
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
}
