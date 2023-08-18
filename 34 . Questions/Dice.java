import java.util.ArrayList;

class Dice{
    public static void main(String[] args) {
        // ways("",5);
        System.out.println(numpad("","25"));
    }
    static void ways(String p , int up ){
        if(up == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6  && i <= up; i++) {

            ways(p + i ,up-i);

        }
    }

    static ArrayList<String> numpad(String p, String up ){
        
        if(up.isEmpty()){
            ArrayList<String> list  = new ArrayList<>();
            list.add(p);
            return list;
        }

        int dig = up.charAt(0) - '0';

        ArrayList<String> innerlist = new ArrayList<>();
        for (int i = 3*(dig - 2); i <3*(dig-1); i++) {
            char ch = (char)('a' + i);
            innerlist.addAll(numpad( p + ch , up.substring(1)));
        }
        return innerlist;
    }
}