package taskDay2.task1;

import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {

        String x = "alma min bir dermanidir. Alma gözəl meyvədir alma gözəl meyvədir alma da çoxlu vitamin var";
        x = x.toLowerCase();
        x = x.replaceAll("\\balma\\b", "****");
        System.out.print(x);
    }
}
