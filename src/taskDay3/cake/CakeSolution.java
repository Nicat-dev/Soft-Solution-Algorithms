package taskDay3.cake;

import java.util.Scanner;

public class CakeSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tortun eni : ");
        double a = scanner.nextDouble();
        System.out.println("tortun uzunluqu : ");
        double b = scanner.nextDouble();
        System.out.println("masanin radiusu: ");
        double r = scanner.nextDouble();
        boolean check;

        double tort = tort(a,b);
        System.out.println(tort);
        double masa = masa(r);

        if (tort<=masa){
            check = true;
            System.out.println(check);
        }else {
            check = false;
            System.out.println(check);
        }

    }
    public static double tort(double a , double b){
        double pifaqor = a*a + b*b;
        double dioqnal = Math.sqrt(pifaqor);
        return dioqnal;
    }

    public static double masa(double radius){
        double dioqnal = radius*2;
        return dioqnal;
    }
}
