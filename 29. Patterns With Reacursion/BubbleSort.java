import java.util.Arrays;

class BubbleSort{
  public static void main(String[] args) {
    int[] arr = {4,98,2,100};
	// Bs(arr, arr.length-1, 0);
	SelectionSort(arr, arr.length,0, Integer.MIN_VALUE);
	System.out.println(Arrays.toString(arr));
  }
  public static void Bs(int [] arr, int len, int col){
		 
		if(len==0){
			return;
		}
		if(len == col){
			Bs(arr, len - 1, col = 0);
			return;
		}
		if(len > col){
			
			Bs(arr, len, col+1);
			if(arr[col] > arr[col+1]){
				swap(arr, col, col+1);
			}
		}
	}

  public static void swap(int [] arr , int a, int b){
	  int  temp = arr[a];
	   arr[a] =  arr[b];
	    arr[b] = temp;
  }
	
	static int max_idx = 0;
		public static void SelectionSort(int [] arr, int len, int col, int max){
		 
		if(len==0){
			return;
		}
		if(len == col){
			swap(arr, max_idx, len-1);
			SelectionSort(arr, len - 1, col = 0, max = Integer.MIN_VALUE);
			return;
		}
		if(len > col){
			if(max < arr[col]){
				max_idx = col;
				max = arr[col];
			}
			SelectionSort(arr, len, col+1 , max);
		}
	}
}