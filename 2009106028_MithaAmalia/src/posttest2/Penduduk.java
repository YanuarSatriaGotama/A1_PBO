/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest2;

/**
 *
 * @author USER
 */
public class Penduduk {
    long nik;
    String nama,tempat,tanggal,sex, agama, status, pekerjaan, alamat;
    
    Penduduk (long nik, String nama, String tempat, String tanggal, String sex, String agama, String status, String pekerjaan, String alamat){
        this.nik = nik;
        this.nama = nama;
        this.tempat = tempat;
        this.tanggal = tanggal;
        this.sex = sex;
        this.agama = agama;
        this.status = status;
        this.pekerjaan = pekerjaan;
        this.alamat = alamat;
    }
    // method
    void kelahiran(){
        System.out.println("Penduduk Baru");
    }
    void kematian(){
        System.out.println("Penduduk Meninggal");
    }
}
