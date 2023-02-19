import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        a = input.nextInt();

        for (int i = 1; i <= a; i *= 4){
            System.out.println("4'ün kuvvetleri : " + i);;
        }
        for (int i = 1; i <=a; i *= 5){
            System.out.println("5'in kuvvetleri : " + i);
        }
    }
}