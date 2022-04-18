package Sistem_Manajemen_Penerimaan_Jasa_Joki_Game;

import java.util.Scanner;
import java.util.ArrayList;
public class Postest1 {
    public static void main(String[] args) {
        ArrayList<ArrayList> pelanggan = new ArrayList<>();
        int menu;
        
        
        while (true){
            System.out.println("=================================================");
            System.out.println("========== SISTEM PENERIMAAN JASA JOKI ==========");
            System.out.println("================== GAME ONLINE ==================");
            System.out.println("=================================================\n");
            System.out.println("MENU UTAMA");
            System.out.println("1. BUAT ORDERAN");
            System.out.println("2. TAMPILKAN ORDERAN");
            System.out.println("3. UBAH ORDERAN");
            System.out.println("4. HAPUS ORDERAN");
            System.out.println("5. EXIT\n");

            Scanner input = new Scanner(System.in);
            System.out.print("MASUKKAN PILIHAN ANDA : ");
            menu = input.nextInt();
            input.nextLine();
            if (menu == 1){
                ArrayList temp = new ArrayList<>();
                String nama,game,tier,login,email,pass;
                String nama1,game1,tier1,login1,email1,pass1;
                System.out.println("\nSILAKAN MASUKKAN DATA PELANGGAN");
                
                System.out.print("NAMA PELANGGAN : ");
                nama = input.nextLine();
                nama1 = "NAMA PELANGGAN : " + nama;
                temp.add(nama1);
                
                System.out.print("NAMA GAME : ");
                game = input.nextLine();
                game1 = "NAMA GAME : " + game;
                temp.add(game1);
                
                System.out.print("RANK TUJUAN : ");
                tier = input.nextLine();
                tier1 = "RANK TUJUAN : " + tier;
                temp.add(tier1);
                
                System.out.print("SOSMED LOGIN : ");
                login = input.nextLine();
                login1 = "SOSMED LOGIN : " + login;
                temp.add(login1);
                
                System.out.print("EMAIL : ");
                email = input.nextLine();
                email1 = "EMAIL : " + email;
                temp.add(email1);
                
                System.out.print("PASSWORD : ");
                pass = input.nextLine();
                pass1 = "PASSWORD : " + pass;
                temp.add(pass1);
                
                pelanggan.add(temp);
                
                System.out.print("DATA BERHASIL DITAMBAHKAN. TEKAN ENTER UNTUK KEMBALI KE MENU UTAMA. ");
                input.nextLine();
                
            }else if (menu == 2){
                System.out.println("\nDAFTAR ORDERAN\n");
                for (int i = 0; i < pelanggan.size(); i++){
                    int ii = i + 1;
                    System.out.println("=================================================");
                    System.out.println("\nPELAGGAN " + ii +"\n");
                    for (int j = 0; j < 6 ; j++){
                        System.out.println(pelanggan.get(i).get(j));
                    }
                    System.out.println("=================================================\n");
                }
                
                System.out.print("TEKAN ENTER UNTUK KEMBALI KE MENU UTAMA. ");
                input.nextLine();
            }else if (menu == 3){
                System.out.println("\nDAFTAR ORDERAN\n");
                for (int i = 0; i < pelanggan.size(); i++){
                    int ii = i + 1;
                    System.out.println("=================================================");
                    System.out.println("\nPELAGGAN " + ii +"\n");
                    for (int j = 0; j < 6 ; j++){
                        System.out.println(pelanggan.get(i).get(j));
                    }
                    System.out.println("=================================================\n");
                }
                
                int a;
                System.out.print("INGIN MENGUBAH DATA PELANGGAN KE : ");
                a = input.nextInt();
                a = a - 1;
                input.nextLine();
                ArrayList temp = new ArrayList<>();
                String nama,game,tier,login,email,pass;
                String nama1,game1,tier1,login1,email1,pass1;
                System.out.println("\nSILAKAN MASUKKAN DATA BARU");
                
                System.out.print("NAMA PELANGGAN : ");
                nama = input.nextLine();
                nama1 = "NAMA PELANGGAN : " + nama;
                temp.add(nama1);
                
                System.out.print("NAMA GAME : ");
                game = input.nextLine();
                game1 = "NAMA GAME : " + game;
                temp.add(game1);
                
                System.out.print("RANK TUJUAN : ");
                tier = input.nextLine();
                tier1 = "RANK TUJUAN : " + tier;
                temp.add(tier1);
                
                System.out.print("SOSMED LOGIN : ");
                login = input.nextLine();
                login1 = "SOSMED LOGIN : " + login;
                temp.add(login1);
                
                System.out.print("EMAIL : ");
                email = input.nextLine();
                email1 = "EMAIL : " + email;
                temp.add(email1);
                
                System.out.print("PASSWORD : ");
                pass = input.nextLine();
                pass1 = "PASSWORD : " + pass;
                temp.add(pass1);
                
                pelanggan.set(a, temp);
                
                System.out.print("DATA BERHASIL DIUBAH. TEKAN ENTER UNTUK KEMBALI KE MENU UTAMA. ");
                input.nextLine();
            }else if (menu == 4){
                System.out.println("\nDAFTAR ORDERAN\n");
                for (int i = 0; i < pelanggan.size(); i++){
                    int ii = i + 1;
                    System.out.println("=================================================");
                    System.out.println("\nPELAGGAN " + ii +"\n");
                    for (int j = 0; j < 6 ; j++){
                        System.out.println(pelanggan.get(i).get(j));
                    }
                    System.out.println("=================================================\n");
                }
                
                int a;
                System.out.print("INGIN MENGHAPUS DATA PELANGGAN KE : ");
                a = input.nextInt();
                a = a - 1;
                pelanggan.remove(a);
                
                System.out.print("DATA BERHASIL DIHAPUS. TEKAN ENTER UNTUK KEMBALI KE MENU UTAMA. ");
                input.nextLine();
                input.nextLine();
            }else if (menu == 5){
                break;
            }
        }
    } 
}