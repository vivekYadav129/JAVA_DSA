import java.util.*;
class Pattern7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("b");
            }
            for(int j=0; j<=i; j++){
                if(j%2 == 0){
                    System.out.print("*");
                }
                else {
                    System.out.print("b");
                }
            }
            System.out.println();
        }
    }
}