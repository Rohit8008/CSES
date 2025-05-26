
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoinPiles {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();        
        for (int i = 0; i < t; i++) {
            String[] parts = br.readLine().split(" ");
            long a = Long.parseLong(parts[0]);
            long b = Long.parseLong(parts[1]);
            
            // Check if the piles can be made equal
            if ((a + b) % 3 == 0 && Math.min(a, b) * 2 >= Math.max(a, b)) {
                output.append("YES\n");
            } else {
                output.append("NO\n");
            }
        }
        System.out.print(output.toString());
    }
}
// This code checks if two piles of coins can be made equal by removing coins.
    // It reads the number of test cases and for each case, it checks two conditions:
    // 1. The total number of coins in both piles must be divisible by 3.
    // 2. The smaller pile must be at least half the size of the larger pile.
    // If both conditions are satisfied, it prints "YES", otherwise it prints "NO".
    // The approach is efficient and works in O(1) time for each test case, making it suitable for large inputs.
