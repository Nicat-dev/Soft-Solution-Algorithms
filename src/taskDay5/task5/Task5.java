package taskDay5.task5;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(pow(2,3));
    }

    public static double pow(double a, double b){
        double temp = a;
        for (int i = 1; i < b; i++) {
            a =a*temp;
        }
        return a;
    }

}
