class Q16_CountPositiveNegative3D {
 public static void main(String[] args) {
  int[][][] a={{{1,-2},{0,4}},{{-5,6},{-7,8}}};int p=0,n=0;
  for(int[][] l:a)for(int[] r:l)for(int x:r){if(x>0)p++;else if(x<0)n++;}
  System.out.println("Positive: "+p+" Negative: "+n);
 }
}
