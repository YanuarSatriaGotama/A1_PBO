package Posttest3_Aswandi;

public class TokoBuah {
    private String Nama_Toko;
    private String Nama_Buah;
    private int  Jumlah_StockBuah;
    
    public TokoBuah(String Nama_Toko, String Nama_Buah, int Jumlah_StockBuah){
        this.Nama_Toko = Nama_Toko;
        this.Nama_Buah = Nama_Buah;
        this.Jumlah_StockBuah = Jumlah_StockBuah;
  }
    public String getNama_Toko() {
        return Nama_Toko;
    }

    public void setNama_Toko(String Nama_Toko) {
        this.Nama_Toko = Nama_Toko;
    }

    public String getNama_Buah() {
        return Nama_Buah;
    }

    public void setNama_Buah(String Nama_Buah) {
        this.Nama_Buah = Nama_Buah;
    }

    public int getJumlah_StockBuah() {
        return Jumlah_StockBuah;
    }

    public void setJumlah_StockBuah(int Jumlah_StockBuah) {
        this.Jumlah_StockBuah= Jumlah_StockBuah;
    }
 
 }




