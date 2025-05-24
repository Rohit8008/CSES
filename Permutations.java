
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n == 1) {
            System.out.println("1");
        } else if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = 2; i <= n; i += 2) {
                result.append(i).append(" ");
            }
            for (int i = 1; i <= n; i += 2) {
                result.append(i).append(" ");
            }
            System.out.println(result.toString().trim());
        }
    }

    //A permutation of integers 1,2,\ldots,n is called beautiful if there are no adjacent elements whose difference is 1. Given n, construct a beautiful permutation if such a permutation exists. Print a beautiful permutation of integers 1,2,\ldots,n. If there are several solutions, you may print any of them. If there are no solutions, print "NO SOLUTION".
    // The code constructs a beautiful permutation of integers from 1 to n, ensuring that no two adjacent elements have a difference of 1.
    // The logic is to first append all even numbers followed by all odd numbers, which guarantees that adjacent elements will not differ by 1.
    // The special cases for n = 1, 2, and 3 are handled separately, where n = 1 has a valid permutation, while n = 2 and n = 3 do not have a solution.
}
