import java.util.*;
public class BasicString{
  public static void main(String[] args) {
    String str = "Hardik";
    // System.out.println(removeA(str));
    aRemove("", str);
  }

  public static void aRemove(String p , String up){
    if(up.isEmpty()){
      System.out.println("Approach : This is using filling empty with answer, and emptying the original approach ");
      System.out.println(p);
      return;
    }
    char ch = up.charAt(0);

    if(ch == 'a'){
      aRemove(p, up.substring(1));
    } else {
      aRemove(p + ch, up.substring(1));
    }
  }

  public static String removeA(String str){
    if(str.isEmpty()){
      return "";
    }
    char ch = str.charAt(0);

    if(ch == 'a'){
      return removeA(str.substring(1));
    }
    else{
      return ch + removeA(str.substring(1));
    }
  }
  
}