public class SortAndSearch {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {5, 2, 8, 1, 7, 3, 6, 4};

        // Sorting the array manually (using bubble sort)
        manualBubbleSort(numbers);

        // Displaying the sorted array
        System.out.print("Sorted Array: ");
        displayArray(numbers);

        // Searching for an element in the sorted array manually (using linear search)
        int targetElement = 7;
        int index = manualLinearSearch(numbers, targetElement);

        if (index >= 0) {
            System.out.println(targetElement + " found at index " + index);
        } else {
            System.out.println(targetElement + " not found in the array");
        }
    }

    // Manual bubble sort implementation
    private static void manualBubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Manual linear search implementation
    private static int manualLinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }

    // Utility method to display the contents of an array
    private static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
