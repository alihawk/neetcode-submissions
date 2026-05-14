class Solution {
    public int[] twoSum(int[] numbers, int target) {
        

        int i =0;
        int j =numbers.length-1;
        int[] indices = new int[2];
        while(i<j){
            if(numbers[i] + numbers[j] == target){
               indices[0]=i+1;
               indices[1]=j+1;
               return indices;
                
            }else if(numbers[i] + numbers[j] > target){
                j--;
            }else{
                i++;
            }
        }
        return indices;
    }
}
