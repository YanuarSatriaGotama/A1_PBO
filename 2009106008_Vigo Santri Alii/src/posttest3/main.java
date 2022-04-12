/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest3;

/**
 *
 * @author Asus Gk
 */
import POSTTEST2.Petarung;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

import java.util.Scanner;


public class main {
    static ArrayList<String> nama = new ArrayList<>();
    static ArrayList<Long> id = new ArrayList<>();
    static ArrayList<String> bela_diri = new ArrayList<>();
    static ArrayList<String> kelas = new ArrayList<>();
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
    }
    
    static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final IOException | InterruptedException e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }
    
    static void menu(){
        Scanner masukkan = new Scanner(System.in);
        clearScreen();
        System.out.println("\t\t\t======================================");
        System.out.println("\t\t\t=========== PETARUNG UFC =============");
        System.out.println("\t\t\t= [1] Create Petarung                =");
        System.out.println("\t\t\t= [2] Read Petarung                  =");
        System.out.println("\t\t\t= [3] Update Petarung                =");
        System.out.println("\t\t\t= [4] Delete Petarung                =");
        System.out.println("\t\t\t= [0] Exit                           =");
        System.out.println("\t\t\t======================================");
        System.out.print("\t\t\tPilih menu : ");
        int pilihMenu = masukkan.nextInt();
        switch (pilihMenu) {
            case 0:
                clearScreen();
                System.out.println("\n\n\n\n");
                System.out.println("\t\t\t=== Anda Keluar ===");
                System.exit(0);
            case 1:
                clearScreen();
                System.out.println("\n\n\n");
                System.out.println("\t\t\t    ========================");
                System.out.println("\t\t\t    =  MENGINPUT PETARUNG  =");
                System.out.println("\t\t\t    ========================");
                System.out.print("INPUT BERAPA PETARUNG   : ");
                int banyak = input.nextInt();
                for(int y = 0 ; y < banyak; y++){
                    System.out.print("Masukan ID Petarung             : ");
                    long idp = input.nextLong();
                    input.nextLine(); 
                    id.add(idp);
                    System.out.print("Masukan Nama Petarung           : ");
                    String name = input.nextLine();
                    nama.add(name);
                    System.out.print("Bela Diri                       : ");
                    String beladiri = input.nextLine();
                    bela_diri.add(beladiri);
                    System.out.print("Kelas                           : ");
                    String kls = input.nextLine();
                    kelas.add(kls);
                }
                System.out.print("\n\nDATA PETARUNG BERHASIL DITAMBAHKAN!");
                System.out.print("\ntekan ENTER ...");
                input.nextLine();
                menu();
                break;

            case 2:
                clearScreen();
                System.out.println("\n\n\n");
                System.out.println("\t\t\t    ===============================");
                System.out.println("\t\t\t    ======== DATA PETARUNG ========");
                System.out.println("\t\t\t    ===============================");
                
                
//                Petarung a = new Petarung (1, "Khabib", "Gulat", "Menengah");
//                Petarung b = new Petarung (2, "Conor", "KickBoxing", "Menengah");
                petarung a = new petarung();
                a.setId(1);
                a.setNama("Khabib");
                a.setBela_diri("Gulat");
                a.setKelas("Menengah");
                
                petarung b = new petarung();
                b.setId(2);
                b.setNama("Conor");
                b.setBela_diri("KickBoxing");
                b.setKelas("Menengah");
                
                
                
                System.out.println("Petarung Ke-" + 1);
                System.out.println("ID               : "+ a.getId());
                System.out.println("Nama             : "+a.getNama());
                System.out.println("Bela Diri        : "+a.getBela_diri());
                System.out.println("Kelas            : "+a.getKelas());

                System.out.println("====================="); 
                System.out.println("Petarung Ke-" + 2);
                System.out.println("ID               : "+b.getId());
                System.out.println("Nama             : "+b.getNama());
                System.out.println("Bela Diri        : "+b.getBela_diri());
                System.out.println("Kelas            : "+b.getKelas());
                
                   
                for(int y = 0; y < id.size(); y++){
                   System.out.println("Petarung Ke-" + (y+1));
                   System.out.println("ID               : "+id.get(y));
                   System.out.println("Nama             : "+nama.get(y));
                   System.out.println("Bela Diri        : "+bela_diri.get(y));
                   System.out.println("Kelas            : "+kelas.get(y));

                   System.out.println("=====================");

                }

                System.out.print("tekan ENTER ...");
                input.nextLine();
                menu();
                break;

            case 3 :
                clearScreen();


                for(int y = 0; y < id.size(); y++){
                   System.out.println("Petarung Ke-" + (y+1));
                   System.out.println("ID             : "+id.get(y));
                   System.out.println("Nama           : "+nama.get(y));
                   System.out.println("Bela Diri      : "+bela_diri.get(y));
                   System.out.println("Kelas          : "+kelas.get(y));
                   System.out.println("=====================");

                }

                System.out.println("\n\n\n");
                System.out.println("\t\t\t    ===============================");
                System.out.println("\t\t\t    ==  MENGUPDATE DATA PETARUNG ==");
                System.out.println("\t\t\t    ===============================");
                System.out.print("Petarung yang diubah : ");
                int edit = input.nextInt();



                System.out.print("Masukan ID            : ");
                long idp2 = input.nextLong();
                input.nextLine();
                id.set((edit-1), idp2);
                System.out.print("Masukan Nama          : ");
                String name2 = input.nextLine();
                nama.set((edit-1), name2);
                System.out.print("Bela Diri             : ");
                String beladiri2 = input.nextLine();
                bela_diri.set((edit-1),beladiri2);
                System.out.print("Kelas                 : ");
                String kls2 = input.nextLine();
                kelas.set((edit-1),kls2);


                System.out.print("\nDATA TELAH TERUPDATE");

                System.out.print("\ntekan ENTER ...");
                input.nextLine();
                menu();
                break;


            case 4 :
                clearScreen();

                for(int y = 0; y < id.size(); y++){
                   System.out.println("Petarung Ke-" + (y+1));
                   System.out.println("ID             : "+id.get(y));
                   System.out.println("Nama           : "+nama.get(y));
                   System.out.println("Bela Diri      : "+bela_diri.get(y));
                   System.out.println("Kelas          : "+kelas.get(y));
                   System.out.println("=====================");
                }

                System.out.println("\n\n\n");
                System.out.println("\t\t\t    ===============================");
                System.out.println("\t\t\t    ====   MENGHAPUS PETARUNG  ====");
                System.out.println("\t\t\t    ===============================");
                System.out.print("Petarung yang dihapus : ");
                int hapus = input.nextInt();
                id.remove((hapus-1));
                nama.remove((hapus-1));
                bela_diri.remove((hapus-1));
                kelas.remove((hapus-1));

                System.out.print("tekan ENTER ...");
                input.nextLine();
                menu();
                break;

            default:
                clearScreen();
                System.out.println("Pilihan Invalid!");
                System.out.print("tekan ENTER ...");
                input.nextLine();
                menu();
                break;
        }
    }
}