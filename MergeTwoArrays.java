import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 54, 1, 0};
        int[] mergedArr = new int[arr1.length + arr2.length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];
            count++;
        }
        for (int i : arr2) {
            mergedArr[count++] = i;
        }
        for (int i : mergedArr)
            System.out.print(i +" ");

        //USING COLLECTIONS
        Integer[] a1 = {1, 2, 3, 4};
        Integer[] a2 = {24,67,89,2};
        List list = new ArrayList();
        list.addAll(Arrays.asList(a1));
        list.addAll(Arrays.asList(a2));
        list.toArray();
        System.out.println(list);
    }
}