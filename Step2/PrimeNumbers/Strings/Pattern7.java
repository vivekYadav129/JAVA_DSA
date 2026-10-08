import java.util.Scanner;
public class Pattern7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int index = -1;
        char target = sc.next().charAt(0);
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == target){
               index = i;
                break;
            }
          

        }
        System.out.print(index);
    }
}