import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            int insert = list.get(i);
            for(int j = 0; j < result.size(); j++) {
                if(insert < result.get(j)) {result.add(j, insert); break;}
                if(j == result.size()-1) {result.add(insert); break;}
            }
            if(result.size() == 0) {result.add(insert);}
        }
        return result;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        return mergeRec(arr1, arr2, result, 0, 0, 0);
    }
    public static int[] mergeRec(int[] arr1, int[] arr2, int[] result, int i, int j, int idx) { 
        if(result.length == idx) {
            return result;
        }
        int insert = Math.min(arr1[i], arr2[j]);
        if(insert == arr1[i] && i < arr1.length-1) {i++;}
        if(insert == arr2[j] && j < arr2.length-1) {j++;}
        System.out.println(arr1[i]);
        System.out.println(arr2[j]);
        result[idx] = insert;
        idx++;
        return mergeRec(arr1, arr2, result, i, j, idx);
    }

    //Worked on for 45+ minutes

    public static void main(String[] args) {
        // You can test your code here
    }
}
