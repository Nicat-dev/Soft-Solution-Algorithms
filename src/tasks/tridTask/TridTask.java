package tasks.tridTask;

public class TridTask {
    public static void main(String[] args) {
        int[] arr = {12,15,90,35,40};
        System.out.println(bigNumber(arr));
    }
    public static int bigNumber(int[] a){
        int number = a[0];
        for (int i = 0; i <a.length; i++) {
            if (number< a[i]){
                number = a[i];
            }
        }
        return number;
    }
}
