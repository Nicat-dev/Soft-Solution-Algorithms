package tasks.task10;

public class Task10 {
    public static void main(String[] args) {
        for (int j = 10; j <10000 ; j++) {
            int palindrom = j;
            int ilkdeyer = palindrom;
            int length = String.valueOf(palindrom).length();
            int qalan, deyer = 0;
            for (int i = 0; i < length; i++) {

                qalan = palindrom % 10;
                deyer = deyer * 10 + qalan;
                palindrom = palindrom / 10;
            }
            for (int n = 0; n <1; n++) {
                int counter1 =0;
                int counter2=0;
                for (int i = 1; i < deyer; i++) {
                    int result = deyer % i;
                    if (result == 0) {
                        counter1++;
                    }
                }

                for (int p = 1; p <ilkdeyer; p++) {
                    int result = ilkdeyer % p;
                    if (result == 0) {
                        counter2++;
                    }
                }

                if (counter1<=2){
                    if (counter2<=2){
                        System.out.println(ilkdeyer);
                    }
                }
            }
        }
    }
}
