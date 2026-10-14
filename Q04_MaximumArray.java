class Q04_MaximumArray {
 public static void main(String[] args) {
  int[] a={12,45,7,89,23}; int max=a[0];
  for(int x:a) if(x>max) max=x;
  System.out.println("Maximum: "+max);
 }
}
