package Giris;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        /*int kisaKenar = 10, uzunKenar = 20;
        int alan = kisaKenar * uzunKenar;
        int cevre = 2 * (kisaKenar+uzunKenar);
        System.out.println(alan);
        System.out.println(cevre);*/

        /*int m = -12, n = -5;
        int sonuc = m%n;
        System.out.println(sonuc);*/

        /*int a ;
        Scanner input = new Scanner(System.in);
        System.out.println("A sayısını giriniz : ");
        a = input.nextInt();
        System.out.println(a);*/

        //if-else blokları

        /*int a = 20, b =10;
        if((a<b) && (b++ < 25)){
            System.out.println(a);
        }else{
            System.out.print(a);
        }
        System.out.println(b);*/

        /*int points = 6;
        switch (points){
            case 6: ;
            case 7 :
                System.out.println("Java");break;
            case 8: ;
            case 9 :
                System.out.println("101");break;
            case 10 :
                System.out.println("Patika");break;
            default:
                System.out.println("Dev");*/

           /* int i = 1, j = 1;
            while (i<3)
            {
                do {
                    System.out.println(j +",");
                    j++;
                }while (j<4);
                i++;
            }*/

        /*int sum = 0;
        for (int i = 0, j = 0; i < 5 || j< 5; ++i, j = i + 1){
            sum += i;
        }
        System.out.println(sum);*/

        /*int i = 0;
        for (i = 1; i <= 6; i++){
            if (i%3 == 0)
                continue;
            System.out.println(i + ",");
        }*/

       /* for (int i = 1; i<= 2; ++i){
            for (int j = 1; j < 4; ++j){
                if (i == 1) continue;
                System.out.println(i + j);
            }
        }*/

        for (int k = 0; k < 9; k++){
            System.out.println("*");
            if (k == 3)
                break;
        }


    }
}
