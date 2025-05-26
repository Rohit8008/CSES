import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GrayCode {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        generateGrayCode(n);
    }

    public static void generateGrayCode(int n) {
        int numCodes = 1 << n; // 2^n codes
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numCodes; i++) {
            int grayCode = i ^ (i >> 1);
            String binary = String.format("%" + n + "s", Integer.toBinaryString(grayCode)).replace(' ', '0');
            sb.append(binary).append("\n");
        }

        System.out.print(sb.toString());
    }

}
// This Java program generates the Gray code for a given number of bits n.
// It reads an integer n from the input, computes the Gray codes, and prints them in binary format.
// The Gray code is generated using the formula: G(i) = i ^ (i >> 1), where G(i) is the i-th Gray code.
// The output is formatted to ensure each code is represented with n bits, padded with leading zeros.
// The program uses a StringBuilder for efficient string concatenation and prints the result at once.
// The time complexity is O(2^n) for generating the codes, and the space complexity is also O(2^n) for storing the output.