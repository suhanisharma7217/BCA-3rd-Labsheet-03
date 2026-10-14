class Q30_SparseMatrix {
 public static void main(String[] args) {
  int[][] a={{0,0,3},{0,0,0},{4,0,0}};int zeros=0,nonzeros=0;
  for(int[] r:a)for(int x:r)if(x==0)zeros++;else nonzeros++;
  System.out.println("Zeros: "+zeros+", non-zeros: "+nonzeros);
  System.out.println(zeros>nonzeros?"Sparse matrix":"Not a sparse matrix");
 }
}
