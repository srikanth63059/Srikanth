import java.util.Scanner;

public class Demo063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        if (n > 0) {
            int sum = arr[0] + arr[n - 1];
            System.out.println("Sum of first and last element: " + sum);
        } else {
            System.out.println("Array is empty.");
        }
        
        scanner.close();
    }
}
