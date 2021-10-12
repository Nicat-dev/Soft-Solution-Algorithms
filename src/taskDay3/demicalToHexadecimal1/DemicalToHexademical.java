package taskDay3.demicalToHexadecimal1;

public class DemicalToHexademical {
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

    public static void main(String[] args) {
        System.out.println("Hexadecimal: "+toHex(28));


    }

}
