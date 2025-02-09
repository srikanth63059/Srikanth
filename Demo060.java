
public class Demo060 {
    public static void main(String[] args) {
        int n = 20;
        long[] fib = new long[n];
        
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        System.out.println("Fibonacci series of 20 numbers:");
        for (long num : fib) {
            System.out.print(num + " ");
        }
    }
}
