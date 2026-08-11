class Question1{
    public static void main(String[] args){
        int a = 20;
        int b = 30;
        int c = 40;

        if(a+b > c && b+c > a && c+a > b){
            System.out.println("Valid Traingle");
        }
        else {
            System.out.println("Not Valid Traingle");
        }
    }
}