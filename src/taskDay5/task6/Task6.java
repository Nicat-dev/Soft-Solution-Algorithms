package taskDay5.task6;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(triangleShape(3,4,5));
    }

    public static double triangleShape(double a,double b,double c){
        double perimetire = a+b+c;
        double perimetireHalf = perimetire/2;
        double herone = (perimetireHalf-a)*(perimetireHalf-b)*(perimetireHalf-c);
        double result = Math.sqrt(herone);
        return result;
    }
}
