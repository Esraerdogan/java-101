import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi = input.nextInt();
        isAsal(sayi,2);
    }

    static boolean isAsal(int sayi, int i){
        if (i == sayi){
            System.out.println(sayi + " sayısı ASALDIR!");
            return true;
        }else if (sayi % i == 0){
            System.out.println(sayi + " sayısı ASAL DEĞİLDİR!");
            return false;
        }
        return isAsal(sayi, i + 1);
    }
}