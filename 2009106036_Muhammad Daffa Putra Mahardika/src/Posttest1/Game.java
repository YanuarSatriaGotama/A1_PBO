/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest1;

/**
 *
 * @author Daffa
 */

class Game{
   private int ID;
   private String judul;
   private String platform;
   private int harga;

   Game(int ID, String judul, String platform, int harga){
      this.ID = ID;
      this.judul = judul;
      this.platform = platform;
      this.harga = harga;
   }

   public int getID(){
      return ID;
   }
   public int getHarga(){
      return harga;
   }
   public String getJudul(){
      return judul;
   }
   public String getPlatform(){
      return platform;
   }


   public String toString(){
      return ID+" "+judul+" "+platform+" "+harga;
   }
}

