
package Posttest2;

public class TokohBuah {
    String Nama_buah;
    String Stock_Buah;
    String Harga;

    
//    metode khusus
    TokohBuah(String Nama_buah, String Stock_Buah, String Harga){
        this.Nama_buah = Nama_buah;
        this.Stock_Buah = Stock_Buah;
        this.Harga = Harga;

    }

//    metode
    void showAllTokoBuah(){
        System.out.println("Data Nama buah");
    }
    void TambahTokoBuah(){
        System.out.println("Data buah sdh ditambah kan");
    }
    void EditTokoBuah(){
        System.out.println("data sudah diubah");
    }
    void HapusTokoBuah(){
        System.out.println("Datatokoh buah sudah dihapus");
    }
}
    

