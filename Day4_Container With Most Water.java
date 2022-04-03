class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l < r) {
            int lh = height[l];
            int rh = height[r];
            int h = Math.min(lh, rh);
            int area = h * (r - l);
            if(area > max) {
                max = area;
            }
            if (lh > rh) {
                while(l != r && height[r] <= rh) {
                    r--;
                }
            } else {
                 while(l != r && height[l] <= lh) {
                    l++;
                }
            }
        }
        return max;
    }
}
