import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c;
        double u,cevre,alan;

        Scanner input = new Scanner(System.in);
        System.out.println("Üç kenar uzunluğu giriniz. ");

        System.out.println("a sayısı: ");
        a = input.nextInt();

        System.out.println("b sayısı: ");
        b = input.nextInt();

        System.out.println("c sayısı");
        c = input.nextInt();

        u = (a+b+c) / 2;
        cevre = 2 * u;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Çevre: " +cevre);
        System.out.println("Alan: " +alan);

    }
}