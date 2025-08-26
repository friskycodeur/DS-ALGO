class Solution {
    private double calcDiagonal(int length, int width){
        // donot return sqrt as it will increase the TL and comparison 
        // can be done without it
        return Math.pow(length, 2) + Math.pow(width, 2);
    }

    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonalLength = Double.MIN_VALUE;
        int requiredArea = 0;
        for(int i=0;i<dimensions.length;i++){
            double currDiagonalLength = calcDiagonal(dimensions[i][0], dimensions[i][1]);
            if(currDiagonalLength > maxDiagonalLength){
                maxDiagonalLength = currDiagonalLength;
                requiredArea = dimensions[i][0] * dimensions[i][1];
            } else if(currDiagonalLength == maxDiagonalLength){
                requiredArea = Math.max(requiredArea, dimensions[i][0] * dimensions[i][1]);
            }
        }

        return requiredArea;
    }

    
}