package Array;

public class UpdateArray {
    public static void updateMarks(int marks[]){
        for(int i= 0;i<marks.length;i++){
            marks[i]= marks[i]+2;
        }
         int unchangeable=10;
    }
    public static void main(String[] args) {
        int marks[]={99,78,39,55};
        long unchangeable=5;
        updateMarks(marks);
        for(int i=0;i<marks.length;i++){
           System.out.print(marks[i]+" ");
    }
    System.out.println();
    System.out.println(unchangeable);
}
}
