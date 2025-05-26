
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class TwoSets {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();

        long maxSum = (long)n * (n+1)/2; // Maximum sum of the first n natural numbers
        if((maxSum&1)!=0){
            System.out.println("NO");
            return;
        }
        long targetSum = maxSum / 2; // Target sum for each set
        List<Integer> set1 = new java.util.ArrayList<>();
        List<Integer> set2 = new java.util.ArrayList<>();
        for(int i=n; i>0; i--){
            if(targetSum >= i){
                set1.add(i);
                targetSum -= i;
            } else {
                set2.add(i);
            }
        }
        output.append("YES\n");
        output.append(set1.size()).append("\n");
        for(int num : set1) {
            output.append(num).append(" ");
        }
        output.append("\n");
        output.append(set2.size()).append("\n");
        for(int num : set2) {
            output.append(num).append(" ");
        }
        System.out.print(output);
    }

}
//Your task is to divide the numbers 1,2,\ldots,n into two sets of equal sum.
//Used the greedy approach to fill the first set with the largest numbers possible until the target sum is reached.
// If the total sum is odd, it's impossible to split into two equal sets, so we print "NO".
// The code reads an integer n, calculates the maximum sum of the first n natural numbers, and checks if it is even.
// If it is even, it divides the numbers into two sets such that both sets have the same sum.
// The first set is filled with the largest numbers possible until the target sum is reached, and the remaining numbers go into the second set.
// Finally, it prints "YES" followed by the sizes and elements of both sets.
