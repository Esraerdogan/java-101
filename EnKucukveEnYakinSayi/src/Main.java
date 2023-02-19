import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int[] list = {15,12,788,1,-1,-778,2,0};

        Scanner scan = new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        int number = scan.nextInt();

        Arrays.sort(list);

        int maxNumber=0;
        int minNumber=0;

        for (int i:list){
            if (number<i){
                maxNumber=i;
                break;
            }

        }
        int[] reverse = new int [list.length];
        for(int i=0,j=list.length-1;i<list.length;i++,j--) {
            reverse[i]=list[j];
        }
        for (int i:reverse){
            if (i<number){
                minNumber=i;
                break;

            }
        }
        //System.out.println("girilen sayı:"+ number);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + minNumber);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + maxNumber);




    }
}