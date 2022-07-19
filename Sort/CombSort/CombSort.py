def combSort (arr):
    shrink_factor = 0.8
    isSorted = True
    gap = len(arr)
    
    while(gap > 1 or isSorted):
        if (gap > 1):
            gap = int(gap * shrink_factor)
        isSorted = False
        for i in range(len(arr) - gap):
            print("------------i:-------------:", i)
            for j in range(len(arr)):
                if(j == i + gap):
                    print("[{}]".format(arr[j]), end=' ')
                elif(j == i):
                    print("({})".format(arr[j]), end=' ')
                else:
                    print(arr[j], end=' ')
            print()
            if (arr[i] > arr[i + gap]):
                temp = arr[i]
                arr[i] = arr[i + gap]
                arr[i + gap] = temp
                isSorted = True
        print()
    return arr;
if __name__ == "__main__":
    arr = [ 3, 6, 2, 9, 8, 7, 1, 4, 5 ]
    print(combSort(arr))
    




