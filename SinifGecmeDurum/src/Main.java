import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        System.out.println("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        System.out.println("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        System.out.println("Müzik notunuzu giriniz :  ");
        muzik = input.nextInt();

        if (mat > 0 && mat <= 100 && fizik > 0 && fizik <= 100 &&
                turkce > 0 && turkce <=100 && kimya > 0 &&
                kimya <= 100 && muzik > 0 && muzik <= 100){

            double ortalama = (mat + fizik + turkce + kimya + muzik) / 5;
            if (ortalama < 55 ){
                System.out.println("Ortalamanız : " + ortalama + "Kaldınız!");
            }else {
                System.out.println("Ortalamanız : " + ortalama + "Tebrikler! Geçtiniz!");
            }
        }else{
            System.out.println("Lütfen geçerli bir not giriniz : 0-100!");
        }






    }

}