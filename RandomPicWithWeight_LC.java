class Solution {
    
    int[] ar;
    int total;
    Random random;

    public Solution(int[] w) {
        this.random = new Random();
        for(int i=1; i<w.length; ++i)
            w[i] += w[i-1];
        this.ar = w;
        this.total = ar[w.length - 1];
    }
    
    public int pickIndex() {
        int low = 0, high = ar.length - 1;
        int target = 1 + random.nextInt(total);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ar[mid] == target) {
                return mid;
            }
            if (ar[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
