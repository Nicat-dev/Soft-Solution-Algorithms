package tasks.firstTask;

public class FirstTask {
    public static void main(String[] args) {
        int fact=1;
        int number=6;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("daxil edilen eded :"+number+ " faktoriali : "+fact);
    }

}
