import java.util.Arrays;
class Q24_RemoveDuplicates {
 public static void main(String[] args) {
  int[] a={1,2,2,3,4,3,5,1},u=new int[a.length];int size=0;
  for(int x:a){boolean exists=false;for(int i=0;i<size;i++)if(u[i]==x)exists=true;if(!exists)u[size++]=x;}
  System.out.println(Arrays.toString(Arrays.copyOf(u,size)));
 }
}
