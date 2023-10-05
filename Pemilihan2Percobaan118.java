import java.util.Scanner;

public class Pemilihan2Percobaan1 {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = input18.nextInt();

        if (isTahunKabisat(tahun)) {
            System.out.println(tahun + " adalah tahun kabisat.");
        } else {
            System.out.println(tahun + " bukan tahun kabisat.");
        }
    }

    // Method untuk mengecek apakah sebuah tahun adalah tahun kabisat
    public static boolean isTahunKabisat(int tahun) {
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}