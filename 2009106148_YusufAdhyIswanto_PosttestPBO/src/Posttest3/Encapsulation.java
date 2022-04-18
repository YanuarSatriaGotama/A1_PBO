package Posttest3;

import java.util.Scanner;
import java.util.ArrayList;

public class Encapsulation {
    static ArrayList<ArrayList> pelanggan = new ArrayList<>();
    private String nama1,game1,tier1,login1,email1,pass1;
    
    //Setter
    public void setNama(String nama){
        this.nama1 = nama;
    }
    
    public void setGame(String game){
        this.game1 = game;
    }
    
    public void setTier(String tier){
        this.tier1 = tier;
    }
    
    public void setLogin(String login){
        this.login1 = login;
    }
    
    public void setEmail(String email){
        this.email1 = email;
    }
    
    public void setPass(String pass){
        this.pass1 = pass;
    }
    
    //Getter
    public String getNama(){
        return nama1;
    }
    
    public String getGame(){
        return game1;
    }
    
    public String getTier(){
        return tier1;
    }
    
    public String getLogin(){
        return login1;
    }
    
    public String getEmail(){
        return email1;
    }
    
    public String getPass(){
        return pass1;
    }
    
    public void baca(){
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
    
    public void hapus(int a){
        pelanggan.remove(a);
    }
    
    Encapsulation(String nama, String game, String tier, String login, String email, String pass, int pil, int a){
//        Scanner input = new Scanner(System.in);
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
    
    Encapsulation(){
        this.nama1 = this.nama1;
//        this.game1 = this.game1;
//        this.tier1 = this.tier1;
//        this.login1 = this.login1;
//        this.email1 = this.email1;
//        this.pass1 = this.pass1;
    }
}
