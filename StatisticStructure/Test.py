def delete(array):
    n = len(array)
    count = 0
    for i in range(n-1):
        if array[i] == array[i+1]:
            count += 1
    return n-count

def delete1(array):
    n = len(array)
    j = 0
    for i in range(1,n):
        if array[i] != array[j]:
            j+=1
            array[j] = array[i]
    return  j+1


if __name__ == '__main__':
    nums = [1,1,2]
    num = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
    string = "we are."
    i = 0
    while string[i] != '.':
        i += 1
    print(i)