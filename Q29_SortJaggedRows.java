import java.util.Arrays;
class Q29_SortJaggedRows {
 public static void main(String[] args) {
  int[][] a={{5,2,8},{9,1},{7,4,6,3}};
  for(int i=0;i<a.length;i++){Arrays.sort(a[i]);System.out.println("Row "+(i+1)+": "+Arrays.toString(a[i]));}
 }
}
