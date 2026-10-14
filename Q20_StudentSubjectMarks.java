class Q20_StudentSubjectMarks {
 public static void main(String[] args) {
  int[][] marks={{85,90},{78,82,88},{91,87,93,89}};
  for(int i=0;i<marks.length;i++){System.out.print("Student "+(i+1)+": ");for(int m:marks[i])System.out.print(m+" ");System.out.println();}
 }
}
