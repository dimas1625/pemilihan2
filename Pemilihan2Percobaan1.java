/**
 * Pemilihan2Percobaan1
 */
import java.util.Scanner;
 public class Pemilihan2Percobaan1 {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        int tahun = input18.nextInt();
        System.out.println("Masukkan Tahun");
        
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");    
        } else
            System.out.println("Bukan Tahun Kabisat");     
        }
    }
} 