def bubbleSort(arr):
    for j in range(len(arr) - 1):
        for i in range(1, len(arr) - j):
            if (arr[i - 1] > arr[i]):
                temp = arr[i - 1]
                arr[i - 1] = arr[i]
                arr[i] = temp
    return arr
if __name__ == "__main__":
    arr = [3, 6, 2, 9, 8, 7, 1, 4, 5]
    print(bubbleSort(arr))