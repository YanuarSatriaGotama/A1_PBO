/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to pilange this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Posttest3;

import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Daffa
 */

class Main{

    private static final List<Game> koleksi = new ArrayList<>();
//    private static ArrayList<Game> koleksi = new ArrayList<Game>();
    private static Scanner s = new Scanner(System.in);
    private static Scanner s1 = new Scanner(System.in);
    private static Iterator<Game> i = koleksi.iterator();
    private static boolean found = false;
    private static int ID ;
    private static Game dataGame;
//    private static String judul = s.nextLine();
//    private static String platform = s.nextLine();
//    private static int harga = s.nextInt();
//    private static double rating = s.nextDouble();
    
   public static void main(String[] args) {
      
//      List<Game> c = new ArrayList<Game>();
//      Scanner s = new Scanner(System.in);
//      Scanner s1 = new Scanner(System.in);
//      Game game1;

      Game dataGame = new Game(1, "The Last of Us part II", "19 Juni 2020", "PS4, PS5", 599000, 9.6); koleksi.add(dataGame);
      Game dataGame2 = new Game(2, "Red Dead Redemption 2", "6 Desember 2019", "PS4, PS5, PC, Xbox Series", 640000, 8.9); koleksi.add(dataGame2);
      Game dataGame3 = new Game(3, "Forza Horizon 5", "9 November 2021", "PS4, PS5, PC, Xbox Series", 699000, 9.2); koleksi.add(dataGame3);
      Game dataGame4 = new Game(4, "Uncharted 4: A Thief's End", "10 Mei 2016", "PS4, PS5", 299000, 8.8); koleksi.add(dataGame4);
      Game dataGame5 = new Game(5, "Mortal Kombat 11", "23 April 2019", "PS4, PS5, PC, Xbox Series", 559000, 9.3); koleksi.add(dataGame5);
      

      int pil;
      do{
         System.out.println("+====================================+");
         System.out.println("|----------Sistem Data Game----------|");
         System.out.println("+====================================+");
         System.out.println("| [1] Lihat Data Game                |");
         System.out.println("| [2] Tambah Data Game               |");
         System.out.println("| [3] Cari Data Game                 |");
         System.out.println("| [4] Hapus Data Game                |");
         System.out.println("| [5] Perbarui Data Game             |");
         System.out.println("| [0] Keluar                         |");
         System.out.println("+====================================+");
         System.out.print("Pilih [1-5] : ");
         pil = s.nextInt();
         System.out.print("\n");

         switch(pil){
            case 1 -> lihat();
            
            case 2 -> tambah();
            
            case 3 -> cari();

            case 4 -> hapus();
            
            case 5 -> perbarui();
            
            
            case 0 -> System.out.println("Terima kasih (^-^)");

            
         }
      }while(pil!=0);
   }
   
   
public static void lihat(){
    System.out.println("+====================================+");
    System.out.println("|--------------Data Game-------------|");
    System.out.println("+====================================+");
//        Iterator<Game> i = c.iterator();

//               c = Game.();
    for (Game dataGame : koleksi) {
        System.out.println(" ");
        System.out.println("   ID       : " + dataGame.getID());
        System.out.println("   Judul    : " + dataGame.getJudul());
        System.out.println("   Rilis    : " + dataGame.getRilis());
        System.out.println("   Platform : " + dataGame.getPlatform());
        System.out.println("   Harga    : " + dataGame.getHarga());
        System.out.println("   Rating   : " + dataGame.getRating());
    }
//               while(i.hasNext()){
//                  Game e = i.next(); 
//                  System.out.println(e);
//               }
    System.out.println("+====================================+\n");
    
}
   
   
public static void tambah() {

    System.out.print("Masukkan ID       : ");
    int no = s.nextInt();
    System.out.print("Masukkan judul    : ");
    String judul = s1.nextLine();
    System.out.print("Masukkan rilis    : ");
    String rilis = s1.nextLine();
    System.out.print("Masukkan platform : ");
    String platform = s1.nextLine();
    System.out.print("Masukkan harga    : ");    
    int harga = s.nextInt();
    System.out.print("Masukkan rating   : ");    
    double rating = s.nextDouble();
//               System.out.print(" ");

//    koleksi.add(new Game(no,judul,rilis,platform,harga,rating));
    
    dataGame = new Game(no,judul,rilis,platform,harga,rating);
    koleksi.add(dataGame);
    System.out.println("\tData berhasil ditambah...!\n");
 }


public static void cari(){  
    found = false;
    System.out.print("Masukkan ID yang ingin di cari :");
    ID = s.nextInt();
    System.out.println("+====================================+");
    i = koleksi.iterator();
    while(i.hasNext()){
       Game dataGame = i.next();
       if(dataGame.getID() == ID)  {
//          System.out.println(x);
          System.out.println("   ID       : " + dataGame.getID());
          System.out.println("   Judul    : " + dataGame.getJudul());
          System.out.println("   Rilis    : " + dataGame.getRilis());
          System.out.println("   Platform : " + dataGame.getPlatform());
          System.out.println("   Harga    : " + dataGame.getHarga());
          System.out.println("   Rating   : " + dataGame.getRating());

          found = true;
       }
    }

    if(!found){
       System.out.println("Data tidak ditemukan\n");
    }
    System.out.println("+====================================+\n");
    
}

public static void hapus(){
    lihat();
    found = false;
    System.out.print("Masukkan ID data yang ingin dihapus :");
    ID = s.nextInt();
    System.out.println("+====================================+");
    i = koleksi.iterator();
    while(i.hasNext()){
       Game dataGame = i.next();
       if(dataGame.getID() == ID)  {
          i.remove();
          found = true;
       }
    }

    if(!found){
       System.out.println("Data tidak ditemukan\n");
    }else{
       System.out.println("\tData berhasil dihapus...!\n");
    }

    System.out.println("+====================================+\n");
     
    
}


public static void perbarui(){
    lihat();
    found = false;
    System.out.print("Masukkan ID data yang akan diperbarui :");
    ID = s.nextInt();

    ListIterator<Game>li = koleksi.listIterator();
    while(li.hasNext()){
       Game dataGame = li.next();
       if(dataGame.getID() == ID)  {
          System.out.print("Masukkan judul    : ");
          String judul = s1.nextLine();
          
          System.out.print("Masukkan rilis    : ");
          String rilis = s1.nextLine();

          System.out.print("Masukkan platform : ");
          String platform = s1.nextLine();

          System.out.print("Masukkan harga    : ");
          int harga = s.nextInt();

          System.out.print("Masukkan rating   : ");
          double rating = s.nextDouble();
          
          dataGame.setJudul(judul);
          dataGame.setRilis(rilis);
          dataGame.setPlatform(platform);
          dataGame.setHarga(harga);
          dataGame.setRating(rating);
          

//          li.set(new Game(ID,judul,rilis,platform,harga,rating));
          found = true;
       }
    }

    if(!found){
       System.out.println("Data tidak ditemukan");
    }else{
       System.out.println("Data berhasil diperbarui...!\n");
    } 
    
  }
   

}