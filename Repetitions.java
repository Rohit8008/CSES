
import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int maxCount = 0;
        int currentCount = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                currentCount++;
            }else{
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 1;
            }
        }
        maxCount = Math.max(maxCount, currentCount);
        System.out.println(maxCount);
        sc.close();
    }
}
// This program finds the maximum number of consecutive identical characters in a string.
// It iterates through the string, counting consecutive characters and updating the maximum count.
// The time complexity is O(n) where n is the length of the string.
// The space complexity is O(1) as we are using a constant amount of extra space.