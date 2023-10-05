import java.util.Scanner;

 public class Pemilihan2Percobaan218 {
 
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        System.out.println("Masukkan Panjang Sisi 1 : ");
        float sisi1 = input18.nextFloat();
        System.out.println("Masukkan Panjang Sisi 2 : ");
        float sisi2 = input18.nextFloat();
        System.out.println("Masukkan Panjang Sisi 3 : ");
        float sisi3 = input18.nextFloat();
        
        if (sisi1 == sisi2 && sisi2 == sisi3) {
            if ((sisi1 == sisi2) || (sisi1 == sisi3) || (sisi2 == sisi3))
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");    
        } else 
            System.out.println("Segitiga tersebut adalah segitiga sembarang");
       }
    }    