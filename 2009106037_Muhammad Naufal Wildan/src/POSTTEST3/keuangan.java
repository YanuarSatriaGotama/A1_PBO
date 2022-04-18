package POSTTEST3;

public class keuangan {
    private String nama_instansi;
    private int anggaran_masuk;
    private int anggaran_keluar;
    private int anggaran_perbulan;
    private int anggaran_pertahun;
    
    
    void diterima(){
        System.out.println("Anggaran Diterima");
    }
    
    void ditolak(){
        System.out.println("Anggaran Ditolak");
    }

    private String getnama_instansi() {
        return nama_instansi;
    }

    private void setnama_instansi(String nama_instansi) {
        this.nama_instansi = nama_instansi;
    }

    private int getanggaran_masuk() {
        return anggaran_masuk;
    }

    private void setanggaran_masuk(int anggaran_masuk) {
        this.anggaran_masuk = anggaran_masuk;
    }

    private int getanggaran_keluar() {
        return anggaran_keluar;
    }

    private void setanggaran_keluar(int anggaran_keluar) {
        this.anggaran_keluar = anggaran_keluar;
    }

    private int getanggaran_perbulan() {
        return anggaran_perbulan;
    }

    private void setanggaran_perbulan(int anggaran_perbulan) {
        this.anggaran_perbulan = anggaran_perbulan;
    }

    private int getanggaran_pertahun() {
        return anggaran_pertahun;
    }

    private void setanggaran_pertahun(int anggaran_pertahun) {
        this.anggaran_pertahun = anggaran_pertahun;
    }
    
    public void bikin(String nama_instansi, int anggaran_masuk, int anggaran_keluar, int anggaran_perbulan, int anggaran_pertahun){
        setnama_instansi (nama_instansi);
        setanggaran_masuk (anggaran_masuk);
        setanggaran_keluar (anggaran_keluar);
        setanggaran_perbulan (anggaran_perbulan);
        setanggaran_pertahun (anggaran_pertahun);
    }
    
    public void tampil(){
        System.out.println("Nama Instansi     : " + getnama_instansi());
        System.out.println("Anggaran Masuk    : " + getanggaran_masuk());
        System.out.println("Anggaran Keluar   : " + getanggaran_keluar());
        System.out.println("Anggaran Perbulan : " + getanggaran_perbulan());
        System.out.println("Anggaran Pertahun : " + getanggaran_pertahun());
    }
    
    
}
