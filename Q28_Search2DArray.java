class Q28_Search2DArray {
 public static void main(String[] args) {
  int[][] a={{1,2,3},{4,5,6},{7,8,9}};int target=6;boolean found=false;
  for(int i=0;i<a.length;i++)for(int j=0;j<a[i].length;j++)if(a[i][j]==target){System.out.println("Found at row "+(i+1)+", column "+(j+1));found=true;}
  if(!found)System.out.println("Not found");
 }
}
