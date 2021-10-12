package taskDay2.task5;

public class Task5 {
    public static void main(String[] args) {
        String sentence = "indi biz qovduq onlari";
        int counter = 0;
        int reader = 0;
        for (int i = 0; i <sentence.length(); i++) {

            if (sentence.charAt(i) != ' '){
                counter++;
            }
            if (sentence.charAt(i) == ' '){
                System.out.println(sentence.substring(reader,i) +" - "+ counter);
                counter = 0;
            }
        }
    }
}
