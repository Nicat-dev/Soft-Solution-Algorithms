package taskDay3.bindaryToHexaDemical;

import java.util.Scanner;

public class BinaryToHexademical {


    public static String toHex(int number){
        int index;
        char[] hexchars={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexNumber = "";
        while (number>0){
            index = number%16;
            hexNumber = hexchars[index]+hexNumber;
            number = number/16;
        }
        return hexNumber;
    }

    public static int hexToDem(String hex){

        String number ="123456789ABCDEF";
        hex = hex.toUpperCase();
        int value = 0;
        for (int i = 0; i <hex.length(); i++) {
            char numberIndex = hex.charAt(i);
            int digit = number.indexOf(numberIndex)+1;
            value = 16*value + digit;
        }

        return value;
    }

    public static int toDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }

   public static String binaryToHexademical(int number){
       int getter = toDecimal(number);
       String setter = toHex(getter);
       return setter;
   }

    public static void main(String[] args) {
        System.out.println("binaryToHex : "+binaryToHexademical(1001));
    }


}
