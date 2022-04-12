/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Posttest2;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
/**
 *
 * @author Acer gangertipusing
 * 
 */
public class Posttest2 {
    static Scanner user = new Scanner(System.in);
    private static Object dataBarang;
    public static void main(String[] args) throws NumberFormatException, IOException{
        ArrayList<barangLab> dataNama = new ArrayList<>();
        ArrayList<barangLab> dataBarang = new ArrayList<>();
        ArrayList<barangLab> dataTempat = new ArrayList<>();
        ArrayList<barangLab> dataBanyak = new ArrayList<>();
        ArrayList<barangLab> dataKondisi = new ArrayList<>();
    
        barangLab dataBarang1 = new barangLab();
        barangLab dataBarang2 = new barangLab();
        menu();
    }
    
    public static void menu(){
        System.out.println("----------------------------------------------------");
        System.out.println("Peminjaman/Penggunaan Alat Laboratorium Informatika");
        System.out.println("----------------------------------------------------");
        System.out.println("   1. Tambahkan data peminjaman");
        System.out.println("   2. Lihat data peminjaman");
        System.out.println("   3. Update data peminjaman");
        System.out.println("   4. Hapus data peminjaman");
        System.out.println("   0. Keluar");
        System.out.println("----------------------------------------------------");        
        
        System.out.print("Masukkan pilihan menu : ");
        int pilihan = user.nextInt();
        switch (pilihan) {
            case 1 -> {
                System.out.println("---------------------------");
                System.out.println(" Menambahkan Data Peminjam");
                System.out.println("---------------------------");
                System.out.print("Berapa banyak data yang ingin ditambahkan? ");
                int banyakData = user.nextInt();
                for(int a = 0; a < banyakData; a++){
                    System.out.print("Masukkan Nama Peminjam : ");
                    String nama = user.next();

                    System.out.print("Barang yang dipinjam   : ");
                    String brg = user.next();
                    
                    System.out.print("Letak asal barang      : ");
                    String tmpt = user.next();
                    
                    System.out.print("Banyak yang dipinjam   : ");
                    Long bnyk = user.nextLong();
                    
                    System.out.print("Kondisi barang         : ");
                    String cond = user.next();
                    barangLab dataNew = new barangLab(nama, brg, tmpt,  bnyk, cond);
                    barangLab.add(dataNew);
                    
                    System.out.println("------------------------");
                    System.out.println("Data sudah ditambahkan");
                    System.out.println("------------------------");
                }
                back();
            }
                
            case 2 -> {
                System.out.println("----------------------------------------------------");
                System.out.println("       Data Peminjaman Barang Lab Informatika ");
                System.out.println("----------------------------------------------------");
                
                for (int b = 0; b < barangLab.size(); b++){
                    System.out.println("Index Data Peminjaman Barang Ke-" + b);
                    dataTampil();
                    System.out.println("----------------------------------------------------");
                }
                back();
            }
                
            case 3 -> { 
                System.out.println("----------------------------------------------------");
                System.out.println("      Data Peminjaman Barang Lab Informatika ");
                System.out.println("----------------------------------------------------");
                for (int b = 0; b < barangLab.size(); b++){
                    System.out.println("Index Data Peminjaman Barang Ke-" + b);
                    dataTampil();
                    System.out.println("----------------------------------------------------");
                }
                
                System.out.println("  Update Data Peminjaman Barang Lab Informatika");
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
            }
                
            case 4 -> {
                System.out.println("----------------------------------------------------");
                System.out.println("       Data Peminjaman Barang Lab Informatika ");
                System.out.println("----------------------------------------------------");
                for (int b = 0; b < barangLab.size(); b++){
                    System.out.println("Index Data Peminjaman Barang Ke-" + b);
                    dataTampil();
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
            }
                
            case 0 -> {
                System.out.println("Dijaga yaaa barangnya");
                System.exit(0);
            }
        }
    }
    static void back(){
        System.out.print("Tekan K untuk kembali ke menu......");
        user.next();
        menu();
    }

    private static void barangLab(barangLab dataNew) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    private static void dataTampil() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}