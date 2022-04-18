package POSTTEST2;

public class keuangan {
    String nama_instansi;
    int anggaran_masuk;
    int anggaran_keluar;
    int anggaran_perbulan;
    int anggaran_pertahun;
    
    public keuangan(String nama_instansi,int anggaran_masuk,int anggaran_keluar,int anggaran_perbulan,int anggaran_pertahun){
        this.nama_instansi = nama_instansi;
        this.anggaran_masuk = anggaran_masuk;
        this.anggaran_keluar = anggaran_keluar;
        this.anggaran_perbulan = anggaran_perbulan;
        this.anggaran_pertahun = anggaran_pertahun;
    }
    
    void diterima(){
        System.out.println("Anggaran Diterima");
    }
    
    void ditolak(){
        System.out.println("Anggaran Ditolak");
    }
    
}
