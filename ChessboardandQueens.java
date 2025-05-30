
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
// This code reads an 8x8 chessboard configuration and counts the number of ways to place 8 queens on the board
// such that no two queens threaten each other. It uses backtracking to explore all possible placements,
// while maintaining arrays to track attacked columns and diagonals. The solution is efficient and handles the constraints of the problem.
// The code is structured to read input, process the board, and output the total number of valid queen placements.
// The approach ensures that all placements are checked, and the use of boolean arrays allows for quick checks of threats,
// making the solution feasible within the problem's constraints. The final count of valid placements is printed as the output.
// The code is designed to handle the problem of placing queens on a chessboard such that no two queens threaten each other.
// The solution uses backtracking to explore all possible placements of queens on the board,
// ensuring that the constraints of the problem are met. The use of boolean arrays for columns and diagonals
// allows for efficient checking of threats, making the solution both effective and efficient.
// The time complexity is O(8!), which is manageable given the constraints of the problem.
// The code is structured to read the chessboard configuration, process the placements of queens,
// and output the total number of valid configurations. The approach is clear and concise, ensuring that all edge cases are handled.