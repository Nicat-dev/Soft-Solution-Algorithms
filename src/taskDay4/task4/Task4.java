package taskDay4.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numberString = String.valueOf(number);
        int checkNumber = 0;
        int counter = 1;

            for (int i = 0; i < numberString.length(); i++) {
                checkNumber = checkNumber + Integer.parseInt(String.valueOf(numberString.charAt(i)));
                number = number- checkNumber;
                if (number>0){
                    counter++;
                }else {
                    break;
                }
                numberString = String.valueOf(number);

        }

        System.out.println(counter);
    }
}
