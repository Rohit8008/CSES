
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeReorder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String result = findPalindrome(input);
        System.out.println(result);
    }
    private static String findPalindrome(String input) {
        int[] charCount = new int[26];
        for (char c : input.toCharArray()) {
            charCount[c - 'A']++;
        }

        StringBuilder leftHalf = new StringBuilder();
        String middle = "";

        for (int i = 0; i < 26; i++) {
            if (charCount[i] % 2 != 0) {
                if (!middle.isEmpty()) {
                    return "NO SOLUTION"; // More than one character with an odd count
                }
                middle = String.valueOf((char) (i + 'A'));
            }
            leftHalf.append(String.valueOf((char) (i + 'A')).repeat(charCount[i] / 2));
        }

        String rightHalf = leftHalf.reverse().toString();
        return leftHalf.reverse().toString() + middle + rightHalf;
    }
}
//Given a string, your task is to reorder its letters in such a way that it becomes a palindrome (i.e., it reads the same forwards and backwards).