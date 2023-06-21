class Factorial{
    public static void main(String[] args) {
        System.out.println(find(127));
        // concept(5);
        System.out.println(countNo(12354));
    } 
    public static int countNo(int n){
        if(n==0){
            return 0;
        }else{

        }
        
        countNo(n/10);
        return 0;
    }
    public static int f(int n){
        
        if(n == 1){
            return 1;
        }
        return  n * f(n-1);
         
    }
    //for sum of all degits in number //freverse a number
    static int sum = 0;
    public static int find(int n){
        if(n==0){
            return 0;
        }

        sum = (sum * 10)+ (n%10);
        find(n/10);
        return sum ;
    }

    //concept

    public static void concept(int n){
        if(n==1){
            return;
        }
        System.out.println(n);
        concept(--n);
        System.out.println(n);
    }

    
}