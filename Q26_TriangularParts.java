class Q26_TriangularParts {
 public static void main(String[] args) {
  int[][] a={{1,2,3},{4,5,6},{7,8,9}};int n=a.length;
  System.out.println("Upper triangular:");for(int i=0;i<n;i++){for(int j=0;j<n;j++)System.out.print((j>=i?a[i][j]:0)+" ");System.out.println();}
  System.out.println("Lower triangular:");for(int i=0;i<n;i++){for(int j=0;j<n;j++)System.out.print((j<=i?a[i][j]:0)+" ");System.out.println();}
 }
}
