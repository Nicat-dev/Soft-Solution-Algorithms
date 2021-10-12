package taskDay4.task2;


import java.util.ArrayList;
import java.util.List;


public class Task2 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList();

        String sentence = "Samir Kenan ile dostdur ve onlar hemise bir yerde oyanyir ve birlikde yemek yeyeirler";
        String word = "";
        char letter;
        for (int i = 0; i <sentence.length(); i++) {
            letter = sentence.charAt(i);
            if (letter != ' '){
                word = word + letter;
            }
            if (letter== ' '){
                arrayList.add(word);
                word = "";
            }
        }

        int[] arrays = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            arrays[i] = arrayList.get(i).length();
        }

        bubbleSort(arrays);

        String sentence2 ="";
        int n = arrays.length;
        n = removeDuplicateElements(arrays,n);
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <arrayList.size(); j++) {
                if (arrays[i] == arrayList.get(j).length()){
                    sentence2 = sentence2+ " "+arrayList.get(j);
                }
            }
        }
        System.out.println(sentence2);

    }







    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
    public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }

}
