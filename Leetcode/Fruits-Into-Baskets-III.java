class Solution {
    ArrayList<Integer> segTree;

    void constructTree(int[] baskets, int start, int end, int n){
        if(start == end){
            segTree.set(n, baskets[start]);
            return;
        }
        int mid = (start+end)/2;
        constructTree(baskets, start, mid, 2*n);
        constructTree(baskets, mid+1, end, 2*n+1);
        segTree.set(n, Math.max(segTree.get(2*n), segTree.get(2*n+1)));
    }

    int searchTree(int n, int start, int end, int k){
        if(segTree.get(n) < k) return -1;
        if(start == end){
           segTree.set(n, -1);
           return start;
        }
        int mid = (start+end)/2;
        int position = (segTree.get(2*n)>=k)?searchTree(2*n, start, mid, k):searchTree(2*n+1, mid+1, end, k);
        segTree.set(n, Math.max(segTree.get(2*n), segTree.get(2*n+1)));
        return position;
    }

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        segTree = new ArrayList<>(Collections.nCopies(4*n, 0));
        constructTree(baskets, 0, n-1, 1);
        int unplaced = 0;

        for(int fruit: fruits){
            if(searchTree(1,0,n-1,fruit) == -1){
                unplaced++;
            }
        }

        return unplaced;
    }
}