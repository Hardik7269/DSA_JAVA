import java.util.ArrayList;

class Phonenumber{
    public static void main(String[] args) {
        System.out.println(phnno("", "29"));
    }

    static ArrayList<String> phnno(String p , String up){
        ArrayList<String> list = new  ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        int dig = (up.charAt(0) - '0');

        if(dig < 7){
            for (int i = 3*(dig-2); i < 3*(dig-1); i++) {
                char ch = (char)('a' + i); 
                ArrayList<String> innerlist = phnno( p + ch, up.substring(1));
                list.addAll(innerlist);
            }
        }
        if(dig == 7){
            for (int i = 15 ; i < 19 ; i++) {
                char ch = (char)('a' + i); 
                ArrayList<String> innerlist = phnno( p + ch, up.substring(1));
                list.addAll(innerlist);
            }
        }
        else if(dig == 8){
            for (int i = 19 ; i < 22 ; i++) {
                char ch = (char)('a' + i); 
                ArrayList<String> innerlist = phnno( p + ch, up.substring(1));
                list.addAll(innerlist);
            }
        }
        else if(dig == 9){
            for (int i = 22 ; i < 26 ; i++) {
                char ch = (char)('a' + i); 
                ArrayList<String> innerlist = phnno( p + ch, up.substring(1));
                list.addAll(innerlist);
            }
        }
        
        return list;
    }
}