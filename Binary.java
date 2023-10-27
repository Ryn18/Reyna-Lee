import java.util.*;

public class Lee {
    public static void main(String[] args) {
        Scanner rey = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the sorted array: ");
        int size = rey.nextInt();

        int[] sortedArray = new int[size];

        // Input elements for the sorted array
        System.out.println("Enter the elements of the sorted array:");
        while (true){
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            sortedArray[i] = rey.nextInt();
        }

        // Input the element to search for
        System.out.print("Enter the element to search for: ");
        int searchElement = rey.nextInt();

        // Perform binary search
        int left = 0;
        int right = size - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (sortedArray[mid] == searchElement) {
                System.out.println("Element found at index " + mid);
                found = true;
                break;
            } else if (sortedArray[mid] < searchElement) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found in the sorted array.");
        }
        }
        
    }
}
