import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0){
            System.out.print("Kullanıcı Adınızı Giriniz : ");
            userName = input.nextLine();
            System.out.print("Şifrenizi Giriniz : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Patika bankasına hoş geldiniz.");
                do {
                    System.out.println(
                                    "1-Para Yatırma\n" +
                                    "2-Para Çekme\n" +
                                    "3-Bakiye Sorgula\n" +
                                    "4-Çıkış Yap");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırılacak miktarı giriniz : ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekilecek miktarı giriniz : ");
                             price = input.nextInt();
                            if (price > balance){
                                System.out.println("Bakiye yetersiz!");
                            }else{
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                }while (select != 4);
                System.out.println("Çıkış yapılıyor...Yine bekleriz!");
                break;
            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Lütfen tekrar deneyiniz.");
                if (right == 0){
                    System.out.println("Hesap bloke olmuştur. Lütfen banka ile iletişime geçiniz!");
                }else{
                    System.out.println("Kalan hakkınız : " + right);
                }

            }

        }


    }
}