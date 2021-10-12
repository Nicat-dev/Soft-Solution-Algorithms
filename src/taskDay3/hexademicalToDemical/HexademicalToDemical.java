package taskDay3.hexademicalToDemical;

public class HexademicalToDemical {
    public static int toDem(String hex){

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

    public static void main(String[] args) {
        System.out.println("Decimal of a is: "+toDem("ab"));
    }

}
