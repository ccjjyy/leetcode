# -*- coding: utf-8 -*-

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        if len(nums) <= 1:
            return False
        diff_dict = {}
        for i in range(len(nums)):
            if nums[i] in diff_dict:
                return [diff_dict[nums[i]], i]
            else:
                diff_dict[target - nums[i]] = i

s = Solution()
print s.twoSum([2,7,11,15], 17)
