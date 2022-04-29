package POSTTEST4;
public class Admin {
    private String nama;
    private int idAdmin;
    private boolean utama;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setIdAdmin(int idAdmin){
        this.idAdmin = idAdmin;
    }
    public void setUtama(boolean Utama){
        this.utama = Utama;
    }
    
    public String getNama(){
        return nama;
    }
    public int getIdAdmin(){
        return idAdmin;
    }
    public boolean getUtama(){
        return utama;
    }
}
