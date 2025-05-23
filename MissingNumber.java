import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long expectedSum = (long) n * (n + 1) / 2;

        long actualSum = 0;
        for (int i = 0; i < n - 1; i++) {
            actualSum += sc.nextInt();
        }

        System.out.println(expectedSum - actualSum);
    }
}
// This program finds the missing number in a sequence from 1 to n.
// It calculates the expected sum of numbers from 1 to n and subtracts the actual sum of the provided numbers.
// The difference gives the missing number.
// The time complexity is O(n) for reading the input and calculating the sum.
// The space complexity is O(1) as we are using a constant amount of extra space.