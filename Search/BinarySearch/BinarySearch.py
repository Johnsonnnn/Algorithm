def bubbleSort(arr):
    for i in range(len(arr)):
        for j in range(i, len(arr)):
            if (arr[i] > arr[j]):
                arr[i], arr[j] = arr[j], arr[i]
                
def binarySearch(arr, findNum, left, right):
    mid = int((right + left) / 2)
    if(arr[mid] == findNum):
        return mid
    elif(findNum < arr[mid]):
        return binarySearch(arr, findNum, left, mid - 1)
    elif(arr[mid] < findNum):
        return binarySearch(arr, findNum, mid + 1, right)
    else:
        return -1
        
if __name__ == "__main__":
    arr = [ 3, 5, 3, 0, 8, 6, 1, 5, 8, 6, 2, 4, 9, 4, 7, 0, 1, 8, 9, 7, 3, 1, 2, 5, 9, 7, 19, 4, 0, 2, 6, 7]
    bubbleSort(arr)
    result = binarySearch(arr, 19, 0, len(arr) - 1)
    print(arr)
    print('binarySearch', result)
    print('arr[result]:', arr[result])
    