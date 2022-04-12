package posttest2;
import java.util.Scanner;
import java.util.ArrayList;

public class posttest1 {
    static Scanner input_int = new Scanner(System.in);
    static Scanner input_str = new Scanner(System.in);
    static ArrayList nama_pelanggan = new ArrayList<>();
    static ArrayList alamat = new ArrayList<>();  
    static ArrayList jenis_laundry = new ArrayList<>();
    static ArrayList berat = new ArrayList<>();
    static ArrayList harga = new ArrayList<>();
    static ArrayList keterangan = new ArrayList<>();
    
    
    
    
    public static void main(String[] args) {
        menu();
        data_custlaun();        

    }
    
    static void data_custlaun(){
        datacust data1 = new datacust("salsa","cuci kering","perjuangan","5");
        datacust data2 = new datacust("kiki","cuci lipat","perjuangan1","2");
    
        System.out.println("Nama : " + data1.nama);
        System.out.println("Jenis Laundry : " + data1.jenislaun);
        System.out.println("Alamat : " + data1.alamat);
        System.out.println("Tanggal : + " + data1.tanggal);
        data1.databenar();
        System.out.println("----------------------------------------");
        System.out.println("Nama : " + data2.nama);
        System.out.println("Jenis Laundry : " + data2.jenislaun);
        System.out.println("Alamat : " + data2.alamat);
        System.out.println("Tanggal : " + data2.tanggal);
        data2.datasalah();
    }
    
    static void menu(){
        System.out.println("\t===== MENU LAUNDRY =====  \t");
        System.out.println("\t1. Pendaftaran Customer   \t");
        System.out.println("\t2. Lihat Data Customer    \t");
        System.out.println("\t3. Mengubah Data Customer \t");
        System.out.println("\t4. Menghapus Data Customer\t");
        System.out.println("\t5. Keluar               \t\t");
        System.out.print("\t input menu   :");
        String menu = input_str.nextLine();
        
        if (menu.equals("1")){
            pendaftaran();
            System.out.println("enter untuk kembali");
            input_str.nextLine();   
            menu();   
        }
                    
        else if (menu.equals("2")){
            lihat_customer();
            System.out.println("enter untuk kembali");
            input_str.nextLine();
            menu();
        }
        else if (menu.equals("3")){
            update_data();
            System.out.println("enter untuk kembali");
            input_str.nextLine();
            menu();      
        }
        else if(menu.equals("4")){
            hapus_data();
            System.out.println("enter untuk kembali");
            input_str.nextLine();
            menu();         
        }   
        
    }
    static void pendaftaran(){
        System.out.println("========== PENDAFTARAN LAUNDRY ========");
        System.out.print("\n Nama    : ");
        String nma = input_str.nextLine();
        
        System.out.print("\n Alamat    : ");
        String almt = input_str.nextLine();
        
        nama_pelanggan.add(nma);
        alamat.add(almt);
    }
    
    static void lihat_customer(){
        data_custlaun();
        System.out.println("========== DAFTAR CUSTOMER ========");
        for(int x = 0; x < nama_pelanggan.size();x++){
            System.out.println("No. Customer " + (x+1));
            System.out.println("Nama        : "+ nama_pelanggan.get(x));
            System.out.println("Alamat      : "+ alamat.get(x));
        }
    }
    
    static void update_data(){
        System.out.println("========== MENGUBAH DATA CUSTOMER ========");    
        lihat_customer();
        System.out.print("Masukkan nomor customer : ");
        int update = input_int.nextInt();
        
        System.out.print("\n Nama    : ");
        String nma_baru = input_str.nextLine();
        
        System.out.print("\n Alamat    : ");
        String almt_baru = input_str.nextLine();
        
        nama_pelanggan.set((update-1),nma_baru);
        alamat.set((update-1),almt_baru);
        
                
    }
    
    static void hapus_data(){
        lihat_customer();
        System.out.print("Masukkan nomor customer : ");
        int hapus = input_int.nextInt();
        
        nama_pelanggan.remove(hapus-1);
        alamat.remove(hapus-1);
    }
    
}

class laundry{
    String namacust;
    String jenislaundry;
    double berat;
    double harga;
    
    
}
