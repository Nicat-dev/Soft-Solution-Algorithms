package tasks.palindrome;


public class Palindrom {
    public static void main(String[] args) {
        for (int j = 10; j <10000 ; j++) {
            int palindrom = j;
            int ilkdeger = palindrom;
            int length = String.valueOf(palindrom).length();
            int kalan, deger = 0;
            for (int i = 0; i < length; i++) {

                kalan = palindrom % 10;
                deger = deger * 10 + kalan;
                palindrom = palindrom / 10;
            }
            if (deger == ilkdeger) {
                System.out.println(deger);
            }
        }
    }
}
