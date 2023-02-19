import java.util.Scanner;

public class Main {

    static int desen1 (int a ){
        int b = a;

        if (a > 0){
            a -= 5;
            System.out.println(a);
            return desen1(a);
        }
        if (a <= 0){
            a += 5;
            System.out.println(a);
            if (b == a){
                return  a;
            }
            return desen2(a,b);
        }
        return 0;
    }

    static int desen2(int c, int b){
        c += 5;
        System.out.println(c);
        if (b <= c){
            return 0;
        }
        else{
            return desen2(c,b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.print("N sayısı : ");
        sayi = scanner.nextInt();
        System.out.println("Çıktısı : " + sayi);
        desen1(sayi);

    }
}