package taskDay4.task1;

public class Task1 {
    public static void main(String[] args) {
        int[][] arr = {{78,12,3,3,2,74},{48,52,4,3,9,74},{25,12,6,2,66,69},
                {15,96,4,3,6,74},{38,41,5,3,6,74},{79,14,4,7,6,74}};

        for (int i = 0; i <arr.length; i++) {
            int number=0;
            for (int j = 0; j <arr[i].length; j++) {
                if (number<arr[i][j]){
                    number = arr[i][j];
                }
            }
            System.out.println(i+1+ "ci massivin boyuk ededi : "+number);
        }

    }
}
