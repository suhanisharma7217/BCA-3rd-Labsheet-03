class Q23_SecondLargest {
 public static void main(String[] args) {
  int[] a={12,45,7,89,45,67};int max=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
  for(int x:a){if(x>max){second=max;max=x;}else if(x>second&&x<max)second=x;}
  if(second==Integer.MIN_VALUE)System.out.println("No distinct second largest");else System.out.println("Second largest: "+second);
 }
}
