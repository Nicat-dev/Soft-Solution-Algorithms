package taskDay2.task7;

public class Task7 {
    public static void main(String[] args) {
        String x = "azerbaycan portiqaliya yiqmasina qalib gelecek";
        x = x.toLowerCase();
        x = x.replaceAll("\\bqalib gelecek\\b", "meqlub olacaq");
        System.out.print(x);
    }
}
