package tasks.secondTask;

import java.util.Arrays;

public class SecondTask {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(array(arr)));
    }
    public static int[] array(int[] arr){
        int number = arr[0];
        int number2 = arr[1];
        int number3 = arr[arr.length-1];
        int number4 = arr[arr.length-2];
        arr[0] = number3;
        arr[1] = number4;
        arr[arr.length-1] =number;
        arr[arr.length-2] = number2;

        return arr;
    }
}
