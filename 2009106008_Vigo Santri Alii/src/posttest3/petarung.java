/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest3;

/**
 *
 * @author Asus Gk
 */
public class petarung {
    private String nama;
    private long id;
    private String bela_diri;
    private String kelas;
    
    public petarung(){

}
    public petarung( long id, String nama, String bela_diri, String kelas){
        this.nama = nama;
        this.id = id;
        this.bela_diri = bela_diri;
        this.kelas = kelas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBela_diri() {
        return bela_diri;
    }

    public void setBela_diri(String bela_diri) {
        this.bela_diri = bela_diri;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    
    
}



