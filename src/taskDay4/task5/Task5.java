package taskDay4.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a : ");
        double a = scanner.nextInt();
        System.out.print("b : ");
        double b = scanner.nextInt();
        System.out.print("c : ");
        double c = scanner.nextInt();
        if (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)){
            System.out.println("duzbucaqlidir");
        }else if (Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2)){
            System.out.println("duzbucaqlidir");
        }else if (Math.pow(b,2)+Math.pow(c,2)==Math.pow(a,2)){
            System.out.println("duzbucaqlidir");
        }else {
            System.out.println("duzbucaqli deyil");
        }
    }
}
