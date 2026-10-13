import java.util.Scanner;
public class Pattern6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
          System.out.println(words[i]);
}

    }
}