
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChessboardandQueens {
    static char[][] board = new char[8][8];
    static boolean[] col = new boolean[8];
    static boolean[] diag1 = new boolean[15]; // row + col
    static boolean[] diag2 = new boolean[15]; // row - col + 7
    static int ways = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the board
        for (int i = 0; i < 8; i++) {
            board[i] = br.readLine().toCharArray();
        }

        solve(0);
        System.out.println(ways);
    }

    static void solve(int row) {
        if (row == 8) {
            ways++;
            return;
        }

        for (int c = 0; c < 8; c++) {
            if (board[row][c] == '*') continue; // reserved
            if (col[c] || diag1[row + c] || diag2[row - c + 7]) continue; // attacked

            // Place queen
            col[c] = diag1[row + c] = diag2[row - c + 7] = true;
            solve(row + 1);
            // Backtrack
            col[c] = diag1[row + c] = diag2[row - c + 7] = false;
        }
    }
}