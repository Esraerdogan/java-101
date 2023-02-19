import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 0, y = 1, z, t;

        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci Serisinin Eleman Sayısını Giriniz : ");
        t = scan.nextInt();
        System.out.print(x+","+y);

        for (int i = 2; i <= t; i++){
            z = x+y;
            System.out.print(","+ z);
            x = y;
            y = z;
            System.out.print(" ");
        }

    }
}