package taskDay2.task6;

public class Task6 {
    static boolean checkPalin(String word)
    {
        int n = word.length();
        word = word.toLowerCase();
        for (int i=0; i<n; i++,n--)
            if (word.charAt(i) != word.charAt(n - 1))
                return false;
        return true;
    }

    static void countPalin(String str)
    {

        str = str + " ";

        String word = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (ch != ' ')
                word = word + ch;
            else {
                if (checkPalin(word))
                    System.out.println(word);
                word = "";
            }
        }

    }

    public static void main(String args[])
    {
        countPalin("bir millet iki dovlet ana veten");

    }
}
