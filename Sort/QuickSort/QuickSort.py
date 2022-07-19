def quickSort(arr):
    less = list()
    grater = list()
    if(len(arr) <= 1):
        return arr
    else:
        pivot = arr[len(arr) - 1]
        for i in range(len(arr) - 1):
            if(arr[i] < pivot):
                less.append(arr[i])
            else:
                grater.append(arr[i])
        return quickSort(less) + [pivot] + quickSort(grater)
    return arr
if __name__ == "__main__":
    arr = [ 3, 6, 2, 9, 8, 7, 1, 4, 5 ]
    print(quickSort(arr))