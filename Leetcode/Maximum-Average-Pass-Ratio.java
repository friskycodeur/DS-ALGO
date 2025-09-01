import java.util.PriorityQueue;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int n = classes.length;
        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(
                ((b[0]+1)/(b[1]+1) - b[0]/b[1]),
                ((a[0]+1)/(a[1]+1) - a[0]/a[1])
            )
        );

        for (int[] c : classes) 
            pq.offer(new double[] {c[0], c[1]});

        for (int i = 0; i < extraStudents; i++) {
            double[] c = pq.poll();
            c[0]++;
            c[1]++;
            pq.offer(c);
        }

        double average = 0;
        for (double[] c : pq)
            average += c[0] / c[1];
        return average / n;
    }
}
