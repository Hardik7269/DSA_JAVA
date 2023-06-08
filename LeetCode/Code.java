class Code{
    public static void main(String[] args) {
        int [][] arr = {{7,2,1},{6,4,2},{6,5,3,},{3,2,1}};
        System.out.println(matrixSum(arr));
    }
    public static int matrixSum(int[][] arr) {
        int sum = 0;
        for(int i = 0 ; i < arr[0].length ; i++){
            int max = 0;
            
            for(int j = 0 ; j < arr.length ; j++){
                max = Math.max(max, arr[j][i]);
            }
            System.out.println(max);
            sum += max;
        }
        return sum;
    }
  
}