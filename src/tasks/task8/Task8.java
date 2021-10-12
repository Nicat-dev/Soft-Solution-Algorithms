package tasks.task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("eded daxil edin : ");
        int number = scanner.nextInt();
        int counter = 0;
        if (number<1){
            System.out.println("birden boyuk reqemler ola biler");
        }else{
            for (int i = 1; i <number; i++) {
                int result = number%i;
                if (result==0){
                    counter++;
                }
            }
        }
        if (2 < counter){
            System.out.println("bu eded murekkebdir");
        }else {
            System.out.println("bu eded sadedir");
        }
    }

}
