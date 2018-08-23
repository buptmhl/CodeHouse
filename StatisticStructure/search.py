def binary_search(aslist, item):
    # 递归思路
    n = len(aslist)
    mid = n // 2
    # 递归执行判断条件
    if n > 0:
        if aslist[mid] == item:
            return True
        elif aslist[mid] > item:
            return binary_search(aslist[:mid], item)
        elif aslist[mid] < item:
            return binary_search(aslist[mid + 1:], item)
    else:
        return False


def binary_search2(aslist, item):
    n = len(aslist)
    first = 0
    last = n - 1
    while first <= last:
        mid = (first + last) // 2
        if aslist[mid] == item:
            return True
        elif aslist[mid] > item:
            last = mid - 1
        else:
            first = mid + 1
    return False


list = [23, 4, 54, 6, 76, 74, 56, 67, 567]

print(binary_search(list, 76))
print(binary_search(list, 100))

print(binary_search2(list, 76))
print(binary_search2(list, 100))


class Solution:
    def twoSum(self, nums, target):
        n = len(nums)
        list = []
        for i in range(n):
            for j in range(i + 1, n):
                if nums[i] + nums[j] == target:
                    list.append[i]
                    list.append[j]
        return list
