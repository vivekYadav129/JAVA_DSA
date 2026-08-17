class Question3{
    static void divisibleby7(int a, int b){

        for(int i=a; i<=b; i++){
            if(i%7 == 0){
                System.out.println(i);
               
            }
          
        }
    }
    public static void main(String[] args){
        divisibleby7(20, 30);

    }
}