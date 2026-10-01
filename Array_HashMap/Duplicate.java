import java.util.*;
class Duplicate{
    public boolean same(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr){
            if(set.contains(x)){
                return true;
            }
            set.add(x);
        }
        return false;
    }
    public static void main(String[] args){
        Duplicate obj = new Duplicate();
        int[] arr = {1,3,4,5,4};
        System.out.println(obj.same(arr));
    }
}

   

    

    
