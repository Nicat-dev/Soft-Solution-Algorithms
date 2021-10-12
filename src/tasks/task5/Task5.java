package tasks.task5;

public class Task5 {
    public static void main(String[] args) {
        int n1 = 27, n2 = 153, ebob = 1;

        while(n1 != n2)
        {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        System.out.println("EBOB = " + n1);

    }
}
