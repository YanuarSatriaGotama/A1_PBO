/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to pilange this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Posttest2;

import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Daffa
 */

class Main{

    private static final List<Game> koleksi = new ArrayList<>();
    private static Scanner s = new Scanner(System.in);
    private static Scanner s1 = new Scanner(System.in);
    private static Iterator<Game> i = koleksi.iterator();
    private static boolean found = false;
    private static int ID ;
//    private static String judul = s.nextLine();
//    private static String platform = s.nextLine();
//    private static int harga = s.nextInt();
//    private static double rating = s.nextDouble();
    
   public static void main(String[] args) {
      
//      List<Game> c = new ArrayList<Game>();
//      Scanner s = new Scanner(System.in);
//      Scanner s1 = new Scanner(System.in);
//      Game game1;

      Game game1 = new Game(1, "The Last of Us part II", "19 juni 2020", "PS4, PS5", 360000, 9.4);
      koleksi.add(game1);


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
    for (Game game : koleksi) {
        System.out.println(" ");
        System.out.println("   ID       : " + game.getID());
        System.out.println("   Judul    : " + game.getJudul());
        System.out.println("   Rilis    : " + game.getRilis());
        System.out.println("   Platform : " + game.getPlatform());
        System.out.println("   Harga    : " + game.getHarga());
        System.out.println("   Rating   : " + game.getRating());
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

    koleksi.add(new Game(no,judul,rilis,platform,harga,rating));
 }


public static void cari(){  
//    boolean found = false;
    System.out.print("Masukkan ID yang ingin di cari :");
//    int ID = s.nextInt();
    System.out.println("+====================================+");
    i = koleksi.iterator();
    while(i.hasNext()){
       Game e = i.next();
       if(e.getID() == ID)  {
          System.out.println(e);
          found = true;
       }
    }

    if(!found){
       System.out.println("Data tidak ditemukan\n");
    }
    System.out.println("+====================================+\n");
    
}

public static void hapus(){
    found = false;
    System.out.print("Masukkan ID data yang ingin dihapus :");
    ID = s.nextInt();
    System.out.println("+====================================+");
    i = koleksi.iterator();
    while(i.hasNext()){
       Game e = i.next();
       if(e.getID() == ID)  {
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
   found = false;
    System.out.print("Masukkan ID data yang akan diperbarui :");
    ID = s.nextInt();

    ListIterator<Game>li = koleksi.listIterator();
    while(li.hasNext()){
       Game e = li.next();
       if(e.getID() == ID)  {
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

          li.set(new Game(ID,judul,rilis,platform,harga,rating));
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