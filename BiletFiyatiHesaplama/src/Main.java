import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mesafe,yas,yolculukTipi;
        double baslangicFiyati = 0.10;
        int normalTutar, sonuc, indirimliTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş) : ");
        yolculukTipi = input.nextInt();

        normalTutar = (int)(mesafe * baslangicFiyati);

        if ( yolculukTipi == 1 || yolculukTipi == 2){
            if (yas < 12){
                sonuc = (int) (normalTutar * 0.50);
                indirimliTutar = (int) (sonuc - 0.50);
                System.out.println("Toplam Tutar : " + indirimliTutar + " TL");
            } else if (yas >= 12 && yas <= 24) {
                sonuc = (int) (normalTutar * 0.10);
                indirimliTutar = (int)( sonuc - 0.10);
                System.out.println("Toplam Tutar : " + indirimliTutar + " TL");
            } else if (yas >= 65) {
                sonuc = (int) (normalTutar * 0.30);
                indirimliTutar = (int) (sonuc - 0.30);
                System.out.println("Toplam Tutar : " + indirimliTutar + " TL");
            } else if (yolculukTipi == 2) {
                sonuc = (int) (normalTutar * 0.20);
                indirimliTutar = (int) (sonuc - 0.20);
                System.out.println("Toplam Tutar : " + indirimliTutar + " TL");
            }else {
                System.out.println("Toplam Tutar : " + normalTutar + " TL");
            }
        }else {
            System.out.println("Hatalı Veri Girdiniz!");
        }

    }
}