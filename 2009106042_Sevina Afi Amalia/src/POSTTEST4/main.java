package POSTTEST4;

import java.util.ArrayList;
import java.util.Scanner;
public class main {
    static Scanner inputint = new Scanner(System.in);
    static Scanner inputstr = new Scanner(System.in);
    static ArrayList lagu = new ArrayList<>();
    static ArrayList penyanyi = new ArrayList<>();

    public static void main(String[] args) {
        awal();
    }

    static void list_lagu(){
        traitor song = new traitor("Traitor", "Olivia Rodrigo", "Pop", "2021");
       
        peaches song1 = new peaches("Peaches","Justin Bieber", "R&B", "2021" );
        
        lagu song2 = new lagu("Monokrom", "Tulus", "Pop","2016" );
        
        song.tampil(6);
        song.nyalakanLagu();
        System.out.println("===================");
        
        song1.tampil();
        song1.matikanLagu();
        System.out.println("===================");
        
        song2.tampil();
        song2.matikanLagu();
        System.out.println("===================");
        
    }
    
    static void awal(){
        System.out.println("-----------------------");
        System.out.println("-----PLAYLIST LAGU-----");
        System.out.println("|   1. Tambah Lagu    |");
        System.out.println("|   2. Lihat Lagu     |");
        System.out.println("|   3. Hapus Lagu     |");
        System.out.println("|   4. Edit Lagu      |");
        System.out.println("|   5. Keluar         |");
        System.out.println("-----------------------");
        System.out.print("  Pilih Menu  :");
        String menu = inputstr.nextLine();
        if (menu.equals("1")){
            tambah_lagu();
            backToMenu();
        }else if (menu.equals("2")){
            list_lagu();
            backToMenu();
        }else if (menu.equals("3")){
            hapus_lagu();
            backToMenu();
        }else if (menu.equals("4")){
            edit_lagu();
            backToMenu();
        }else if (menu.equals("5")){
            keluar();
        }else{
            System.out.println("Inputan salah. Coba lagi!!");
            backToMenu();
        }
    }

    static void backToMenu() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        inputstr.nextLine();
        awal();
}
    static void tambah_lagu(){
        list_lagu();
        System.out.println("================================");
        System.out.print("Ingin berapa lagu : ");
        int banyak_lagu = inputint.nextInt();
        for(int h = 0; h < banyak_lagu; h++){
            System.out.print("Masukkan Judul lagu   : ");
            String judul_lagu = inputstr.nextLine();
            lagu.add(judul_lagu);

            System.out.print("Masukkan Penyanyi : ");
            String pny = inputstr.nextLine();
            penyanyi.add(pny);  
        }  
    }
    static void edit_lagu(){
        list_lagu();
        System.out.print("Ingin ubah lagu ke-");
        int edit = inputint.nextInt();
        System.out.print("Masukkan Judul lagu: ");
        String edit_judul = inputstr.nextLine();

        System.out.print("Masukkan Penyanyi: ");
        String edit_pny = inputstr.nextLine();

        lagu.set((edit-1), edit_judul);
        penyanyi.set((edit-1), edit_pny);

    }
    static void hapus_lagu(){
        list_lagu();
        System.out.print("Ingin ubah lagu ke-");
        int hapus = inputint.nextInt();
        System.out.println("Anda yakin ingin menghapus lagu? (y/n)");
        String hapus_ = inputstr.nextLine();
        if (hapus_ == "y"){
            lagu.remove(hapus-1);
            penyanyi.remove(hapus-1);
            System.out.println("Data telah terhapus....");
        }else{
            backToMenu();
        }
    }
    static void desc_lagu(){
        
    }
    static void keluar(){
        System.out.print("Sistem telah selesai....");
}

    }
    

