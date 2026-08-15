import java.util.*;

class Question8 {

    static int productOfDigits(int n) {
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            product = product * digit;
            n = n / 10;
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = productOfDigits(n);

        System.out.println(result);
    }
}