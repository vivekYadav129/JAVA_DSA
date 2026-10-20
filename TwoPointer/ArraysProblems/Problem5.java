import java.util.Scanner;
public class Problem5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        
        int largest = 0;
        int seclarg = Integer.MIN_VALUE;
      
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
              int current = arr[i];
            if(current > largest){
                seclarg = largest;
                largest = current;
            }
            else if(current<largest && current> seclarg){
                seclarg = current;
            }
        }
        if (seclarg == Integer.MIN_VALUE) {
    System.out.println("No second-largest distinct element");
} else {
    System.out.println(seclarg);
}

    }
}