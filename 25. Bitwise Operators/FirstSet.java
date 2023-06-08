    class FirstSet{
    public static void main(String[] args) {
        int a = 728;
        int i = 1 ;
        
        while(true){
            int mask = 1 << i;
            // System.out.println(i +" : "+(a & mask) );
            // System.out.println(i +" mask : "+mask);

            if((a & mask) != 0){
                System.out.println(mask);
                break;
            }
            i *= 2;
        }
    }
}