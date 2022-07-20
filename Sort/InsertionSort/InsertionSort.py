def insertionSort(arr):
    for i in range(len(arr)):
        if(i > 0 and arr[i] < arr[i - 1]):
            nowPoint = i
            tempValue = arr[i]
            while(nowPoint > 0 and arr[nowPoint - 1] > tempValue):
                arr[nowPoint] = arr[nowPoint - 1]
                nowPoint -= 1
            arr[nowPoint] = tempValue
if __name__ == "__main__":
    arr = [ 3, 5, 3, 0, 8, 6, 1, 5, 8, 6, 2, 4, 9, 4, 7, 0, 1, 8, 9, 7, 3, 1, 2, 5, 9, 7, 4, 0, 2, 6 ]
    insertionSort(arr)
    print(arr)