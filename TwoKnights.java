
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoKnights {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();
        for(int i=1;i<=n;i++){
            long totalWays = (long) i*i *(i*i -1)/2; //  i^2 * (i^2 - 1) / 2
            long attackWays = (long)4 * (i-1) * (i-2); // 4 * (n-1) * (n-2)
            long safeWays = (long)totalWays - attackWays; // Total ways - Attack ways
            output.append(safeWays).append("\n");
        }
        System.out.print(output);
    }
}
// The code calculates the number of ways to place two knights on an n x n chessboard such that they do not attack each other.
// It uses the formula for total placements of two knights and subtracts the number of attacking placements.
// The total placements of two knights is given by the formula n^2 * (n^2 - 1) / 2, where n is the size of the chessboard.
// The attacking placements are calculated as 4 * (n-1) * (n-2), which accounts for the positions where knights can attack each other.
// The result is printed for each board size from 1 to n.