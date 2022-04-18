package POSTTEST2;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static Scanner inputint = new Scanner(System.in);
    static Scanner inputstr = new Scanner(System.in);
    static ArrayList lagu = new ArrayList<>();
    static ArrayList penyanyi = new ArrayList<>();

    public static void main(String[] args) {
        awal();
    }

    static void list_lagu(){
        lagu lagu1 = new lagu("Traitor", "Olivia Rodrigo", "Pop", "2021");
        lagu lagu2 = new lagu("Peaches", "Justin Bieber", "R&B", "2021");
        lagu lagu3 = new lagu("Monokrom", "Tulus", "Pop", "2016");

        System.out.println(lagu1.judul_lagu);
        System.out.println(lagu1.pny);
        System.out.println(lagu1.genre);
        System.out.println(lagu1.tahun_rilis);
        lagu1.nyalakanLagu();
        System.out.println("===================");
        System.out.println(lagu2.judul_lagu);
        System.out.println(lagu2.pny);
        System.out.println(lagu2.genre);
        System.out.println(lagu2.tahun_rilis);
        lagu2.matikanLagu();
        System.out.println("===================");
        System.out.println(lagu3.judul_lagu);
        System.out.println(lagu3.pny);
        System.out.println(lagu3.genre);
        System.out.println(lagu3.tahun_rilis);
        lagu3.nyalakanLagu();
    }

    static void awal(){
        System.out.println("-----------------------");
        System.out.println("-----PLAYLIST LAGU-----");
        System.out.println("|   1. Tambah Lagu    |");
        System.out.println("|   2. Lihat Lagu     |");
        System.out.println("|   3. Hapus Lagu     |");
        System.out.println("|   4. Edit Lagu      |");
        System.out.println("|   5. Keluar         |");
        System.out.println("-----------------------");
        System.out.print("| Pilih Menu  :       |");
        System.out.print("  Pilih Menu  :");
        String menu = inputstr.nextLine();
        if (menu.equals("1")){
            tambah_lagu();
            lihat_lagu();
            backToMenu();
        }else if (menu.equals("3")){
            hapus_lagu();
            backToMenu();
            
            hapus_lagu();
            backToMenu();

        }else if (menu.equals("4")){
            edit_lagu();
            backToMenu();
        }else if (menu.equals("5")){
            keluar();

        }else{
            System.out.println("Inputan salah. Coba lagi!!");
            backToMenu();
        }
    }
    

    static void backToMenu() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        inputstr.nextLine();
        awal();
}
    static void tambah_lagu(){
        
        list_lagu();
        System.out.println("================================");
        System.out.print("Ingin berapa lagu : ");
        int banyak_lagu = inputint.nextInt();
        for(int h = 0; h < banyak_lagu; h++){
            System.out.print("Masukkan Judul lagu   : ");
            String judul_lagu = inputstr.nextLine();
            lagu.add(judul_lagu);
            

            System.out.print("Masukkan Penyanyi : ");
            String pny = inputstr.nextLine();
            penyanyi.add(pny);  
        }  
    }
    static void lihat_lagu(){
        list_lagu();
        System.out.println("================================");
        for(int y = 0; y<lagu.size(); y++){
            System.out.println("Lagu Ke-"+ (y+1));
            System.out.println("Judul Lagu : "+lagu.get(y));
            System.out.println("Nama Penyanyi : "+penyanyi.get(y));
            

        }
    }
    static void edit_lagu(){
        int edit = inputint.nextInt();
        System.out.print("Masukkan Judul lagu: ");
        String edit_judul = inputstr.nextLine();
        

        System.out.print("Masukkan Penyanyi: ");
        String edit_pny = inputstr.nextLine();
        

        lagu.set((edit-1), edit_judul);
        penyanyi.set((edit-1), edit_pny);
        

    }
    static void hapus_lagu(){
        lihat_lagu();
        System.out.print("Ingin ubah lagu ke-");
        int hapus = inputint.nextInt();
        System.out.println("Anda yakin ingin menghapus lagu? (y/n)");
        String hapus_g_y = inputstr.nextLine();
        if (hapus_g_y == "y"){
            String hapus_ = inputstr.nextLine();
            if (hapus_ == "y"){
                System.out.println("Data telah terhapus....");
                lagu.remove(hapus-1);
                penyanyi.remove(hapus-1);
            }else{
                backToMenu();
            }
        }
        
    }
    static void keluar(){
        System.out.print("Sistem telah selesai....");
}

    }