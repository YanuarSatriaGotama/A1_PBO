/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to pilange this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Posttest1;

import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Daffa
 */

class Main{
   public static void main(String[] args) {
      
      List<Game> c = new ArrayList<Game>();
      Scanner s = new Scanner(System.in);
      Scanner s1 = new Scanner(System.in);
      Game g;

      g = new Game(1, "The Last of Us part II", "PS4, PS5", 360000);
      c.add(g);

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
            case 1:
               System.out.println("+====================================+");
               System.out.println("|--------------Data Game-------------|");
               System.out.println("+====================================+");
               Iterator<Game> i = c.iterator();
               
//               c = Game.();
               for (Game game : c) {
                   System.out.println(" ");
                   System.out.println("   ID       : " + game.getID());
                   System.out.println("   Judul    : " + game.getJudul());
                   System.out.println("   Platform : " + game.getPlatform());
                   System.out.println("   Harga    : " + game.getHarga());
               }
//               while(i.hasNext()){
//                  Game e = i.next(); 
//                  System.out.println(e);
//               }
               System.out.println("+====================================+\n");
            break;
            
            case 2:
               
               
               System.out.print("Masukkan ID       : ");
               int no = s.nextInt();
               System.out.print("Masukkan judul    : ");
               String judul = s1.nextLine();
               System.out.print("Masukkan platform : ");
               String platform = s1.nextLine();
               System.out.print("Masukkan harga    : ");
               int harga = s.nextInt();
//               System.out.print(" ");

               c.add(new Game(no,judul,platform,harga));
            break;
            
            case 3:
               boolean found = false;
               System.out.print("Masukkan ID yang ingin di cari :");
               int ID = s.nextInt();
               System.out.println("+====================================+");
               i = c.iterator();
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
            break;

            case 4:
               found = false;
               System.out.print("Masukkan ID data yang ingin dihapus :");
               ID = s.nextInt();
               System.out.println("+====================================+");
               i = c.iterator();
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
            break;
            
            case 5:
               found = false;
               System.out.print("Masukkan ID data yang akan diperbarui :");
               ID = s.nextInt();
               
               ListIterator<Game>li = c.listIterator();
               while(li.hasNext()){
                  Game e = li.next();
                  if(e.getID() == ID)  {
                     System.out.print("Masukkan judul    : ");
                     judul = s1.nextLine();

                     System.out.print("Masukkan Platform : ");
                     platform = s1.nextLine();
                     
                     System.out.print("Masukkan Harga    : ");
                     harga = s.nextInt();
                     
                     li.set(new Game(ID,judul,platform,harga));
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Data tidak ditemukan");
               }else{
                  System.out.println("Data berhasil diperbarui...!\n");
               }
               
            break;
            
            
            case 0:
              System.out.println("Terima kasih (^-^)");
               
            break;

            
         }
      }while(pil!=0);
   }
   

}
