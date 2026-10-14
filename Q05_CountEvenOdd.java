class Q05_CountEvenOdd {
 public static void main(String[] args) {
  int[] a={2,7,8,11,14,19}; int even=0,odd=0;
  for(int x:a) if(x%2==0) even++; else odd++;
  System.out.println("Even: "+even+" Odd: "+odd);
 }
}
