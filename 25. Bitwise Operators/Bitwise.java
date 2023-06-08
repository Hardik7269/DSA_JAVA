import java.util.function.BinaryOperator;

class Bitwise{
    
    public static void main(String[] args) {
        int [] arr = {2,4,2,6,9,6,4};
        xorUnique(arr);
    }

    public static boolean OddEven (int n ){
        // int check = n&1;
        return (n&1) == 1;
    }

    public static int xorUnique(int[] arr){
        int unique = 0;

        for(int i : arr){
            System.out.println("i : " + i);
            unique = unique ^ i;
            System.out.println("unique : "+unique);
        }

        return unique;
    }
}