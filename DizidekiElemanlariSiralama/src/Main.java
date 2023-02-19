import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Dizinin boyutu n : ");
         b = scanner.nextInt();
         int[] list = new int[b];

         for (int i = 0; i < list.length; i++){
             System.out.println("Dizinin " + (i + 1) + ". elemanını giriniz : ");
             a= scanner.nextInt();
             list[i] = a;
         }

        Arrays.sort(list);
        System.out.println("Sıralama : " + Arrays.toString(list));



    }
}