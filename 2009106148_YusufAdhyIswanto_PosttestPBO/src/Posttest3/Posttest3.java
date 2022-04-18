package Posttest3;

import java.util.Scanner;
import java.util.ArrayList;
public class Posttest3 {
        static int menu,a;
        static Scanner input = new Scanner(System.in);
        
        static void inputData(int pil, int a){
            String nama,game,tier,login,email,pass;
            System.out.println("\nSILAKAN MASUKKAN DATA PELANGGAN");

            System.out.print("NAMA PELANGGAN : ");
            nama = input.nextLine();
            System.out.print("NAMA GAME : ");
            game = input.nextLine();
            System.out.print("RANK TUJUAN : ");
            tier = input.nextLine();
            System.out.print("SOSMED LOGIN : ");
            login = input.nextLine();
            System.out.print("EMAIL : ");
            email = input.nextLine();
            System.out.print("PASSWORD : ");
            pass = input.nextLine();
            Encapsulation enc = new Encapsulation();
            enc.setNama(nama);
            enc.setGame(game);
            enc.setTier(tier);
            enc.setLogin(login);
            enc.setEmail(email);
            enc.setPass(pass);
            new Encapsulation(enc.getNama(), enc.getGame(), enc.getTier(), enc.getLogin(), enc.getEmail(), enc.getPass(),pil,a);
        }
        
        static void pilih(int pil){
            Scanner input = new Scanner(System.in);
            Encapsulation enc = new Encapsulation();
            enc.baca();
            if(pil==3){
                System.out.print("INGIN MENGUBAH DATA PELANGGAN KE : ");
            }else if(pil==4){
                System.out.print("INGIN MENGHAPUS DATA PELANGGAN KE : ");
            }
            a = input.nextInt();
            a = a - 1;
            input.nextLine();
        }
        
    public static void main(String[] args) {
        
        Encapsulation enc = new Encapsulation();
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
            System.out.print("MASUKKAN PILIHAN ANDA : ");
            menu = input.nextInt();
            input.nextLine();
            if (menu == 1){
                inputData(1,0);
                System.out.print("DATA BERHASIL DITAMBAHKAN. TEKAN ENTER UNTUK KEMBALI KE MENU UTAMA. ");
                input.nextLine();
                
            }else if (menu == 2){
                enc.baca();
                System.out.print("TEKAN ENTER UNTUK KEMBALI KE MENU UTAMA. ");
                input.nextLine();
            }else if (menu == 3){
                pilih(3);
                inputData(3,a);
                System.out.print("DATA BERHASIL DIUBAH. TEKAN ENTER UNTUK KEMBALI KE MENU UTAMA. ");
                input.nextLine();
            }else if (menu == 4){
                pilih(4);
                enc.hapus(a);
                
                System.out.print("DATA BERHASIL DIHAPUS. TEKAN ENTER UNTUK KEMBALI KE MENU UTAMA. ");
                input.nextLine();
            }else if (menu == 5){
                break;
            }
        }
    } 
}