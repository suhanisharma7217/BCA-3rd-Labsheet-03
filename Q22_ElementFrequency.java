class Q22_ElementFrequency {
 public static void main(String[] args) {
  int[] a={2,3,2,5,3,2,4};boolean[] seen=new boolean[a.length];
  for(int i=0;i<a.length;i++){if(seen[i])continue;int count=1;for(int j=i+1;j<a.length;j++)if(a[i]==a[j]){count++;seen[j]=true;}System.out.println(a[i]+" occurs "+count+" time(s)");}
 }
}
