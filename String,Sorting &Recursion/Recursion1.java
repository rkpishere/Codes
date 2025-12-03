public class Recursion1 {
    public static void printNumbers(int n) {
        // Base case
        if (n == 0) {
            return;
        }
        // Recursive call
        System.out.println(n);
        printNumbers(n - 1);
        // Print the number after the recursive call
    }
    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }
}
