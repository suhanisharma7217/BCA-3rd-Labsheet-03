import java.util.Scanner;
class Q02_Reverse10Integers {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in); int[] a=new int[10];
  System.out.println("Enter 10 integers:");
  for(int i=0;i<10;i++) a[i]=sc.nextInt();
  for(int i=9;i>=0;i--) System.out.print(a[i]+" ");
  sc.close();
 }
}
