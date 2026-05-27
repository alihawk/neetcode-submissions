class Solution {
    public int search(int[] nums, int target) {
        int left =0;
        int right = nums.length - 1;



        while(left<=right){
        int mid = left + (right - left)/2 ;

        System.out.println("left= "+left + ", mid= " + mid + ", right= "+right);
         if(nums[mid]== target){
            return mid;

         }

         if(nums[left]<= nums[mid]){
            System.out.println("left half reached: ");

          if(nums[left]<=target && target < nums[mid]){
            right = mid-1;
          }else{
            left = mid+1;
          }

         }else{
            System.out.println("Right half entered.  ");
            if(nums[mid]<target && target <= nums[right]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
         }

        }


      return -1 ;
    }
}
