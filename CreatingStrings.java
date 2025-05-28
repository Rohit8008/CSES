import java.util.*;

public class CreatingStrings {
    static Set<String> result = new TreeSet<>();
    static boolean[] used;
    static char[] chars;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        chars = s.toCharArray();
        Arrays.sort(chars); 
        used = new boolean[chars.length];
        backtrack(new StringBuilder());
        
        System.out.println(result.size());
        for (String str : result) {
            System.out.println(str);
        }
    }

    static void backtrack(StringBuilder current) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;

            // Avoid duplicates in same position
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            current.append(chars[i]);
            backtrack(current);
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }
}
// This code generates all unique permutations of a given string and prints them in lexicographical order.
// It uses backtracking to explore all possible arrangements while avoiding duplicates by checking the used array and ensuring that no two identical characters are used in the same position.
// The result is stored in a TreeSet to maintain order and uniqueness.
// The main method reads the input string, initializes the character array and used array, and starts the backtracking process.
// The output includes the count of unique permutations followed by each permutation on a new line.
// The code is efficient for strings of moderate length and handles duplicates gracefully.
