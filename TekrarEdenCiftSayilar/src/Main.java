import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] list = {3,7,5,3,2,4,8,2,4,8,16,16,1};

        Arrays.sort(list);
        int count = 0;
        int num = list[0];
        System.out.println("Tekrar eden sayılar");

        for (int i = 0; i < list.length; i++) {
            if (i == 0 || num != list[i]) {
                if (i%2==0) {
                    for (int k : list) {
                        if (k == list[i]) {
                            count++;
                            num = list[i];
                        }
                    }
                }

                System.out.print(list[i] +  " ");
                count = 0;
            }
        }

    }
}