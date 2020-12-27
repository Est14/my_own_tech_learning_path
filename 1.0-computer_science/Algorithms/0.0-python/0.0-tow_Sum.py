# Given an array of intigers, return indices of the two numbers such that they add up
# to a specific target.
# You may assume that ech input would have  exaclty one solution.

class Solution:

    def find_Index(self, arr, target):
        """
        :type arr: List[int]
        :type target: int 
        """
        num_to_index = {}

        for x, y  in enumerate(arr):
            print(target - y)
            if targe - y in num_to_index:
                return [num_to_index[target - y], x]

            num_to_index[y] = x

        return []


targe = 15 
num = [1, 2, 5, 6, 7, 10, 22]
objetive = Solution()
print(objetive.find_Index(num, targe))
