package tasks.fourdTask;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {10,20,40,5,90};
        System.out.println(Arrays.toString(arr(arr)));
    }
    public static int[] arr(int[] arr){
        int[] arr1 = new int[arr.length];
        int index = 0;
        int index2 =0;
        int bigNumber = arr[0];
        int littleNumber = arr[0];
        for (int i = 0; i <arr.length; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i <arr1.length; i++) {
            if (bigNumber<arr1[i]){
                bigNumber = arr1[i];
                index = i;
            }
            if (littleNumber>arr1[i]){
                littleNumber = arr[i];
                index2 = i;
            }

        }
        arr1[index2] = bigNumber;
        arr1[index] = littleNumber;
        return arr1;
    }
}
