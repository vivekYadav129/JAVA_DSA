import java.util.Scanner;
public class Pattern7{
    static int maximum(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
            max = arr[i];

            }
            
            
        }
        return max;
        
       
    }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n<=0){
        System.out.println("Invalid array size");
        sc.close();
        return;
    }
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    int result = maximum(arr, n);
    System.out.println(result);
    sc.close(); 
   }
 
}