public class SearchElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int element = 6;
        int result = searchElement(arr, element);
        System.out.println(result);
    }

    public static int searchElement(int[] arr, int element) {

        for (int i = 0; i < arr.length; i++) {
            int result = 0;
            if (element == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
