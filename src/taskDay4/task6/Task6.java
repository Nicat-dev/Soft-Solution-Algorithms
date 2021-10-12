package taskDay4.task6;

public class Task6 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},
                {1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][i];
        }
        System.out.println(sum);
        int sum2 = 0;
        int counter = arr.length;
        while (counter>0){
            sum2 = sum2 + arr[counter-1][counter-1];
            counter--;
        }
        System.out.println(sum2);
    }
}
