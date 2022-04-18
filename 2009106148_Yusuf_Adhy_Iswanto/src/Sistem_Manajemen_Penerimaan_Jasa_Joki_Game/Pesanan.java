
package Sistem_Manajemen_Penerimaan_Jasa_Joki_Game;

import java.util.Scanner;
import java.util.ArrayList;

public class Pesanan {
    static ArrayList<ArrayList> pelanggan = new ArrayList<>();
    static String nama1,game1,tier1,login1,email1,pass1;
    
    static void baca(){
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
    }
    
    static void hapus(int a){
        pelanggan.remove(a);
    }
    
    Pesanan(String nama, String game, String tier, String login, String email, String pass, int pil, int a){
        Scanner input = new Scanner(System.in);
        ArrayList temp = new ArrayList<>();

        this.nama1 = "NAMA PELANGGAN : " + nama;
        temp.add(nama1);

        this.game1 = "NAMA GAME : " + game;
        temp.add(game1);

        this.tier1 = "RANK TUJUAN : " + tier;
        temp.add(tier1);

        this.login1 = "SOSMED LOGIN : " + login;
        temp.add(login1);

        this.email1 = "EMAIL : " + email;
        temp.add(email1);

        this.pass1 = "PASSWORD : " + pass;
        temp.add(pass1);
        
        if(pil==1){
            this.pelanggan.add(temp);
        }else if(pil==3){
            this.pelanggan.set(a, temp);
        }
    }
}
