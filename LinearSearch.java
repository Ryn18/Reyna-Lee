import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();
        
        int index = -1;
        int i = 0;
        boolean found = false;
        
        while (i < size) {
            if (array[i] == target) {
                index = i;
                found = true;
                break;
            }
            i++;
        }
        
        if (found) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }
        
        scanner.close();
    }
}
