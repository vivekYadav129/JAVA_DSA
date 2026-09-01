public class Pattern11{
    public static void main(String[] args){
        int rows = 7;
        int num = 1;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print((num % 10) + " ");
                num++;
            }
            System.out.println();
        }
    }
}