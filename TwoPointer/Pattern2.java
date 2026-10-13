
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Skip consonants from the left
            if (arr[left] != 'a' && arr[left] != 'e'
                    && arr[left] != 'i' && arr[left] != 'o'
                    && arr[left] != 'u') {
                left++;
            }
            // Skip consonants from the right
            else if (arr[right] != 'a' && arr[right] != 'e'
                    && arr[right] != 'i' && arr[right] != 'o'
                    && arr[right] != 'u') {
                right--;
            }
            // Both characters are vowels: swap them
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(new String(arr));
        sc.close();
    }
}

