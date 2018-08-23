class Stack(object):
    def __init__(self):
        self._list = []

    def push(self,item):
         self._list.append(item)

    def pop(self, item):
        return self._list.pop(item)

    def peek(self, item):
        if self.is_empty():
            return None
        else:
            return self._list[-1]

    def is_empty(self):
        return not self._list

    def size(self):
        return len(self._list)

if __name__ == "__main__":
    pass