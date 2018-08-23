def bubble_sort(aslist):
    n = len(aslist)
    for j in range(n-1):
        count = 0
        for i in range(n-1-j):
            if aslist[i] > aslist[i+1]:
                aslist[i], aslist[i+1] = aslist[i+1], aslist[i]
                count += 1
        if count == 0:
                return

def select_sort(aslist):
    n = len(aslist)
    for j in range(n-1):
        for i in range(j+1, n):
            if aslist[j] > aslist[i]:
                aslist[j], aslist[i] = aslist[i], aslist[j]

def insert_sort(aslist):
    n = len(aslist)
    #从右边的无序序列中取出多少个元素执行这样的过程
    for j in range(1, n):
        # j = [1,2,3,n-1]
        # i代表内层循环起始值
        i = j
        while i > 0 :
            if aslist[i] < aslist[i-1]:
                aslist[i], aslist[i-1] = aslist[i-1], aslist[i]
                i -= 1
            else:
                break

def shell_sort(aslist):
    n = len(aslist)
    # 初始步长
    gap = n // 2
    while gap >= 1:
        # 按步长进行插入排序
        for j in range(gap, n):
            while j > 0 :
                # 插入排序
                if aslist[j] < aslist[j-gap]:
                    aslist[j], aslist[j-gap] = aslist[j-gap], aslist[j]
                    j -=gap
                else:
                    break
        gap //= 2

def quick_sort(aslist, first, last):
    mid_value = aslist[first]
    high = last
    low = first
    # 递归是否继续进行的条件
    if first >= last:
        return
    while low < high:
        # high指针左移
        while low < high and aslist[high] >= mid_value:
            high -= 1
        aslist[low] = aslist[high]
        # low指针右移
        while low < high and aslist[low] < mid_value:
            low += 1
        aslist[high] = aslist[low]
    # 从循环退出时， low == high
    aslist[low] = mid_value
    # 对基准两侧进行排序
    quick_sort(aslist, first, low-1)
    quick_sort(aslist, low+1, last)

def merge_sort(aslist):
    n = len(aslist)
    if n <= 1:
        return aslist
    mid = n//2
    left_li = merge_sort(aslist[:mid])
    right_li = merge_sort(aslist[mid:])
    left_pointer, right_pointer = 0, 0
    result = []
    while left_pointer < len(left_li) and right_pointer < len(right_li):
        if left_li[left_pointer] < right_li[right_pointer]:
            result.append(left_li[left_pointer])
            left_pointer += 1
        else:
            result.append(right_li[right_pointer])
            right_pointer += 1
    result += left_li[left_pointer:]
    result += right_li[right_pointer:]
    return result

list = [54, 26, 93, 17, 77, 31, 44, 55, 20]
print(list)
result = merge_sort(list)
print(result)
