class Prime{
    public static void main(String []args){
        int n =40 ;
        for(int i = 2 ; i <= n ; i++){
            if(isPrime(i)){
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean isPrime(int n){
        boolean isPrime = true;

        int c = 2;//(start)
        while(c*c <= n){
            if(n%c == 0){
                isPrime = false;
            }
            c++;
        }
        return isPrime;
    }
}