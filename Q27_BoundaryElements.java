class Q27_BoundaryElements {
 public static void main(String[] args) {
  int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12}};int rows=a.length,cols=a[0].length;
  for(int i=0;i<rows;i++){for(int j=0;j<cols;j++)if(i==0||i==rows-1||j==0||j==cols-1)System.out.print(a[i][j]+" ");else System.out.print("  ");System.out.println();}
 }
}
