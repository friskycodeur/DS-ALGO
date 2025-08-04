class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> mp = new HashMap<>();
        int left = 0, maxLength = 0;
        for(int right=0;right<fruits.length;right++){
            int rightType = fruits[right];
            mp.put(rightType, mp.getOrDefault(rightType, 0)+1);

            while(mp.size() > 2){
                int leftType = fruits[left];
                mp.put(leftType, mp.get(leftType)-1);
                if(mp.get(leftType) == 0) mp.remove(leftType);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}