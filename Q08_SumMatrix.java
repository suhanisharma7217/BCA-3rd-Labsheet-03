class Q08_SumMatrix {
 public static void main(String[] args) {
  int[][] a={{1,2,3},{4,5,6},{7,8,9}}; int sum=0;
  for(int[] r:a) for(int x:r) sum+=x;
  System.out.println("Matrix sum: "+sum);
 }
}
