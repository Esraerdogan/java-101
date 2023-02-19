import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("Yarıçapı giriniz: ");
        int r = input.nextInt();

        System.out.println("Merkez açısını giriniz: ");
        int a = input.nextInt();

        double sonuc = (pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı: " +sonuc);
    }
}