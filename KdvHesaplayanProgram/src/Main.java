import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar,kdvOran = 0.18, kdvTutar,kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();

        String sayiOrani = (tutar >= 0 && tutar <= 1000) ? "Sayıya göre KDV Oranı => 18%" : "Sayıya göre KDV Orani - 8%";
        System.out.println(sayiOrani);
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: " +tutar);
        System.out.println("KDV Oranı: " +kdvOran);
        System.out.println("KDV Tutarı: " +kdvTutar);
        System.out.println("KDV'li Tutar: " +kdvliTutar);



    }
}