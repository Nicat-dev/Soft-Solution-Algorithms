package taskDay3.tree;

public class TreeSolution {
    public static void main(String[] args) {
        System.out.println(operation(7));

    }

    public static int operation (int agac){
        int first = faktorial(agac);
        int second = faktorial(3)*faktorial(agac-3);
        return first/second;
    }
    public static int faktorial (int fact){
        int faktoriyel = 1;
        for(int i = 1; i<= fact; i++){
            faktoriyel = faktoriyel * i;
        }
        return faktoriyel;
    }


}
