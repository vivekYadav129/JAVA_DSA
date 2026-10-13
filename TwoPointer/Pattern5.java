import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        if (s.length() != t.length()) {
            System.out.println("false");
            return;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;  // Count s
            freq[t.charAt(i) - 'a']--;  // Your question: what does this do?
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
        sc.close();
    }
}