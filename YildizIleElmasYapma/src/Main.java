import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++){
            for (int k = 1; k <= (n-i); k++){
                System.out.println(" ");
            }
            for (int j = 1; j <= (2 * i -1); j++){
                System.out.println("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--){
            for (int j = 1; j <= n - i; j++){
                System.out.println(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.println("*");
            }
            System.out.println();
        }

    }
}