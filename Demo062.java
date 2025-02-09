import java.util.Scanner;

public class Demo062 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        if (n >= 2) {
            System.out.println("First element: " + arr[0]);
            System.out.println("Second element: " + arr[1]);
            System.out.println("Last element: " + arr[n - 1]);
        } else if (n == 1) {
            System.out.println("First and last element: " + arr[0]);
        } else {
            System.out.println("Array is empty.");
        }
        
        scanner.close();
    }
}
