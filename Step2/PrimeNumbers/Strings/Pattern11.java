import java.util.Scanner;
public class Pattern11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char uppercase;
        char lowercase;
       
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                
              System.out.print(Character.toLowerCase(ch));
           


            }
            else if(Character.isLowerCase(ch)){
                System.out.print(Character.toUpperCase(ch));

               
              
            
            }
            else{
                 System.out.print(ch);
            }
        }
       
     
    }
}