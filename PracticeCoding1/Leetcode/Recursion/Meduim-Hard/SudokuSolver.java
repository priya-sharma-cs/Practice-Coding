public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '6', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        solveSudoku(board);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void solveSudoku(char[][] board) {
        completeSudoku(board);
        
    }
    public static boolean completeSudoku(char[][] board){
        int[] emptycell = new int[2];
        if(!isAnyCellEmpty(board,emptycell)){
            return true;
        }
        int row = emptycell[0];
        int col = emptycell[1];

        for(int i =1 ; i<=9 ; i++){
            char value= (char)(i+'0');
            if(isValid(board,value, row , col)){
                board[row][col]=value;
                if(completeSudoku(board)==true){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }

    public static boolean isValid(char[][] board, char cv, int row, int col){
        for(int colI = 0 ; colI < 9 ; colI++){
            if(board[row][colI] == cv){
                return false;
            }
        }  
        for(int rowI =0 ; rowI < 9 ; rowI++){

            if(board[rowI][col] ==cv){
                if(board[rowI][col] == cv){
                    return false;
                }
            }
        }  

        int  Srow = row - row%3;
        int Scol = col - col%3;

        for(int i= Srow ; i<Srow +3 ; i++){
            for(int j =Scol ; j < Scol+3 ; j++){
                if(board[i][j] == cv){
                    return false;
                }
            }
        }

        return true;

    }

    public static boolean isAnyCellEmpty(char[][]board,int[] emptycell){
            for(int i =0 ; i<9 ; i++){
                for(int j=0 ; j<9 ; j++){
                    if(board[i][j]=='.'){
                        emptycell[0]=i;
                        emptycell[1]=j;
                        return true;
                    }
                }
            }
            return false;
    }
}

