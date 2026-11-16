class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r = 0; r < board.length; r++){
            Set<Character> row = new HashSet<>();
            for(int c = 0; c < board[r].length; c++){
                if(!row.add(board[r][c]) && board[r][c] != '.'){
                    return false;
                }
            }
        }

        for(int i = 0; i < board.length; i++){
            Set<Character> col = new HashSet<>();
            for(int j = 0; j < board[i].length; j++){
                if(!col.add(board[j][i]) && board[j][i] != '.'){
                    return false;
                }
            }
        }
        for(int square = 0; square < 9; square++){
            Set<Character> seen = new HashSet<>();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    int row = square / 3 * 3 + i;
                    int col = square % 3 * 3 + j;
                    if(!seen.add(board[row][col]) && board[row][col] != '.'){
                        return false;
                    }
                }
            }

        }
        return true;
        
    }
}
