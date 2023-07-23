class BasicPatterns{
  public static void main(String[] args) {
    basicTirangle(4 , 4);
    System.out.println();
    basicFlipTriangle(4 ,4);
  }

  public static void basicTirangle(int row , int col){
    if(row == 0){
      return;
    }
    if (col != 0){
      basicTirangle(row, col -= 1);
      System.out.print("* ");
    }else{
      basicTirangle(row -= 1, col = row);
      System.out.println();
    }
  }

  public static void basicFlipTriangle(int row , int col){
    if(row == 0 ){
      return;
    }
    if(col != 0){
      System.out.print("* ");
      basicFlipTriangle(row, col -= 1 );
    }else{
      System.out.println();
      basicFlipTriangle(row -= 1, col = row);
    }
  }
}