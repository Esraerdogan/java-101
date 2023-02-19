import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi,toplam = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Sayı Giriniz : ");
            sayi = input.nextInt();
            if (sayi % 4 == 0){
                toplam += sayi;
            } else if (sayi % 2 == 0) {
                toplam += sayi;
            }
        }while (sayi % 2 != 1);
        System.out.println("Toplam : " + toplam);
    }
}