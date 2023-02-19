import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int matematik, fizik, kimya, turkce, tarih, muzik;

        System.out.println("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        int toplam = matematik+fizik+kimya+turkce+tarih+muzik;
        double ortalama = toplam/6;

        System.out.println("Ortalamanız " +ortalama);

        boolean gectiMi = (ortalama > 60);
        System.out.println("Sınıfı geçtiniz mi? " +gectiMi);
    }
}