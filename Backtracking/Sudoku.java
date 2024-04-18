package Backtracking;

public class Sudoku {
    //first function!
    public static boolean isSafe(int sudoku[][],int row ,int col, int digit){
        // column!
        for(int i=0; i<=8; i++){// row traverse to place the digtit column wise!
            if(sudoku[i][col]== digit){
                return false;
            }
        }
        //row
        for(int j=0;j<=8;j++){  // to traverse the column to place the digit in each row!
            if(sudoku[row][j] == digit){ 
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;// sr starting row!
        int sc = (col/3)*3;
        //3x3!
        for(int i =sr;i<sr+3;i++){ // this is a neasted loop to be print 2d arr 3x3!
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }

    //second function
     public static boolean sudokuSolver(int sudoku[][], int row, int col){
        // base case!
        if(row == 9){
            return true;
        }
        //recursion!
        int nextRow = row, nextcol = col+1;
        if(col+1 == 9){
            nextRow = row+1;
            nextcol = 0;
        }
        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextRow, nextcol);
        }
        for(int digit =1; digit <=9;digit++){// this line will place the empty space!
           if(isSafe(sudoku, row, col, digit)){
            sudoku[row][col]= digit;
           if( sudokuSolver(sudoku, nextRow, nextcol)){// for solution existance!
            return true;

           }
           sudoku[row][col]= 0;
           }
        }
        return false;
      
     }

     // third function! 
     public static void printSudoku(int sudoku[][]){
        for(int i=0; i<9;i++){
            for(int j =0; j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
     }
    public static void main(String[] args) {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};
        if( sudokuSolver( sudoku,  0, 0)){
            System.out.println("solution exists");
            printSudoku(sudoku);
        }else{
            System.out.println("solutions does not exists");

        }
    }
    
}
