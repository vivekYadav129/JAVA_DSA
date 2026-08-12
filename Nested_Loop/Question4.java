import java.util.*; 
 class Question4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <= 'm'){
            System.out.println("Between a and m");
        }
        else if(ch >= 'n' && ch <= 'z'){
            System.out.println("Between n and z");
        }
        else {
            System.out.println("Not a lowercase alphabet");
        }


    }
}