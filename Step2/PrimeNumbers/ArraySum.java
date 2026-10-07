import java.util.Scanner;
public class ArraySum{
    public static void main(String[] args){
        
        int[] arr = {2,4,6,8};
        int sum = 0;
        for(int i=0; i<=arr.length - 1; i++){
            sum = sum + arr[i];
            arr[i] = sum;
        }
        System.out.print(sum);
    }
}