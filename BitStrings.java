
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();

        long mod = 1000000007;
        long result = 1;

        for (int i = 0; i < n; i++) {
            result = (result * 2) % mod; // Calculate 2^n % 1000000007
        }
        output.append(result).append("\n");
        System.out.print(output);
    }
}
// The code reads an integer n from input and calculates the number of distinct bit strings of length n.
// It uses the formula 2^n % 1000000007, where 1000000007 is a large prime number to prevent overflow.
// The result is computed using modular exponentiation to efficiently handle large values of n.
// The result is printed as the output, which represents the number of distinct bit strings of length n.