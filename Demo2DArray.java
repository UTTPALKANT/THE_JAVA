package THE_JAVA;

public class Demo2DArray {
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
        //System.out.println(matrix); print address
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix.length;j++)
        System.out.print(matrix[i][j]);
        }

    }
}
