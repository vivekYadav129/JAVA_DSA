import java.util.Scanner;
public class Pattern8{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n<2){
        System.out.print("Prime");
        return;
    }



    for(int i=2; i*i<=n; i++){
       if(n%i==0){
        System.out.print(" Not Prime");
        return;
       }
       
       
        
       
    }

     System.out.print("Prime");
    
}
}