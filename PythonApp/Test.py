a = '[1, 2, 3]'
b = len(a)
list = []
i = 0
l = 1
while i < b and l < b:
    list.append(int(a[l]))
    i += 1
    l = 3 * i + 1

print(list)
