import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int s1, s2, sec;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        s1 = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz : ");
        s2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiniz : ");
        sec = input.nextInt();

        switch (sec){
            case 1:
                System.out.println("Toplam : " +(s1 + s2));
                break;
            case 2:
                System.out.println("Fark : " +(s1 - s2));
                break;
            case 3:
                System.out.println("Çarpım : "+(s1 * s2));
                break;
            case 4:
                System.out.println("Bölüm : "+(s1 / s2));
                break;
            default:
                System.out.println("Lütfen Dört İşlemden Birini Seçiniz!");
        }
    }
}