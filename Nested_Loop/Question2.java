import java.util.*;
class Question2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b > c && b+c > a && c+a > b){
            System.out.println("Traingle");
        }
        if(a == b && b == c){
            System.out.println("Equilateral");
        }
        else if(a == b || b == c || a == c){
            System.out.println("Isosceles");
        }
        else if(a != b && b != c && a != c){
            System.out.println("Scalene");
        }
    }
}