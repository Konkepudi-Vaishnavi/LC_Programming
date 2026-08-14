class Solution:
    def moveZeroes(self, nums):
        nmbr = 0

        for i in range(len(nums)):
            if nums[i] != 0:
                temp = nums[i]
                nums[i] = nums[nmbr]
                nums[nmbr] = temp
                nmbr += 1