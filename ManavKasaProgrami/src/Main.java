import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut, elma,domates,muz,patlican;

        double armutKg = 2.14;
        double elmaKg = 3.67;
        double domatesKg = 1.11;
        double muzKg = 0.95;
        double patlicanKg = 5.00;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç kilo? : ");
        armut = input.nextDouble();
        System.out.println("Elma kaç kilo? : ");
        elma = input.nextDouble();
        System.out.println("Domates kaç kilo? : ");
        domates = input.nextDouble();
        System.out.println("Muz kaç kilo? : ");
        muz = input.nextDouble();
        System.out.println("Patlıcan kaç kilo? : ");
        patlican = input.nextDouble();

        double toplam = (armut * armutKg) + (elma * elmaKg) +
                (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);

        System.out.println("Toplam tutar : " + toplam +" TL");

    }
}