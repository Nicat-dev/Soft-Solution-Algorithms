package taskDay3.outAzerbaijaniLang;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static String[] birler = new String[]{"", "Bir", "İki", "Üç", "Dört", "Beş", "Altı", "Yeddi", "Sekkiz", "Doqquz"};
    public static String[] onlar = new String[]{"", "On ", "Yirmi ", "Otuz ", "qirx ", "Elli ", "Altmış ", "Yetmiş ", "Seksen ", "Doksan "};
    public static String[] yuzler = new String[]{"", "Yüz ", "İkiyüz ", "Üçyüz ", "Dörtyüz ", "Beşyüz ", "Altıyüz ", "Yeddiyüz ", "Sekkizyüz ", "Doqquzyüz "};
    public static String[] minlikler = new String[]{"", " Min ", " Milyon ", " Milyard ", " Trilyon "};

    public static void main(String[] args) {
        Scanner girisYap = new Scanner(System.in);
        System.out.print("Bir say girin : ");
        String i = girisYap.next();
        if (i.matches("[0-9]*")) {
            System.out.println(yazdir(Integer.parseInt(i)));
        } else {
            System.err.println("Sadece reqemlerden olan bir deyer girmelisiniz!!!");
        }
    }

    public static String yazdir(int sayi) {
        String netice = "";
        if (sayi > 0) {
            netice = reqemlerinaAyir(sayi);
        } else if (sayi < 0) {
            netice = "Menfi " + reqemlerinaAyir(Math.abs(sayi));
        } else {
            netice = "Sıfır";
        }
        return netice;
    }

    public static String reqemlerinaAyir(int sayi) {
        String netice = "", s = String.valueOf(sayi);
        int i = s.length();
        int b = i, x, n = 0;
        while (i > 0) {
            b = (b > 3 ? i - 3 : 0);
            netice = ayir(s.substring(b, i)) + minlikler[n] + netice;
            i = i - 3;
            n++;
        }
        if (netice.matches("(Bir) Min ([A-Za-zğüşıöçĞÜŞİÖÇ[\\s]]*)")) {
            Pattern p = Pattern.compile("(Bir) Min ([A-Za-zğüşıöçĞÜŞİÖÇ[\\s]]*)");
            Matcher m = p.matcher(netice);
            if (m.find()) {
                netice = "Min " + m.group(2);
            }
        }
        return netice;
    }

    public static String ayir(String s) {
        String netice = "";
        int i = s.length();
        switch (i) {
            case 3:
                netice = yuzler[Integer.parseInt(String.valueOf(s.charAt(i - 3)))];
            case 2:
                netice = netice + onlar[Integer.parseInt(String.valueOf(s.charAt(i - 2)))];
            case 1:
                netice = netice + birler[Integer.parseInt(String.valueOf(s.charAt(i - 1)))];
            default:
        }
        return netice;
    }
}

