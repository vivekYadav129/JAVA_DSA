import java.util.Scanner;
public class Pattern4{
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }

        for(int i=2; i*i<=n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = 0;
        for(int i=2; i<n; i++){
            if(isPrime(i)){
                largest = i;

            }
        }
        System.out.print(largest);
    }
}