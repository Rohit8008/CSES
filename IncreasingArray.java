import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        long maxMoves=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1]){
                maxMoves+=arr[i-1]-arr[i];
                arr[i]=arr[i-1];
            }
        }
        System.out.println(maxMoves);
        sc.close();
    }
    
}
// This code reads an integer n and an array of n integers, then calculates the minimum number of moves required to make the array non-decreasing.
// A move consists of increasing an element to match the previous element if it is smaller.
// The result is printed as the total number of moves needed to achieve this condition.
