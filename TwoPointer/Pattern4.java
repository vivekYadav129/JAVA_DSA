import java.util.Scanner;
public class Pattern4{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String t = sc.nextLine();
    int i = 0;
    int j = 0;

    StringBuilder result = new StringBuilder();
    while (i < s.length() || j < t.length()) {
    if (i < s.length()) {
        result.append(s.charAt(i));
        i++;
    }

    if (j < t.length()) {
        result.append(t.charAt(j));
        j++;
    }
}
System.out.println(result.toString());

}
}