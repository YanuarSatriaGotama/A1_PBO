/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Posttest1;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Acer
 */
public class Posttest1 {
    static ArrayList<String> namaPeminjam = new ArrayList<>();
    static ArrayList<String> barang = new ArrayList<>();
    static ArrayList<String> tempat = new ArrayList<>();
    static ArrayList<Long> banyak = new ArrayList<>();
    static ArrayList<String> kondisi = new ArrayList<>();
    
    static Scanner user = new Scanner(System.in);



    /**
     * @param args the command line arguments
     * Sistem Manajemen Peminjaman/Penggunaan Alat Laboratorium Informatika
     */
    public static void main(String[] args) {
        menu();
    }
    
    static void menu(){
        System.out.println("----------------------------------------------------");
        System.out.println("Peminjaman/Penggunaan Alat Laboratorium Informatika");
        System.out.println("----------------------------------------------------");
        System.out.println(" 1. Tambahkan data peminjaman");
        System.out.println(" 2. Lihat data peminjaman");
        System.out.println(" 3. Update data peminjaman");
        System.out.println(" 4. Hapus data peminjaman");
        System.out.println(" 0. Keluar");
        System.out.println("----------------------------------------------------");        
        
        System.out.print("Masukkan pilihan menu : ");
        int pilihan = user.nextInt();
        switch (pilihan) {
            case 1 :
                System.out.println("Masukkan Data Peminjaman");
                System.out.print("Berapa banyak data yang ingin ditambahkan? ");
                int banyakData = user.nextInt();
                for(int a = 0; a < banyakData; a++){
                    System.out.print("Masukkan Nama Peminjam : ");
                    String nama = user.next();
                    namaPeminjam.add(nama);

                    System.out.print("Barang yang dipinjam : ");
                    String brg = user.next();
                    barang.add(brg);
                    
                    System.out.print("Letak asal barang : ");
                    String tmpt = user.next();
                    tempat.add(tmpt);
                    
                    System.out.print("Banyak yang dipinjam : ");
                    Long bnyk = user.nextLong();
                    banyak.add(bnyk);
                    
                    System.out.print("Kondisi barang : ");
                    String cond = user.next();
                    kondisi.add(cond);
                    
                    System.out.println("------------------------");
                    System.out.println("Data sudah ditambahkan");
                    System.out.println("------------------------");
                }
                back();
                break;
                
            case 2 :
                System.out.println("----------------------------------------------------");
                System.out.println("Data Peminjaman Barang Lab Informatika ");
                System.out.println("----------------------------------------------------");
                
                for (int b = 0; b < barang.size(); b++){
                    System.out.println("Index Data Peminjaman Barang Ke-" + b);
                    System.out.println("Nama Peminjam : " + namaPeminjam.get(b));
                    System.out.println("Barang : "+ barang.get(b));
                    System.out.println("Letak Asal Barang : "+ tempat.get(b));
                    System.out.println("Banyak yang dipinjam : "+ banyak.get(b));
                    System.out.println("Kondisi barang : "+ kondisi.get(b));
                    System.out.println("----------------------------------------------------");
                }
                back();
                break;
                
            case 3 : 
                System.out.println("----------------------------------------------------");
                System.out.println("Data Peminjaman Barang Lab Informatika ");
                System.out.println("----------------------------------------------------");
                for (int b = 0; b < barang.size(); b++){
                    System.out.println("Index Data Peminjaman Barang Ke-" + b);
                    System.out.println("Nama Peminjam : " + namaPeminjam.get(b));
                    System.out.println("Barang : "+ barang.get(b));
                    System.out.println("Letak Asal Barang : "+ tempat.get(b));
                    System.out.println("Banyak yang dipinjam : "+ banyak.get(b));
                    System.out.println("Kondisi barang : "+ kondisi.get(b));
                    System.out.println("----------------------------------------------------");
                }
                
                System.out.println("Update Data Peminjaman Barang Lab Informatika");
                System.out.println("----------------------------------------------------");
                System.out.print("Masukkan Index barang yang ingin diupdate : ");
                int update = user.nextInt();
                
                System.out.println("Masukkan data barang Terbaru");
                System.out.print("Masukkan Nama Peminjam : ");
                String namaBaru = user.nextLine();
                user.next();
                namaPeminjam.set(update, namaBaru);
                
                System.out.print("Barang yang dipinjam : ");
                String barangBaru = user.next();
                barang.set(update, barangBaru);
                
                System.out.print("Letak asal barang ; ");
                String lokasi = user.next();
                tempat.set(update, lokasi);
                
                System.out.print("Banyak yang dipinjam : ");
                Long jml = user.nextLong();
                banyak.set(update, jml);
                
                System.out.print("Kondisi barang : ");
                String now = user.next();
                kondisi.set(update, now);
                
                back();
                break;
                
            case 4 :
                System.out.println("----------------------------------------------------");
                System.out.println("Data Peminjaman Barang Lab Informatika ");
                System.out.println("----------------------------------------------------");
                for (int b = 0; b < barang.size(); b++){
                    System.out.println("Index Data Peminjaman Barang Ke-" + b);
                    System.out.println("Nama Peminjam : " + namaPeminjam.get(b));
                    System.out.println("Barang : "+ barang.get(b));
                    System.out.println("Letak Asal Barang : "+ tempat.get(b));
                    System.out.println("Banyak yang dipinjam : "+ banyak.get(b));
                    System.out.println("Kondisi barang : "+ kondisi.get(b));
                    System.out.println("----------------------------------------------------");
                }                
                
                System.out.println("Hapus Data Peminjaman Barang Lab Informatika");
                System.out.print("Masukkan Index Data yang Ingin dihapus : ");
                int del = user.nextInt();
                
                namaPeminjam.remove(del);
                barang.remove(del);
                tempat.remove(del);
                banyak.remove(del);
                kondisi.remove(del);
                
                back();
                break;
                
            case 0 :
                System.out.println("Dijaga yaaa barangnya");
                System.exit(0);
        }
    }
    static void back(){
        System.out.print("Tekan K untuk kembali ke menu......");
        user.next();
        menu();
    }

}