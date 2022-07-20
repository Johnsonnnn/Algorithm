def maxHeapify(arr, start, end):
    parent = start
    child = parent * 2 + 1
    while(child <= end):
        if(child + 1 <= end and arr[child] < arr[child + 1]):
            child += 1
        if(arr[parent] > arr[child]):
            return
        else:
            arr[parent], arr[child] = arr[child], arr[parent]
            parent = child
            child = parent * 2 + 1
def heapSort(arr):
    for i in range(int(len(arr) / 2) - 1, -1, -1):
        maxHeapify(arr, i, len(arr) - 1)
    for i in range(len(arr) - 1, 0, -1):
        arr[0], arr[i] = arr[i], arr[0]
        maxHeapify(arr, 0, i - 1)
if __name__ == "__main__":
    arr = [ 3, 5, 3, 0, 8, 6, 1, 5, 8, 6, 2, 4, 9, 4, 7, 0, 1, 8, 9, 7, 3, 1, 2, 5, 9, 7, 4, 0, 2, 6 ]
    heapSort(arr)
    for x in arr:
        print(x, end=' ')