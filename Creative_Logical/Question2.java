import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = Math.max(a, Math.max(b, c));

        if (largest == a) {
            if (b * b + c * c == a * a)
                System.out.println("Pythagorean Triplet");
            else
                System.out.println("Not a Pythagorean Triplet");
        } 
        else if (largest == b) {
            if (a * a + c * c == b * b)
                System.out.println("Pythagorean Triplet");
            else
                System.out.println("Not a Pythagorean Triplet");
        } 
        else {
            if (a * a + b * b == c * c)
                System.out.println("Pythagorean Triplet");
            else
                System.out.println("Not a Pythagorean Triplet");
        }
    }
}