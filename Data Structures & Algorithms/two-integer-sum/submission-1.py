class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        track =[]
        
        for i in range(len(nums)):
            for j in range(len(nums)):
                if i != j and nums[i] + nums[j] == target:
                    track.append(i)
                    track.append(j)
                    return track