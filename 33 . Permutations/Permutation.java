import java.util.ArrayList;

class Permutation{
    public static void main(String[] args) {
        // permutations("", "abc");
        // System.out.println(subset("","abc"));
    //     ArrayList<String> list = new ArrayList<>();
    //     subseqAL("","abc", list);
    //     System.out.println(list);
    // }

    public static void permutations(String p , String up){
        if(up.isEmpty()){
            System.out.println("******************" );
            System.out.println("Processed String "+p);
            System.out.println("******************" );
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i , p.length());
            System.out.println("f = " +f);
            System.out.println("s = " +s);
            System.out.println("where " +i+ " p = " + (f+ch+s));
            permutations((f + ch + s), up.substring(1));
        }
        
    }

    public static ArrayList<String> subset(String p , String up){

        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            
            list.add(p);
            return list;
        }



        char ch = up.charAt(0);

        ArrayList<String> outerlistleft = subset(p, up.substring(1));
        ArrayList<String> outerlistright = subset(p+ch, up.substring(1));

        list.addAll(outerlistleft);
        list.addAll(outerlistright);
        return list ;
    }

    public static void subseqAL(String p, String up, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAL(p + ch, up.substring(1), list);
        subseqAL(p , up.substring(1), list);
    }

}