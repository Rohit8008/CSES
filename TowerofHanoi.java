import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TowerofHanoi {
    static List<String> moves = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n, 1, 3, 2); // from=1, to=3, aux=2
        System.out.println(moves.size());
        StringBuilder output = new StringBuilder();
        for (String move : moves) {
            output.append(move).append("\n");
        }
        System.out.print(output.toString());
        sc.close();
    }

    public static void solve(int n, int from, int to, int aux) {
        if (n == 1) {
            moves.add(from + " " + to);
            return;
        }
        solve(n - 1, from, aux, to);
        moves.add(from + " " + to);
        solve(n - 1, aux, to, from);
    }
}
// This code implements the Tower of Hanoi problem using recursion.
// It reads the number of disks from input, solves the problem, and prints the number of moves
// along with the moves themselves in the required format.
// The moves are stored in a list and printed at the end to avoid multiple I/O operations.