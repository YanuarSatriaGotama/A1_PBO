package Posttest3;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class Posttest3 {
    static Scanner user = new Scanner(System.in);
    
    public static void main(String[] args) throws NumberFormatException, IOException{
        
        ArrayList<barangLab> dataLab = new ArrayList<>();
    
        barangLab dataBarang1 = new barangLab();
        barangLab dataBarang2 = new barangLab();

        while (true){
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
                        String namaPeminjam = user.next();

                        System.out.print("Barang yang dipinjam   : ");
                        String barang = user.next();

                        System.out.print("Letak asal barang      : ");
                        String tempat = user.next();

                        System.out.print("Banyak yang dipinjam   : ");
                        Long banyak = user.nextLong();

                        System.out.print("Kondisi barang         : ");
                        String kondisi = user.next();

                        barangLab dataNew = new barangLab(namaPeminjam, barang, tempat,  banyak, kondisi);
                        dataLab.add(dataNew);

                        System.out.println("------------------------");
                        System.out.println("Data sudah ditambahkan");
                        System.out.println("------------------------");
                    }
                    break;
                }

                case 2 -> {
                    dataBarang1.barang1();
                    dataBarang2.barang2();                    
                    System.out.println("----------------------------------------------------");
                    System.out.println("       Data Peminjaman Barang Lab Informatika ");
                    System.out.println("----------------------------------------------------");

                    for (int b = 0; b < dataLab.size(); b++){
                        System.out.println("Index Data Peminjaman Barang Ke-" + b);
                        dataLab.get(b).tampilData();
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                }

                case 3 -> { 
                    System.out.println("  Update Data Peminjaman Barang Lab Informatika");
                    System.out.println("----------------------------------------------------");
                    
                    System.out.print("Masukkan Nama Peminjam yang di Update : ");
                    String namaBaru = user.next();
                    
                    System.out.println("Masukkan data barang Terbaru");
                    
                    for (barangLab data : dataLab) {
                        if (data.getNamaPeminjam().equals(namaBaru)) {
                            System.out.print("Masukkan Nama Peminjam : ");
                            String name = user.next();
                            data.setnamaPeminjam(name);

                            System.out.print("Barang yang dipinjam   : ");
                            String brg = user.next();
                            data.setBarang(brg);

                            System.out.print("Letak asal barang      : ");
                            String tmpt = user.next();
                            data.setTempat(tmpt);

                            System.out.print("Banyak yang dipinjam   : ");
                            Long byk = user.nextLong();
                            data.setBanyak(byk);

                            System.out.print("Kondisi barang         : ");
                            String cond = user.next();
                            data.setKondisi(cond);
                        }
                    }

                    break;
                }

                case 4 -> {
                    System.out.println("Hapus Data Peminjaman Barang Lab Informatika");
                    System.out.print("Masukkan Nama Barang yang Ingin dihapus : ");
                    String namabarang = user.next();
                    for (int i = 0; i < dataLab.size(); i++) {
                        if (dataLab.get(i).getBarang().equals(namabarang)) {
                            dataLab.remove(i);
                            break;
                        }
                    }

                    break;
                }

                case 0 -> {
                    System.out.println("Dijaga yaaa barangnya");
                    System.exit(0);
                }
            }
        }
    }
}