package Posttest3;

public class barangLab {

    private String namaPeminjam;
    private String barang;
    private String tempat;
    private Long banyak;
    private String kondisi;

    //constructor
    public barangLab(String namaPeminjam, String barang, String tempat, Long banyak, String kondisi){
        this.namaPeminjam = namaPeminjam;
        this.barang = barang;
        this.tempat = tempat;
        this.banyak = banyak;
        this.kondisi = kondisi;
    }
    
    //Getter
    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public String getBarang() {
        return barang;
    }

    public String getTempat() {
        return tempat;
    }

    public Long getBanyak() {
        return banyak;
    }

    public String getKondisi() {
        return kondisi;
    }

    //Setter
    public void setnamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    public void setBanyak(Long banyak) {
        this.banyak = banyak;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    barangLab() {}
    
    void tampilData() {
        System.out.println("Nama Peminjam        : "+ this.namaPeminjam);
        System.out.println("Barang               : "+ this.barang);
        System.out.println("Letak Asal Barang    : "+ this.tempat);
        System.out.println("Banyak yang dipinjam : "+ this.banyak);
        System.out.println("Kondisi barang       : "+ this.kondisi);
    }
    
    void barang1() {
        System.out.println("method1 -> PALING MANTAB DAH");
    }

    void barang2() {
        System.out.println("method1 -> SUDAH PALING OKE");
    }

}