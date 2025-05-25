import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSpiral {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            String[] parts = br.readLine().split(" ");
            long y = Long.parseLong(parts[0]); // row
            long x = Long.parseLong(parts[1]); // column

            long n = Math.max(y, x);
            long n2 = n * n;
            long result;

            if (n % 2 == 0) {
                if (y == n) {
                    result = n2 - x + 1;
                } else {
                    result = (n - 1) * (n - 1) + y;
                }
            } else {
                if (x == n) {
                    result = n2 - y + 1;
                } else {
                    result = (n - 1) * (n - 1) + x;
                }
            }

            output.append(result).append("\n");
        }

        System.out.print(output);
    }
}
