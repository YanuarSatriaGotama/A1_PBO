
package POSTTEST3;

public class lagu {
    private String judul_lagu;
    private String pny;
    private String genre;
    private String tahun_rilis;
    
    public lagu () {
    
    }
    
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

    public String getJudul_lagu() {
        return judul_lagu;
    }

    public void setJudul_lagu(String judul_lagu) {
        this.judul_lagu = judul_lagu;
    }

    public String getPny() {
        return pny;
    }

    public void setPny(String pny) {
        this.pny = pny;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTahun_rilis() {
        return tahun_rilis;
    }

    public void setTahun_rilis(String tahun_rilis) {
        this.tahun_rilis = tahun_rilis;
    }
    
}   
    
