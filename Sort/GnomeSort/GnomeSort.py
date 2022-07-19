def gnomeSort(arr):
    pos = 0;
    while(pos < len(arr)):
        if (pos == 0 or arr[pos - 1] <= arr[pos]):
            pos += 1
        else:
            arr[pos - 1], arr[pos] = arr[pos], arr[pos - 1]
            pos -= 1
    return arr;
if __name__ == "__main__":
    arr = [ 3, 6, 2, 9, 8, 7, 1, 4, 5 ]
    print(gnomeSort(arr))