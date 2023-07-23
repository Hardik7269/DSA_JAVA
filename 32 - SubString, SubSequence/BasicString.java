import java.util.*;
public class BasicString{
  public static void main(String[] args) {
    String str = "bbaababea";
    removeA(str , "" , 0);

  }
  public static void removeA(String str , StringBuffer ans , int count){
    if(count == str.length()){
      System.out.println(ans);
      return;
    }
    if(str.charAt(count) == 'a'){
      removeA(str, ans, count+1);
    }else{
      ans.append(str.charAt(count));
      removeA(str, ans, count+1);
    }

  }
}