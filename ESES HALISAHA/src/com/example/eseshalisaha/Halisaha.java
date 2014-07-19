
package com.example.eseshalisaha;

import java.io.Serializable;

public class Halisaha implements Serializable {

   private static final long serialVersionUID = 1L;

   private int               id;

   private String            halisaha_isim;

   private String            halisaha_telefon;
   
   private byte[]            simge;

   public Halisaha() {
      super();
   }

   public Halisaha(String halisaha_isim, String halisaha_telefon, byte[] simge) {
      super();
      this.halisaha_isim = halisaha_isim;
      this.halisaha_telefon = halisaha_telefon;
      this.simge = simge;
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

   public void SimgeAl(byte[] bs) {
       this.simge = bs;
   }
   
   public byte[] SimgeGetir() {
       return simge;
   }
}
