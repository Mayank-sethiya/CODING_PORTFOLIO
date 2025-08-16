public class InsertionSort3 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // The element to be inserted
            int j = i - 1;

            // Shift elements of the array that are greater than `key` to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Move larger element one position ahead
                j--;
            }

            // Place `key` at the correct position
            arr[j + 1] = key;
        }

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
