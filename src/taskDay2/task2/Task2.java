package taskDay2.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String num1 = num.substring(0,12);
        String num2 = num.substring(13,25);
        if (num1 == num2){
            System.out.println("its palindrome");
        }else {
            System.out.println("its not palindrome");
        }
    }

}
