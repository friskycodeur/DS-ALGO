class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        int cnt = 0, operations = 0;

        /* Brute force
        ArrayList<Integer> boxWithBalls = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(boxes.charAt(i)!='0'){
                boxWithBalls.add(i);
            }
        }

        
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<boxWithBalls.size();j++){
                sum+= Math.abs(i-boxWithBalls.get(j));
            }
            res[i] = sum;
        }

        return res;

        */

        for(int i=0;i<n;i++){
            res[i] = operations;
            cnt += boxes.charAt(i) - '0';
            operations += cnt;
        }

        cnt = 0; operations = 0;

        for(int i=n-1;i>=0;i--){
            res[i] += operations;
            cnt += boxes.charAt(i) - '0';
            operations += cnt;
        }

        return res;
    }
}