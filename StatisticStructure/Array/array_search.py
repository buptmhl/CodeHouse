array = [2,3,1,0,2,5,3]

# 寻找列表的重复数字
def sort_compare(array):
    # 冒泡排序
    n = len(array)
    for j in range(n-1):
        count = 0
        for i in range(n-1-j):
            if array[i] > array[i+1]:
                array[i], array[i+1] = array[i+1], array[i]
                count += 1
        # if count == 0:
        #     return array
    # 寻找重复数字
    for k in range(n-1):
        if array[k] == array[k+1]:
            print("重复数字", end="")
            print(array[k])

# 增加一个新的数组
def add_hash_table(array):
    list = []
    n = len(array)
    for i in range(n):
        if len(list) == 0:
            list.append(array[i])
        else:
            for j in range(len(list)):
                if array[i] == list[j]:
                    print("重复数字", end="")
                    print(array[i])
                    return
                else:
                    list.append(array[i])

# 最低复杂度
def index(array):
    n = len(array)
    for i in range(n):
        while array[i] != i:
            if array[i] == array[array[i]]:
                print("重复数字", end="")
                print(array[i])
                break
            temp = array[i]
            array[i] = array[temp]
            array[temp] = temp




if __name__ == '__main__':
    a = [1,2,3,4]
    print(a[:3])

