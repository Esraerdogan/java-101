import java.util.Scanner;

public class Main {

    static void hesapla (){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Taban sayıyı giriniz : ");
            int taban = scanner.nextInt();
            System.out.print("Üs giriniz : ");
            int us = scanner.nextInt();
            int result = 1;

            for (int i = 1; i <= us; i++){
                result *= taban;
            }
            System.out.println("Sonuç : " + result);
        }
    }

    public static void main(String[] args) {

       hesapla();
    }
}