import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = scan.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = scan.nextInt();

        int ebob =1, ekok;

        int i = 1;
        if (n1 <= n2){
            while (i <= n1){
                if ((n1 % i == 0) && (n2 % i == 0)){
                    ebob = i;
                }
                i++;
            }
        }else{
            while (i <= n2){
                if ((n1 % i == 0) && (n2 % i == 0)){
                    ebob = i;
                }
                i++;
            }
        }
        System.out.println("EBOB : " + ebob);
        ekok = (n1 * n2) / ebob;
        System.out.println("EKOK : " + ekok);
        ;
    }
}