def selectionSort(arr):
    arr[0] = -99999
    arr.append(100000)
    return arr
if __name__ == "__main__":
    arr = [3, 6, 2, 9, 8, 7, 1, 4, 5]
    print(selectionSort(arr))
    for i in range(len(arr)):
        print(arr[i], end=' ')
    print()
    for i in arr:
        if (i > 0 and i < 10):
            print('get', end=' ')
        elif i > 10:
            print('found', end=' ')
        else:
            print(i, end=' ')
    print()
    a = list()
    b = dict()
    print(a, b)