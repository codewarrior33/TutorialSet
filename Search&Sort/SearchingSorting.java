import java.util.Scanner;

public class SearchingSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Search and Sort Algorithm!");

        // Ask the user for the operation
        System.out.println("Please select the operation:");
        System.out.println("1. Searching");
        System.out.println("2. Sorting");

        int operation = getUserChoice(scanner, 1, 2);

        if (operation == 1) {
            // Searching
            Searching searching = new Searching();

            // Get array from user
            System.out.println("Please enter the size of the array:");
            int size = scanner.nextInt();

            int[] array = new int[size];
            System.out.println("Please enter the array elements:");

            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // Ask the user for the search algorithm
            System.out.println("Please select the search algorithm:");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");

            int searchAlgorithm = getUserChoice(scanner, 1, 2);

            // Prompt for the key
            System.out.println("Please enter the key you want to search for:");
            int key = scanner.nextInt();

            // Perform search operation and measure runtime
            long startTime = System.nanoTime();

            if (searchAlgorithm == 1) {
                searching.linearSearch(array, key);
            } else if (searchAlgorithm == 2) {
                searching.binarySearch(array, key);
            } else {
                System.out.println("Invalid search algorithm selection.");
            }

            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Runtime: " + duration + " nanoseconds");
        } else if (operation == 2) {
            // Sorting
            Sorting sorting = new Sorting();

            // Get array from user
            System.out.println("Please enter the size of the array:");
            int size = scanner.nextInt();

            int[] array = new int[size];
            System.out.println("Please enter the array elements:");

            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // Ask the user for the sorting algorithm
            System.out.println("Please select the sorting algorithm:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Insertion Sort");
            System.out.println("3. Radix Sort");
            System.out.println("4. Merge Sort");
            System.out.println("5. Quick Sort");
            System.out.println("6. Selection Sort");

            int sortAlgorithm = getUserChoice(scanner, 1, 6);

            // Perform sorting operation and measure runtime
            long startTime = System.nanoTime();

            if (sortAlgorithm == 1) {
                sorting.bubbleSort(array);
            } else if (sortAlgorithm == 2) {
                sorting.insertionSort(array);
            } else if (sortAlgorithm == 3) {
                sorting.radixSort(array);
            } else if (sortAlgorithm == 4) {
                sorting.mergeSort(array);
            } else if (sortAlgorithm == 5) {
                sorting.quickSort(array);
            } else if (sortAlgorithm == 6) {
                sorting.selectionSort(array);
            } else {
                System.out.println("Invalid sorting algorithm selection.");
            }

            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Runtime: " + duration + " nanoseconds");
        } else {
            System.out.println("Invalid operation selection.");
        }
    }

    private static int getUserChoice(Scanner scanner, int minValue, int maxValue) {
        int choice = -1;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter your choice: ");
            String input = scanner.next();

            try {
                choice = Integer.parseInt(input);

                if (choice >= minValue && choice <= maxValue) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input! Please enter a valid choice.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid choice.");
            }
        }

        return choice;
    }
}
