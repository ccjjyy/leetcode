# -*- coding: utf-8 -*-

class Solution(object):
    def findRestaurant(self, list1, list2):
        """
        :type list1: List[str]
        :type list2: List[str]
        :rtype: List[str]
        """
        dic1 = {str1: i for i, str1 in enumerate(list1)}
        best, result = 1e9, []
        
        for j, str2 in enumerate(list2):
            i = dic1.get(str2, 1e9)
            if i + j < best:
                best = i + j
                result = [str2]
            elif i + j == best:
                result.append(str2)
        return result


s = Solution()
list1 = ["Shogun", "KFC", "Burger King", "Tapioca Express"]
list2 = ["KFC", "Shogun", "Burger King"]
print(s.findRestaurant(list1, list2))
