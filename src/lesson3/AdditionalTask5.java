package lesson3;

import java.util.Arrays;

public class AdditionalTask5 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50);
            System.out.print(" " + arr[i]);
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
