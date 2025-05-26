
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrailingZeros {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        
        // Count the number of factors of 5 in n!
        for (int i = 5; i <= n; i *= 5) {
            count += n / i;
        }
        
        System.out.println(count);
    }
}
// This code calculates the number of trailing zeros in the factorial of a given number n.
// It does this by counting the number of times 5 is a factor in the numbers from 1 to n, since each pair of factors 2 and 5 contributes to a trailing zero.
// The loop iterates through multiples of 5, adding the integer division of n by each multiple to the count.
// The result is printed as the output, which represents the number of trailing zeros in n!.
// The approach is efficient and works in O(log n) time complexity, making it suitable for large values of n.