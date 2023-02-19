import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak Sayısı : ");
        int x = scanner.nextInt();

        for (int i = x; i >= 1; i--){
            for (int j = x; j > i; j--){
                System.out.println(" ");
            }
            for (int m = 1; m <= (2*i)-1; m++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}