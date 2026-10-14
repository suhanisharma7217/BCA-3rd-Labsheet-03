class Q17_Maximum3DArray {
 public static void main(String[] args) {
  int[][][] a={{{11,2},{30,4}},{{5,60},{7,8}}};int max=a[0][0][0];
  for(int[][] l:a)for(int[] r:l)for(int x:r)if(x>max)max=x;
  System.out.println("Maximum: "+max);
 }
}
