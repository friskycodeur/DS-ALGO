class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int grps = 0, n=colors.length;
        for(int i=1;i<=n;i++){
            int prevTile = colors[i-1];
            int currTile = colors[i%n];
            int nextTile = colors[(i+1)%n];

            if(prevTile== nextTile && prevTile!= currTile){
                grps++;
            }
        }

        return grps;
    }
}