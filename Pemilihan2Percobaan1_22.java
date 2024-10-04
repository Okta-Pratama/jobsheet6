import java.util.Scanner;

public class Pemilihan2Percobaan1_22 {
    public static void main(String[] args) {
        Scanner inputTahun = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = inputTahun.nextInt();

        if (tahun % 4 == 0) {
            if (tahun % 100 == 0){
                if (tahun % 400 == 0){
                    System.out.println("tahun kabisat.");
                } else {
                    System.out.println("bukan tahun kabisat.");
                }
            } else {
                System.out.println("bukan tahun kabisat.");
            }
        } else {
            System.out.println("bukan tahun kabisat.");
        }

        inputTahun.close();
    }
}
