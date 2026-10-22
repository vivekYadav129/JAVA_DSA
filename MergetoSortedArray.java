import java.util.Scanner;
import java.util.Arrays;
public class MergetoSortedArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
     
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

           int m = sc.nextInt();
        int[] brr = new int[m];
        for(int j=0; j<m; j++){
            brr[j] = sc.nextInt();
        }

        int[] result = new int[n + m];
        int i=0;
        int j=0;
        int k=0;

        while(i < n && j<m){
            if(arr[i] <= brr[j]) {
                result[k] = arr[i];
                i++;
            } else {
                result [k] = brr[j];
                j++;
            }
            k++;
        }
        while(j<m){
            result[k] = brr[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(result));
        sc.close();

    }
}