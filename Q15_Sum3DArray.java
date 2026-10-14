class Q15_Sum3DArray {
 public static void main(String[] args) {
  int[][][] a={{{1,2},{3,4}},{{5,6},{7,8}}};int s=0;
  for(int[][] l:a)for(int[] r:l)for(int x:r)s+=x;
  System.out.println("Sum: "+s);
 }
}
