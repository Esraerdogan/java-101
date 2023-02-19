import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {10,20,10,10,20,5,20};
        System.out.println("Dizi : " + Arrays.toString(list));
        Arrays.sort(list);

        int count = 0;
        int num = list[0];
        System.out.println("Tekrar eden sayılar");

        for (int i = 0; i < list.length; i++){
            if (i == 0 || num != list[i]){
                for (int k : list){
                    if (k == list[i]){
                        count++;
                        num = list[i];
                    }
                }
            }

            System.out.println(list[i] + " ");
            count = 0;
        }


    }
}