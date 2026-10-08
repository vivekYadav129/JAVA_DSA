import java.util.Scanner;
public class Pattern6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char target = sc.next().charAt(0);
        int count = 0;
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
          
            if(ch == target){
                count++;
               

            }
        }
          System.out.println(count); 
       
    }
}