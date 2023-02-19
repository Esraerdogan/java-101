import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();

        int sum = 0, counter = 0;

        for (int i = 0; i <= sayi; i++){
            if (i % 3 == 0 && i % 4 == 0){
                sum += i;
                counter ++;

            }
        }

        double ortalama = sum/counter;
        if (sum != 0){
            System.out.println("Ortalama : " + ortalama);
        }else{
            System.out.println(sayi + " Sayısının içinde 3'e ve 4'e tam bölünebilen bir sayı bulunamadı!");
        }
    }
}