#!/usr/bin/env python3

# Details: http://blog.gainlo.co/index.php/2016/11/18/uber-interview-question-move-zeroes/?utm_source=email&utm_campaign=email&utm_medium=email

def MoveZeros(arr):
    #changing the rray in-place; no need to return
    if (arr == []):
        return arr

    n = len(arr)

    count0 = 0
    nonZero = 0
    for p in range(0, n):
        if (arr[p] == 0):
            count0 += 1
        else:
            arr[nonZero] = arr[p]
            nonZero += 1

    for p in range(n - count0, n):
        arr[p] = 0

if __name__ == '__main__':
    arr = [1, 2, 0, 3, 0, 1, 2]
    MoveZeros(arr)
    print(arr)
