import java.util.ArrayList;

class Subseq{
  public static void main(String[] args) {
    // System.out.println(subseq("", "abc"));
    System.out.println((subseqAL("", "abc")));
  }

  public static ArrayList<String> subseq(String p , String up){
    // ArrayList<ArrayList<String>> listoflist = new ArrayList<ArrayList<String>>();
    ArrayList<String> list = new ArrayList<>();

    if(up.equals("")){
      System.out.println(p);
      list.add(p);
      return list;
    }

    char ch = up.charAt(0);

    list.add(subseq( p + ch , up.substring(1)));
    list.add(subseq( p  , up.substring(1)));
    return list;
  }

  public static ArrayList<String> subseqAL(String p , String up){
    ArrayList<String> list = new ArrayList<>();

    if(up.isEmpty()){
      list.add(p);
      return list;
    }
    
    char ch = up.charAt(0);
    // for left and right side call
    //not storing in in this . we are assigining it to arraylist
    ArrayList<String> listLeft = subseqAL(p+ch, up.substring(1));
    ArrayList<String> listRight = subseqAL(p, up.substring(1));

    listLeft.addAll(listRight);
    return listLeft;

  }
}