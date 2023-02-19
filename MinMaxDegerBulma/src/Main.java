import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz ? : ");
        int sayi = scan.nextInt();
        int min = 0, max = 0;
        int ekle;
        int i = 1;

        while (i <= sayi){
            if (i == 1){
                System.out.print("1. Sayıyı giriniz :  ");
                ekle = scan.nextInt();
                min = ekle;
                max = ekle;
            } else if (i > 1) {
                System.out.print(i+". Sayıyı giriniz : ");
                ekle = scan.nextInt();
                if (ekle < min){
                    min = ekle;
                } else if (ekle > max) {
                    max = ekle;
                }
            }
            i++;
        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
}