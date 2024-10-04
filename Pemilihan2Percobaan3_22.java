import java.util.Scanner;

public class Pemilihan2Percobaan3_22 {
    public static void main(String[] args) {
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Kategori: ");
        kategori = sc.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan: ");
        penghasilan = sc.nextInt();

        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.25;
            }
        } else {
            System.out.println("Kategori salah");
            sc.close();
            return; 
        }

        gajiBersih = (int) (penghasilan - (penghasilan * pajak));
        System.out.println("Gaji Bersih: " + gajiBersih);
        
        sc.close(); 
    }
}
