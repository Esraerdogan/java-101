import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, login, newPassword = null;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adınızı Giriniz : ");
        userName = input.nextLine();
        System.out.println("Şifrenizi Giriniz : ");
        password = input.nextLine();

        if (userName.equals("esra") && password.equals("java123")){
            System.out.println("Giriş Yaptınız !");
        }else{
            System.out.println("Bilgileriniz Yanlış! Şifrenizi Sıfırlamak İster Misiniz?\nEvet-Hayır");
            login = input.nextLine();
            if (login.equals("Evet")){
                System.out.println("Yeni Şifrenizi Giriniz : ");
                newPassword = input.nextLine();
            }if (newPassword.equals("java123")){
                System.out.println("Yeni Şifre Eskisiyle Aynı Olamaz! Başka Bir Şifre Deneyiniz.");
            }else{
                System.out.println("Şifre Oluşturuldu!");
            }

        }

    }
}