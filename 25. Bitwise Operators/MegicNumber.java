class MegicNumber{
    public static void main(String[] args) {
        int pow = 1;
        int sum = 0;
        int num = 4;
        for(int i = 0 ; i < 7 ; i++){
            int mask =num & (1<<i);
            if(mask != 0){
                sum += Math.pow(5, pow);
            }
            pow++;
        }

        System.out.println(sum);
        kunalMethod(num);
    }

    public static void kunalMethod(int n){
        int base =  5;
        int ans = 0;
        while(n > 0){
            int mask = n & 1;
            if(mask != 0) {
                
                ans += base;
            }
            base *=5;
            n = n>>1;
            
        }
        System.out.println(ans);
    }
}