import java.util.Scanner;
public class Pattern5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int vowels = 0;
        int consonents = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
                
            }
            else {
                consonents++;
                
            }

            
           

        }
        System.out.println("vowels =" + vowels);
         System.out.println("consonents=" + consonents);
    }
}