class Solution {

    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] grids = new HashSet[9];
        
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            grids[i] = new HashSet<>();
        }

        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                char val = board[row][col];
                if(val == '.') continue;
                int gridIdx = (row/3)*3+(col/3);
                if(rows[row].contains(val) || cols[col].contains(val) || grids[gridIdx].contains(val)){
                    return false;
                }
                rows[row].add(val);
                cols[col].add(val);
                grids[gridIdx].add(val);
            }
        }

        return true;
    }
}