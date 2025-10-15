public class LinearSearch {

    /**
     * Performs a linear search to find a target value in an array.
     *
     * @param arr The array of integers to search through.
     * @param target The value to search for.
     * @return The index of the target element if found; returns -1 otherwise.
     */
    public static int linearSearch(int[] arr, int target) {
        int n = arr.length;

        // Traverse the array from the first element to the last
        for (int i = 0; i < n; i++) {
            // Check if the current element matches the target
            if (arr[i] == target) {
                // Target found! Return its index
                return i;
            }
        }

        // Target was not found in the entire array
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {5, 12, 9, 3, 22, 18, 4};
        int target1 = 22; // Element present
        int target2 = 10; // Element not present

        // Search for target1
        int index1 = linearSearch(data, target1);
        if (index1 != -1) {
            System.out.println("Target " + target1 + " found at index: " + index1); // Output: 4
        } else {
            System.out.println("Target " + target1 + " not found in the array.");
        }

        // Search for target2
        int index2 = linearSearch(data, target2);
        if (index2 != -1) {
            System.out.println("Target " + target2 + " found at index: " + index2);
        } else {
            System.out.println("Target " + target2 + " not found in the array."); // Output: not found
        }
    }
}
