import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = scan.nextInt();

            if (sayi % 2 == 0 && sayi == sayi){
                System.out.println(sayi + " Mükemmel sayıdır.");
            }else{
                System.out.println(sayi + " Mükemmel sayı değildir.");
            }

    }


}



