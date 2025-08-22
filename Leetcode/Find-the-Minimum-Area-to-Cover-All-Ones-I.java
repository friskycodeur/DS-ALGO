class Solution {
    public int minimumArea(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int right = -1, left = rows, top = rows, bottom = -1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j] == 1){
                    left = Math.min(left,i);
                    right = Math.max(right,i);
                    top = Math.min(top,j);
                    bottom = Math.max(bottom,j);
                }
            }
        }

        return (right-left+1)*(bottom-top+1);
    }
}