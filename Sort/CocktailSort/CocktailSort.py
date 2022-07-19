def cocktailSort (arr):
    left = 0
    right = len(arr) - 1
    while left < right:
        for i in range(left, right, 1):
            if (arr[i] > arr[i + 1]):
                temp = arr[i]
                arr[i] = arr[i + 1]
                arr[i + 1] = temp
        right -= 1
        for i in range(right, left, -1):
            if (arr[i - 1] > arr[i]):
                temp = arr[i - 1]
                arr[i - 1] = arr[i]
                arr[i] = temp
        left += 1
    return arr;
if __name__ == "__main__":
    arr = [ 3, 6, 2, 9, 8, 7, 1, 4, 5 ]
    print(cocktailSort(arr))
    

