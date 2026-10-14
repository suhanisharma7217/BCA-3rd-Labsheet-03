class Q09_SumEachRow {
 public static void main(String[] args) {
  int[][] a={{1,2,3},{4,5,6},{7,8,9}};
  for(int i=0;i<a.length;i++){int s=0;for(int x:a[i])s+=x;System.out.println("Row "+(i+1)+": "+s);}
 }
}
