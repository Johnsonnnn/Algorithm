def showArr(step):
    for i in range(len(arr)):
        print(arr[i], end=' ')
        if(i > 0 and i % step == step - 1):
            print()
    print()

def shellsortSort(arr, step):
    print('-' * 50)
    print('Step:', step)
    showArr(step)
    for i in range(step):
        for j in range(i, len(arr), step):
            if(j > step - 1 and arr[j - step] > arr[j]):
                tempValue = arr[j]
                nowPoint = j
                while (nowPoint > step - 1 and arr[nowPoint - step] > tempValue):
                    arr[nowPoint] = arr[nowPoint - step]
                    nowPoint -= step
                arr[nowPoint] = tempValue
    print('::after::')
    showArr(step)
    print('-' * 50)
if __name__ == "__main__":
    arr = [ 3, 5, 3, 0, 8, 6, 1, 5, 8, 6, 2, 4, 9, 4, 7, 0, 1, 8, 9, 7, 3, 1, 2, 5, 9, 7, 4, 0, 2, 6, 7]
    for step in range(5, 0, -2):
        shellsortSort(arr, step)
    print(arr)