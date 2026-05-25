class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();

        for (int number: nums){
            set.add(number);
        }

        int longest = 0;

        for (int num:set){
          if(!set.contains(num-1)){

            int current = num;
            int sequence = 1;

            while(set.contains(current+1)){
               current++;
               sequence++;
            }
          longest = Math.max(longest, sequence);

          }

        }

        return longest;
    }
}
