
import java.util.Scanner;
class Question1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x==0 && y==0){
            System.out.println("Coordinate at Origin");
        }
        else if(x==0){
            System.out.println("Coordinate at y axis");
        }
        else if(y==0){
            System.out.println("Coordinate at x axis");

        }
        else{
            System.out.println("Neither at Any axis");
        }

        
    }
}