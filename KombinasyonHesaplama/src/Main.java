import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long nFaktoriyel =1, rFaktoriyel=1,nrCarpim=1,n,r,total;

        Scanner scan = new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        n = scan.nextInt();
        System.out.print("R sayısını giriniz : ");
        r = scan.nextInt();

        for (int i=1; i<=n; i++){
            nFaktoriyel *= i;
        }for (int i=1; i<=r; i++){
            rFaktoriyel *= i;
        }for (int i=1; i<= n-r; i++){
            nrCarpim *= i;
        }

        total = nFaktoriyel/(rFaktoriyel * nrCarpim);
        System.out.print("Kombinasyon : " + total);



    }
}