class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] outputs = new int[nums.length];
        int suffix =1;
        int prefix =1;

        for(int i =0 ; i<nums.length; i++){
            outputs[i] = prefix;
            prefix = prefix * nums[i];
        }
        
        for(int i =nums.length-1 ; i>=0; i--){
            outputs[i] *= suffix;
            suffix *= nums[i];
        }
        return outputs;

    }
}  
