class Solution {
    public int trap(int[] height) {

        int length = height.length;
        int []leftMax = new int[length];
        int []rightMax = new int[length];
    
        int max = 0;
        int maxAtRight = 0;

        for(int i =0 ; i < length ; i++){
            
            max = Math.max(max,height[i]);
            leftMax[i]= max;
        
        }
        for(int i =length-1 ; i >= 0 ; i--){
            
            maxAtRight = Math.max(maxAtRight,height[i]);
            rightMax[i]= maxAtRight;
        
        }
        int totalWater = 0;
        for(int i =1 ; i <length -1 ; i ++){
            int waterAtI = Math.min(leftMax[i],rightMax[i]) - height[i];
            totalWater +=waterAtI;
       }
        return totalWater;
    }
}
