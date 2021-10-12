package taskDay2.task3;

import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        String[] arr ={"utu","kitab","ezize"};
        palindrome(arr);
    }
    public static void palindrome(String[] arr) {

        Stack<Character> stack = new Stack<>();

        for (int j = 0; j < arr.length; j++) {
            String origString = arr[j];
            String checker = origString;


            for (int i = 0; i < origString.length(); i++) {
                stack.push(origString.charAt(i));
            }

            String reverseString = "";

            while (!stack.isEmpty()) {
                reverseString = reverseString + stack.pop();
            }


            if (origString.equals(reverseString)) {
                System.out.println(checker+" is a palindrome.");
            } else {
                System.out.println(checker+" is not a palindrome.");
            }
        }
    }

}
