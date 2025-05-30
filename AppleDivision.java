import java.io.BufferedReader;
import java.io.IOException;

public class AppleDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] apples = new int[n];
        String[] input = br.readLine().split(" ");
        long total = 0;

        for (int i = 0; i < n; i++) {
            apples[i] = Integer.parseInt(input[i]);
            total += apples[i];
        }

        long minDiff = Long.MAX_VALUE;

        // Try all subsets using bitmasking
        for (int mask = 0; mask < (1 << n); mask++) {
            long subsetSum = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subsetSum += apples[i];
                }
            }
            long otherSubset = total - subsetSum;
            minDiff = Math.min(minDiff, Math.abs(subsetSum - otherSubset));
        }

        System.out.println(minDiff);
    }
}
