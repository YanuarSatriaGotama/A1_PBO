package POSTTEST2;

class lagu {
    String judul_lagu;
    String pny;
    String genre;
    String tahun_rilis;

    public lagu(String judul_lagu, String pny, String genre, String tahun_rilis){
        this.judul_lagu = judul_lagu;
        this.pny = pny;
        this.genre = genre;
        this.tahun_rilis = tahun_rilis;
    }
    void nyalakanLagu(){
        System.out.println("Lagu sedang dinyalakan....");
    }
    void matikanLagu(){
        System.out.println("Lagu dimatikan....");
    }
}   