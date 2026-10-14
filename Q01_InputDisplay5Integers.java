import java.util.Scanner;
class Q01_InputDisplay5Integers {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in); int[] a=new int[5];
  System.out.println("Enter 5 integers:");
  for(int i=0;i<5;i++) a[i]=sc.nextInt();
  for(int x:a) System.out.print(x+" ");
  sc.close();
 }
}
