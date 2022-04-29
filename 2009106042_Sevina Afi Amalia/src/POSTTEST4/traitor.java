/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST4;

/**
 *
 * @author asus
 */
public class traitor extends lagu{

    public traitor(String judul_lagu, String pny, String genre, String tahun_rilis) {
        super(judul_lagu, pny, genre, tahun_rilis);
    }
    
    @Override
    public void tampil(){
        System.out.println("lagu            : Traitor");
        System.out.println("Nama penyanyi   : "+getPny());
        System.out.println("Genre lagu      : "+getGenre());
        System.out.println("Tahun rilis     : "+getTahun_rilis());
    }
    
     public void tampil(int putar){
        System.out.println("lagu            : Traitor");
        System.out.println("Nama penyanyi   : "+getPny());
        System.out.println("Genre lagu      : "+getGenre());
        System.out.println("Tahun rilis     : "+getTahun_rilis());
        System.out.println("Lagu sudah di putarkan "+putar+" kali");
    }

}
