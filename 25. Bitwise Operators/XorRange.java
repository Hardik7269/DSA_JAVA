class XorRange{
    public static void main(String[] args) {
        int ans = 1 ^ 2;
        int n =3;
        
        for(int i = 3 ; i <= n ; i++){
            ans = ans ^ i;
        }
        System.out.println(ans);
    }
}