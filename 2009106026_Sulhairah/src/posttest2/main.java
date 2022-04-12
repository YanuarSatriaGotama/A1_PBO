/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest2;

/**
 *
 * @author Windows10
 */
import java.util.Scanner;
import java.util.ArrayList;


public class main{
    static Scanner pint = new Scanner(System.in);
    static Scanner inputstr = new Scanner (System.in);
    static ArrayList relawan1 = new ArrayList<>();
    static ArrayList devisi_relawan = new ArrayList<>();
    static ArrayList notelp = new ArrayList<>();
    static ArrayList email = new ArrayList<>();
    
    
    public static void main(String[]args){
        menuawal();
    }
    static void kondisirelawan(){
        relawan hera = new relawan("hera", "kesehatan", "hera@gmail", "samrinda");
        relawan lela = new relawan("lela", "masyarakat", "lela@gmail", "Sangatta");
       
        System.out.println("===================");
        System.out.println(hera.nama);
        System.out.println(hera.devisirelawan);
        System.out.println(hera.emailrelawan);
        System.out.println(hera.alamat);
        hera.masaaktif();
        System.out.println("===================");
        System.out.println(lela.nama);
        System.out.println(lela.devisirelawan);
        System.out.println(lela.emailrelawan);
        System.out.println(lela.alamat);
        lela.masapensiun();
        System.out.println("===================");
    }
    static void menuawal(){
        System.out.println("================");
        System.out.println("  PROGRAM PMII");
        System.out.println("[1] Tambah relawan");
        System.out.println("[2] Lihat data relawan");
        System.out.println("[3] Edit data relawan");
        System.out.println("[4] Hapus data relawan");
        System.out.println("[5] EXIT ");
        System.out.println("Masukkan Pilihan : ");
        String pilihan = inputstr.nextLine();        
        if (pilihan.equals("1")){
            kondisirelawan();
            tambahRelawan();
            kemenuawal();
        }else if (pilihan.equals("2")){
            kondisirelawan();
            lihatRelawan();
            kemenuawal();
        }else if (pilihan.equals("3")){
            kondisirelawan();
            editRelawan();
            kemenuawal();
        }else if (pilihan.equals("4")){
            kondisirelawan();
            hapusRelawan();
            kemenuawal();
        }else if (pilihan.equals("5")){
            System.out.println("Anda keluar dari program, terima kasih :)");
            System.exit(0);
        }else{
            System.out.println("Pilihan Anda tidak terdapat di sistem");
            kemenuawal();
        }
        
    }
    static void kemenuawal(){
        System.out.println("");
        System.out.println(" Tekan enter untuk kembali");
        inputstr.nextLine();
        menuawal();
    }
    static void tambahRelawan(){
        System.out.println("Jumlah Relawan yang akan di input : ");
        int jumlah_relawan = pint.nextInt();
        for(int i = 0; i < jumlah_relawan; i++){
            System.out.println(" Masukkan nama relawan : ");
            String nama_relawan = inputstr.nextLine();
            relawan1.add(nama_relawan);
            
            System.out.println("Masukkan Devisi Relawan : ");
            String devisi = inputstr.nextLine();
            devisi_relawan.add(devisi);
            
            System.out.println("Masukkan nomer telpon Relawan : ");
            int telp = pint.nextInt();
            notelp.add(telp);
            
            System.out.println("Masukkan email Relawan : ");
            String email1 = inputstr.nextLine();
            email.add(email1);
            

            
        }
    }
    static void lihatRelawan(){
        
        for (int j = 0; j <relawan1.size();j++){
            System.out.println("Relawan ke-" + (j+1));
            System.out.println("Nama Relawan : " +relawan1.get(j));
            System.out.println("Devisi Relawan : " + devisi_relawan.get(j));
            System.out.println("Email Relawan : " + email.get(j));
            System.out.println("No Telpon Relawan : " + notelp.get(j));
            
            
        }
    }
    static void editRelawan(){
        lihatRelawan();
        System.out.print("Ubah relawan ke-");
        int edit = pint.nextInt();
        System.out.println("Masukkan nama relawan : ");
        String edit_relawan = pint.nextLine();
        
        System.out.println("Masukkan devisi : ");
        String edit_devisi = inputstr.nextLine();
        
        relawan1.set((edit-1), edit_relawan);
        devisi_relawan.set((edit-1), edit_devisi);
        email.set((edit-1), edit_devisi);
        notelp.set((edit-1), edit_devisi);
    }
    static void hapusRelawan(){
        lihatRelawan();
        System.out.println("Hapus relawan ke-");
        int hapus = pint.nextInt();
        System.out.println("Anda akan menghapus data : (y/t)");
        String hapusrlwn = inputstr.nextLine();
        if(hapusrlwn == "y"){
            System.out.println("Data berhasil dihapus");
            relawan1.remove(hapus-1);
            devisi_relawan.remove(hapus-1);
            email.remove(hapus-1);
            notelp.remove(hapus-1);
        }else{
            kemenuawal();
        }
            
               
    }
}
