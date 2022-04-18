
package POSTTEST2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static ArrayList<String> nama_instansi = new ArrayList<>();
    static ArrayList anggaran_masuk = new ArrayList<>();
    static ArrayList anggaran_keluar = new ArrayList<>();
    static ArrayList anggaran_perbulan = new ArrayList<>();
    static ArrayList anggaran_pertahun = new ArrayList<>();
    static Scanner input_int = new Scanner(System.in);
    static Scanner input_str = new Scanner(System.in);
    
    public static void main(String[] args) {
        int menu;
        do {
            System.out.println("===== Menu Keuangan Daerah =====");
            System.out.println("1. Tambah Instansi");
            System.out.println("2. Lihat Instansi");
            System.out.println("3. Edit Instansi");
            System.out.println("4. Hapus Instansi");
            System.out.println("5. Keluar");
            System.out.print("Input Menu : ");
            menu = input_int.nextInt();
            if(menu == 1) {
                System.out.println("===== Tambah Instansi =====");
                System.out.print("1. Nama Instansi     : ");
                nama_instansi.add(input_str.nextLine());                
                System.out.print("2. Anggaran Masuk    : ");
                anggaran_masuk.add(input_int.nextInt());
                System.out.print("3. Anggaran Keluar   : ");
                anggaran_keluar.add(input_int.nextInt());
                System.out.print("4. Anggaran Perbulan : ");
                anggaran_perbulan.add(input_int.nextInt());
                System.out.print("5. Anggaran Pertahun : ");
                anggaran_pertahun.add(input_int.nextInt());
                System.out.println("Instansi telah ditambahkan!");
            } else if(menu == 2) {
                System.out.println("===== Lihat Instansi =====");
                keuangan instansi1 = new keuangan("Sekretariat daerah",40000000,30000000,70000000,80000000);
                keuangan instansi2 = new keuangan("Inspektorat",50000000,3000000,60000000,70000000);
                
                System.out.println("===============================================");
                System.out.println("Nomor Instansi    : " + 1);
                System.out.println("Nama Instansi     : " + instansi1.nama_instansi);
                System.out.println("Anggaran Masuk    : " + instansi1.anggaran_masuk);
                System.out.println("Anggaran Keluar   : " + instansi1.anggaran_keluar);
                System.out.println("Anggaran Perbulan : " + instansi1.anggaran_perbulan);
                System.out.println("Anggaran Pertahun : " + instansi1.anggaran_pertahun);
                instansi1.diterima();
                System.out.println("==============================================="); 

                System.out.println("===============================================");
                System.out.println("Nomor Instansi    : " + 2);
                System.out.println("Nama Instansi     : " + instansi2.nama_instansi);
                System.out.println("Anggaran Masuk    : " + instansi2.anggaran_masuk);
                System.out.println("Anggaran Keluar   : " + instansi2.anggaran_keluar);
                System.out.println("Anggaran Perbulan : " + instansi2.anggaran_perbulan);
                System.out.println("Anggaran Pertahun : " + instansi2.anggaran_pertahun);
                instansi2.ditolak();
                
                System.out.println("==============================================="); 

                for(int i = 0; i < nama_instansi.size(); i++) {
                    System.out.println("===============================================");
                    System.out.println("Nomor Instansi    : " + (i+1));
                    System.out.println("Nama Instansi     : " + nama_instansi.get(i));
                    System.out.println("Anggaran Masuk    : " + anggaran_masuk.get(i));
                    System.out.println("Anggaran Keluar   : " + anggaran_keluar.get(i));
                    System.out.println("Anggaran Perbulan : " + anggaran_perbulan.get(i));
                    System.out.println("Anggaran Pertahun : " + anggaran_pertahun.get(i));
                    System.out.println("===============================================");                    
                }                    
                
            } else if(menu == 3) {                
                System.out.println("===== Edit Instansi =====");
                if(nama_instansi.isEmpty()) System.out.println("Data Kosong!");
                else {
                    for(int i = 0; i < nama_instansi.size(); i++) {
                        System.out.println("===============================================");
                        System.out.println("Nomor Instansi    : " + (i+1));
                        System.out.println("Nama Instansi     : " + nama_instansi.get(i));
                        System.out.println("Anggaran Masuk    : " + anggaran_masuk.get(i));
                        System.out.println("Anggaran Keluar   : " + anggaran_keluar.get(i));
                        System.out.println("Anggaran Perbulan : " + anggaran_perbulan.get(i));
                        System.out.println("Anggaran Pertahun : " + anggaran_pertahun.get(i));
                        System.out.println("===============================================");                    
                    }                    
                    System.out.print("Masukkan Nomor Instansi yang ingin diubah: ");
                    int no = input_int.nextInt();
                    System.out.print("1. Nama Instansi     : ");
                    nama_instansi.set(no-1, input_str.nextLine());                
                    System.out.print("2. Anggaran Masuk    : ");
                    anggaran_masuk.set(no-1, input_int.nextInt());
                    System.out.print("3. Anggaran Keluar   : ");
                    anggaran_keluar.set(no-1, input_int.nextInt());
                    System.out.print("4. Anggaran Perbulan : ");
                    anggaran_perbulan.set(no-1, input_int.nextInt());
                    System.out.print("5. Anggaran Pertahun : ");
                    anggaran_pertahun.set(no-1, input_int.nextInt());
                    System.out.println("Instansi telah diperbaharui!");
                }
            } else if(menu == 4) {                
                System.out.println("===== Hapus Instansi =====");
                if(nama_instansi.isEmpty()) System.out.println("Data Kosong!");
                else {
                    for(int i = 0; i < nama_instansi.size(); i++) {
                        System.out.println("===============================================");
                        System.out.println("Nomor Instansi    : " + (i+1));
                        System.out.println("Nama Instansi     : " + nama_instansi.get(i));
                        System.out.println("Anggaran Masuk    : " + anggaran_masuk.get(i));
                        System.out.println("Anggaran Keluar   : " + anggaran_keluar.get(i));
                        System.out.println("Anggaran Perbulan : " + anggaran_perbulan.get(i));
                        System.out.println("Anggaran Pertahun : " + anggaran_pertahun.get(i));
                        System.out.println("===============================================");                    
                    }                    
                    System.out.print("Masukkan Nomor Instansi yang ingin dihapus: ");
                    int no = input_int.nextInt();
                    nama_instansi.remove(no-1);                
                    anggaran_masuk.remove(no-1);
                    anggaran_keluar.remove(no-1);
                    anggaran_perbulan.remove(no-1);
                    anggaran_pertahun.remove(no-1);
                    System.out.println("Instansi telah dihapus!");
                }
            } else if(menu == 5) {                
                System.out.println("Terima Kasih!");
            } else {                
                System.out.println("Menu Salah!");
            }
        } while(menu != 5);
    }
}
