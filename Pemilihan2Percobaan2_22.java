import java.util.Scanner;

public class Pemilihan2Percobaan2_22 {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner sc = new Scanner(System.in);
        
        // Menampilkan menu
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        int pilihan_menu = sc.nextInt();
        
        // Meminta input apakah pengguna adalah member atau tidak
        sc.nextLine();  // Untuk menghindari masalah dengan input string setelah input integer
        System.out.print("Apakah punya member (y/n) ? = ");
        String member = sc.nextLine();
        System.out.println("--------------------------------");

        // Inisialisasi variabel harga dan diskon
        int harga = 0;
        double total_bayar;
        double diskon = 1.0;  // Diskon default adalah 1.0 (tidak ada diskon)

        if (member.equalsIgnoreCase("y")) { // Menggunakan equalsIgnoreCase untuk membandingkan string
            diskon = 0.10;  // Member mendapatkan diskon 10%
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = Rp " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = Rp " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = Rp " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            
            // Menghitung total bayar setelah diskon
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = Rp " + total_bayar);
        } else if (member.equalsIgnoreCase("n")) { // Jika bukan member
            if (pilihan_menu == 1) {
                harga = 10000;
                System.out.println("Harga ricebowl = Rp " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = Rp " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = Rp " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            
            // Menghitung total bayar tanpa diskon
            total_bayar = harga;
            System.out.println("Total bayar = Rp " + total_bayar);
        } else {
            System.out.println("Member tidak valid");
            return;
        }

        // Menutup scanner
        sc.close();
    }
}
