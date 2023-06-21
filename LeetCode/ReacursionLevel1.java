class ReacursionLevel1{
    public static void main(String[] args) {
        int ct = 0;
        System.out.println(count(8, ct));
    }
    public static int count(int n, int ct){
        if(n == 0){
            return ct - 1;
        }
        if(n%2 != 0){
            ct += 2;
            n = n-1 ;
            return count(n/2 , ct);
        }else{
            ct++;
            return count(n/2 ,ct );
        }
        
    }
}