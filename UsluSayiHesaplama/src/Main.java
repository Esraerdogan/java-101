import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,total = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz :  ");
        a = scan.nextInt();
        System.out.print("Üs olacak sayıyı giriniz : ");
        b = scan.nextInt();

        for (int i = 1; i <=b; i++){
                total *= a;
        }

        System.out.print("Cevap : " + total);

    }
}