package tasks.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int number, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Reqem daxil edin: ");
        number = sc.nextInt();
        while(number > 0)
        {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Cemi: "+sum);
    }

}
