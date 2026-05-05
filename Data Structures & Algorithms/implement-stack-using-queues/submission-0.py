from collections import deque



class MyStack:

    def __init__(self):
        self.checkQueue = deque()


    def push(self, x: int) -> None:
        self.checkQueue.append(x)
        for _ in range(len(self.checkQueue) - 1):
            self.checkQueue.append(self.checkQueue.popleft())
    def pop(self) -> int:
        return self.checkQueue.popleft()

    def top(self) -> int:
        return self.checkQueue[0]

    def empty(self) -> bool:
        return len(self.checkQueue) == 0
        


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()