import java.util.Arrays;

class MergeSort{
  public static void main(String[] args) {
   int[] arr = {8,62,8,96,3,2,7,0}; 
   ms(arr , 0 , arr.length);
   System.out.println(Arrays.toString(arr));
  }

  public static void ms(int [] arr , int start, int end){
  
    if(end - start == 1){
      return;
    } 

    // if(start <= end){ *** this is wrong it should only stop when there is only one element is lefet in saperate
      int mid = (start+end)/2;

      ms(arr, start, mid);
      ms(arr, mid, end);

      merge(arr, start , mid , end );
    // }
  }

  public static void merge(int[]arr , int start , int mid , int end){

  int[] result = new int[end - start];

   int i = start;
   int j = mid;
   int k =  0;
   
   while(i < mid && j < end){
    if(arr[i] <= arr[j]){
      result[k] = arr[i];
      i++;
    }else{
      result[k] = arr[j];
      j++;
    }
    k++;
   }

   while(i < mid){
    result[k] = arr[i];
      i++;
      k++;
   }
   
   while(j < end){
    result[k] = arr[j];
      j++;
      k++;
   }


    for (int l = 0; l < result.length; l++) {
      arr[start+l] = result[l];
  }
    
  }

}