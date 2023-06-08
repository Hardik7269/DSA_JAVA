class Strings{
    public static void main(String[] args) {
        // String s = "cbbd";
        // int count = 1;
        // for(int i = 0 ; i < s.length() ; i++){
        //     if(i < s.length()-1 && (s.charAt(i) != s.charAt(i+1))){
        //         count++;
        //         System.out.println(i+" : count  : " + count);
        //     }
 
            
        // }
        // System.out.println("2nd if");
        // // if(s.length() >= 2 && (s.charAt(s.length()-1) == s.charAt(s.length()-2))){
        // //     count++;

        // //     System.out.println(count);
        // // }
        // System.out.println("answer "+count);
        System.out.println(f(5));

    }
    static int r = 0;
    public static int f(int n){
        if(n<=0){
            return 1;
        }
        if(n>3){
            r = n;
            return f(n-2)+2;
        }
        return f(n-1)+r;
        
    }
}