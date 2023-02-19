import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık Giriniz : ");
        sicaklik = input.nextInt();

        if (sicaklik < 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinemaya gidebilirsiniz\nKayak yapabilirsiniz.");
            if (sicaklik >=10 && sicaklik <= 25){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}