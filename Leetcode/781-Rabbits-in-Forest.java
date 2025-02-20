class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for(int num: answers){
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }

        int minRab = 0;

        for(int c: countMap.keySet()){
            int groupSize = c+1;

            int numGroups = (int) Math.ceil((double)countMap.get(c)/groupSize);

            minRab += numGroups * groupSize;
        }

        return minRab;
    }
}