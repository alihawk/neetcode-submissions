class Solution {
    public int maxArea(int[] heights) {
        

        int area = 0;
        int j = heights.length - 1;
        int i = 0;
        int max =0;
        while(i<j){
            area = (j-i) * Math.min(heights[i],heights[j]);
            if(Math.min(heights[i],heights[j]) == heights[i]){
                i++;
            }else{
                j--;
            }
            max = Math.max(max,area);

     
        }
        return max;
    }
}
