package taskDay4.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number : ");
        String number = scanner.nextLine();
        int checkNumber = 0;
        for (int i = 0; i <number.length(); i++) {
            checkNumber = checkNumber + Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        if (checkNumber%2==0 && checkNumber%3==0){
            System.out.println(number+ " ededi 6ya bolunur");
        }else {
            System.out.println("6ya bolunmur");
        }
    }
}
