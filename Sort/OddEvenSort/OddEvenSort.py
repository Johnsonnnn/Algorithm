def oddEvenSort (arr):
    isSorted = False
    while not isSorted:
        isSorted = True
        for i in range(2):
            for j in range(i, len(arr) - 1, 2):
                if (arr[j] > arr[j + 1]):
                    temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                    isSorted = False
    return arr;
if __name__ == "__main__":
    arr = [ 3, 6, 2, 9, 8, 7, 1, 4, 5 ]
    print(oddEvenSort(arr))
    

