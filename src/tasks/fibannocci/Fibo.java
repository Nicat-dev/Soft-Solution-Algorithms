package tasks.fibannocci;

public class Fibo {
    public static void main(String[] args) {
        /*
        *
            int n1=0,n2=1,n3,i,count=10;
            System.out.print(n1+" "+n2);
            for(i=2;i<count;++i)
            {
                n3=n1+n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;
            }
            * */

        int count = 10, num1 = 0, num2 = 1;
        System.out.print("Fibonacci seriyasi  "+count+" reqemler:");

        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
}
