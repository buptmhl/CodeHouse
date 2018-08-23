import numpy as np
import random
w = np.zeros([2,5])
print(w)
for i in range(4):
    a = np.where(random.randint(0,10) >= 5, 1, -1)
    print(a)

def isPalindrome(x):
    if x < 0 or (x % 10 == 0 and x != 0):
        return False
    reversenumber = 0
    while x > reversenumber:
        reversenumber = reversenumber * 10 + x % 10
        x //= 10
    return x == reversenumber or x == (reversenumber // 10)

#def findMaxCommonStr(list):
#    for li in list:
#        for string in li:
