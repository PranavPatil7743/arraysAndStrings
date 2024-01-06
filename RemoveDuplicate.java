public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {105, 105, 206, 303, 303, 404, 505, 611, 611};
        System.out.println(removeDuplicate(arr));
    }

    public static int removeDuplicate(int[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }

}
