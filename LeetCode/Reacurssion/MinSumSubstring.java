import javax.swing.text.html.parser.Element;

class MinSumSubstring{
  static int sum;
  public static void main(String[] args) {
    int [] arr = {2,3,1,2,4,3};
    System.out.println(f(arr, 0, 7, 0, 0));
  }
  
  public static int f(int arr[], int ele, int target , int start, int sum){
    if(ele == arr.length){
      for(int i = start ; i <= ele ; i++){
      sum += arr[i];
      }
      if(sum == target){
        return ele;
      }return 0;
    }
    if(start == arr.length - 1){
      if(arr[start] == target){
        return ele;
      }else{
        return f(arr, ele + 1, target, start =0, sum = 0);
      }
    }
    for(int i = start ; i <= ele ; i++){
      sum += arr[i];
    }
    if(sum == target){
      return ele;
    }else{
      return f(arr, ele, target, start+1 , sum = 0);
    }
  }
}