
import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean seenBefore = false;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) {
                    seenBefore = true;
                    break;
                }
            }

            if (!seenBefore) {
                int count = 0;

                for (int k = 0; k < s.length(); k++) {
                    if (s.charAt(k) == ch) {
                        count++;
                    }
                }

                System.out.println(ch + " = " + count);
            }
        }

        sc.close();
    }
}

