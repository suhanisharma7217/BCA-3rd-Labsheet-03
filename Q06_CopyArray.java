import java.util.Arrays;
class Q06_CopyArray {
 public static void main(String[] args) {
  int[] a={4,8,12,16,20}, b=new int[a.length];
  for(int i=0;i<a.length;i++) b[i]=a[i];
  System.out.println("Copied array: "+Arrays.toString(b));
 }
}
