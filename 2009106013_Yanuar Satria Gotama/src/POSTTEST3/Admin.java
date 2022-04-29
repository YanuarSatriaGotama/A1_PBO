package POSTTEST3;
public class Admin {
    private String Nama;
    private int Id_admin;
    private boolean Utama;
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setId_admin(int Id_admin){
        this.Id_admin = Id_admin;
    }
    public void setUtama(boolean Utama){
        this.Utama = Utama;
    }
    
    public String getNama(){
        return Nama;
    }
    public int getId_admin(){
        return Id_admin;
    }
    public boolean getUtama(){
        return Utama;
    }
}
