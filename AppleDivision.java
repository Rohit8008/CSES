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
// This code reads the number of apples and their weights, then calculates the minimum difference
// between two subsets of apples using bitmasking to explore all possible combinations.
// It efficiently computes the total weight and iterates through all subsets to find the optimal division.
// The result is printed as the minimum difference found between the two subsets.
// The code is designed to handle the problem of dividing apples into two groups such that the difference in their total weights is minimized.
// The approach uses bitmasking to represent subsets, ensuring all combinations are considered.
// The time complexity is O(2^n * n), which is feasible for n up to 20, as it explores all subsets of apples.
// The solution is efficient for the problem constraints and provides the correct output for the minimum difference in weights.
// The code is structured to read input, process the data, and output the result in a clear and concise manner.
// The code is designed to handle the problem of dividing apples into two groups such that the difference in their total weights is minimized.