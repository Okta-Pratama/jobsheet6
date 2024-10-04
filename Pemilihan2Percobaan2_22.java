import java.util.Scanner;

public class Pemilihan2Percobaan2_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======== MENU KAFE JTI ========");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        int pilihan_menu = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Apakah punya member (y/n) ? = ");
        String member = sc.nextLine();
        
        System.out.print("Metode pembayaran QRIS (Y/N) = ");
        String metodePembayaran = sc.nextLine();
        System.out.println("--------------------------------");
        
        int harga = 0;
        double total_bayar;
        double diskon = 1.0;
        int potonganQRIS = 1000;
        
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
            return;
        }
        
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
        } else if (!member.equalsIgnoreCase("n")) {
            System.out.println("Member tidak valid");
            return;
        }
        
        total_bayar = harga - (harga * diskon);
        
        if (metodePembayaran.equalsIgnoreCase("Y")) {
            total_bayar -= potonganQRIS;
            System.out.println("Anda menggunakan metode pembayaran QRIS. Potongan Rp 1.000 diberikan.");
        } else if (!metodePembayaran.equalsIgnoreCase("N")) {
            System.out.println("Metode pembayaran tidak valid. Hanya QRIS yang diterima.");
            return;
        }
        
        System.out.println("Total bayar setelah diskon dan potongan = Rp " + total_bayar);
        System.out.println("===============================");
        
        sc.close();
    }
}
