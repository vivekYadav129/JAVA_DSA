import java.util.Scanner;
public class Pattern9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int Uppercase = 0;
        int Lowercase = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isUpperCase(ch)){
                Uppercase++;
            }
            if(Character.isLowerCase(ch)){
                Lowercase++;
            }
        }
        System.out.println("Uppercase =" + Uppercase);
        System.out.println("Lowercase =" + Lowercase);

    }
}