public class Searching {
    public void linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        
        System.out.println("Element not found in the array.");
    }

    public void binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == key) {
                System.out.println("Element found at index " + mid);
                return;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found in the array.");
    }
}
