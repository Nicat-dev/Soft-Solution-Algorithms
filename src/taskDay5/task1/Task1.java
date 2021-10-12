package taskDay5.task1;

public class Task1 {
    public static void main(String[] args) {
        int massive[] = {1,5,3,6,7,8,9,10,11,9};
        int first = massive[0];
        int second = massive[1];
        int tree = massive[2];
        for (int i = 3; i < massive.length; i++) {
            if (i+1 == massive.length){
                break;
            }
            if (first<second){
                first = 0;
                if (second<tree){
                    second = 0;
                    System.out.println(tree);
                }else {
                    tree = 0;
                    System.out.println(second);
                }
            }else {
                if (first<tree){
                    first = 0;
                    System.out.println(tree);
                }else {
                    tree = 0;
                    System.out.println(first);
                }
            }

            if (first == 0 && second ==0){
                first = massive[i];
                second = massive[i+1];
            }else if (first == 0 && tree ==0){
                first = massive[i];
                tree = massive[i+1];
            }else {
                first = massive[i];
                tree = massive[i+1];
            }

        }
    }
}
