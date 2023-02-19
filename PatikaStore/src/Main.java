import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("PatikaStore Ürün Yönetim Paneli!");
        System.out.println(" 1- Notebook İşlemleri\n 2- Cep Telefonu İşlemleri\n 3- Marka Listele\n 0- Çıkış Yap\n");
        Scanner scan = new Scanner(System.in);
        int tercih = scan.nextInt();
        System.out.println("Tercihiniz : " + tercih);
        int secim = tercih;
            switch (secim) {

                case 1:
                        Notebook notebook = new Notebook(1, "HUAWEI Matebook 14 ", 7000, "Huawei", 512, 14.0, 16);
                        System.out.println(notebook);
                        break;

                case 2:
                        CepTelefonlari cepTelefonlari = new CepTelefonlari(1, "SAMSUNG GALAXY A51", 3199, " Samsung ", 128, 6.5, 32, 4000, 6, "Siyah");
                        System.out.println(cepTelefonlari);
                        break;

                case 3:
                        System.out.println("Markalarımız");
                        System.out.println("--------------");
                        String name = " -Apple\n -Asus\n -Casper\n -HP\n -Huawei\n -Lenovo\n -Monster\n -Samsung\n -Xioami\n";
                        System.out.println(name);
                        break;

                case 0:
                        System.out.println("Çıkış yapılıyor... Yine bekleriz!");
                        System.exit(0);

                default:
                    System.out.println("Eksik veya hatalı bir sayı girdiniz, lütfen kontrol ediniz!");
            }
        }

    }

