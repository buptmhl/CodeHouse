class Node(object):
    def __init__(self,item):
        self.elem = item
        self.next = None


class LinkList(object):
    def __init__(self, node = None):
        self._head = node

    def is_equal(self):
         return self._head is None

    def append(self, item):
        node = Node(item)
        if self.is_equal():
            self._head = node
        else:
            cur = self._head
            while cur.next != None:
                cur = cur.next
            cur.next = node

    def travel(self):
        cur = self._head
        while cur != None:
            print (cur.elem,end ="")
            cur = cur.next
        print("")

    def length(self):
        cur = self._head
        count = 0
        while cur is not None:
            count +=1
            cur = cur.next
        return count

    def insert(self, pos, item):
        count = 0
        pre = self._head
        node = Node(item)
        while count < pos - 1:
            count += 1
            pre = pre.next
        node.next = pre.next
        pre.next = node

    def search(self, item):
        cur = self._head
        while cur  != None :
            if cur.elem == item:
                return True
            else:
                cur = cur.next
        return False


if __name__ ==  "__main__":
    list = LinkList()
    print(list.is_equal())
    list.append(1)
    list.append(2)
    list.append(3)
    list.insert(1,1)
    list.travel()
    print(list.search(2))
    print(list.length())
    print(list.is_equal())

