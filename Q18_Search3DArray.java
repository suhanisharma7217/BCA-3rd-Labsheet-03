class Q18_Search3DArray {
 public static void main(String[] args) {
  int[][][] a={{{1,2},{3,4}},{{5,6},{7,8}}};int target=6;boolean found=false;
  for(int i=0;i<2;i++)for(int j=0;j<2;j++)for(int k=0;k<2;k++)if(a[i][j][k]==target){System.out.println("Found at layer "+(i+1)+", row "+(j+1)+", column "+(k+1));found=true;}
  if(!found)System.out.println("Not found");
 }
}
