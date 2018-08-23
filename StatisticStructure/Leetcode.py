def twoSum( nums, target):
    n = len(nums)
    list = []
    for i in range(n):
        for j in range(i+1, n):
            if nums[i] + nums[j] == target:
                list.append(i)
                list.append(j)
    return list
nums = [2,7,11,15]
target = 9
#print(twoSum(nums,target))
for i in range(10,-1,-1):
    print(i, end = " ")
#print(" ")
#print(len(str(100)))
#a = str(100).pop
#for i in a:
#   print(i)
#print(a[0])


def reverse(x):
    if x % 10 == 0:
        x = x / 10
    else:
        x = x
    string = str(x)
    num = []
    for j in string:
        num.append(j)
    n = len(num)
    for i in range(n//2):
        [i] = string[n - 1 - i]
    return int(string)

print(reverse(156))