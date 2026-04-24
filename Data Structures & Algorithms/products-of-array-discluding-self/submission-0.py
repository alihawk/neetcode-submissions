class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        outputs = [1] * len(nums)
        prefix = 1
        suffix = 1
        i = 0
        for i in range(len(nums)):
            outputs[i] = prefix
            prefix = prefix * nums[i]
            

        for i in range(len(nums)-1,-1,-1):
            outputs[i] =outputs[i] * suffix
            suffix = suffix * nums[i]
            
        return outputs