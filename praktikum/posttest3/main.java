package posttest3;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
    static Scanner input_int = new Scanner(System.in);
    static Scanner input_str = new Scanner(System.in);
    static ArrayList nama_pelanggan = new ArrayList<>();
    static ArrayList alamat = new ArrayList<>();  
    static ArrayList jenis_laundry = new ArrayList<>();
    static ArrayList berat = new ArrayList<>();
    static ArrayList harga = new ArrayList<>();
    static ArrayList tanggal = new ArrayList<>();
    static ArrayList keterangan = new ArrayList<>();
    
    
    
    
    public static void main(String[] args) {
        menu();       

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
            lihat_data();
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
        else if(menu.equals("5")){
            System.out.println("Sesi telah selesai");
            input_str.nextLine();
            menu();
        
        }
        
    }

    static void pendaftaran(){
        System.out.println("========== PENDAFTARAN LAUNDRY ========");
        System.out.print("\n Nama    : ");
        String nma = input_str.nextLine();
        System.out.print("\n Jenis Laundry : ");
        String jns = input_str.nextLine();
        
        System.out.print("\n Alamat    : ");
        String almt = input_str.nextLine();
        
        System.out.print("\n Tanggal : ");
        String tgl = input_str.nextLine();
        
     
        nama_pelanggan.add(nma);
        alamat.add(almt);
        jenis_laundry.add(jns);
        tanggal.add(tgl);
    }
    static void lihat_data(){
        System.out.println("=============Lihat Data Customer=======");
        customer data = new customer();
        data.panggil("salsa","Cuci kering","Perjuangan","5");
        
        customer data1 = new customer();
        data1.panggil("ajid","cuci lipat","Perjuangan 8","10");
        
        customer data2 = new customer();
        data2.panggil("ai","cuci setrika","alam segar","7");
        
        System.out.println("Data Customer  "+ 1);
        System.out.println("================================");
        data.hasil();
        System.out.println("================================");
        System.out.println("Data Customer " +2);
        System.out.println("================================");
        data1.hasil();
        System.out.println("================================");
        System.out.println("Data Customer " + 3);
        System.out.println("================================");
        data2.hasil();
        
        for(int i = 0; i<nama_pelanggan.size();i++){
            System.out.println("================================");
            System.out.println("No.Pelanggan\t : " + (i+3));
            System.out.println("Nama\t\t : " + nama_pelanggan.get(i));
            System.out.println("Jenis Laundry\t :"+jenis_laundry.get(i));
            System.out.println("Alamat\t\t :"+alamat.get(i));
            System.out.println("Tanggal\t\t :"+tanggal.get(i));
        
        }
        
    
    }    
    

    
    static void update_data(){
        System.out.println("========== MENGUBAH DATA CUSTOMER ========");    
        lihat_data();
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
        lihat_data();
        System.out.print("Masukkan nomor customer : ");
        int hapus = input_int.nextInt();
        
        nama_pelanggan.remove(hapus-1);
        alamat.remove(hapus-1);
    }
    
}

