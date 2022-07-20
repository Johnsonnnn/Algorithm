class MaxHeapSort{
    static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    static void maxHeapify(int arr[], int start, int end)
    {
        int parent = start;
        int child = parent * 2 + 1;
        while(child <= end)
        {
            if(child + 1 <= end && arr[child] < arr[child + 1]){
                child++;
            }
            
            if(arr[parent] > arr[child]){
                return;
            }
            else{
                swap(arr, parent, child);
                parent = child;
                child = parent * 2 + 1;
            }
        }
    }
    
    static void heapSort(int arr[])
    {
        for(int i=arr.length / 2 - 1; i >= 0; i--)
            maxHeapify(arr, i, arr.length - 1);
        for(int i=arr.length - 1; i > 0; i--)
        {
            swap(arr, 0, i);
            maxHeapify(arr, 0, i - 1);
        }
    }
    
    public static void main(String[] args)
    {
        int arr[] = { 3, 5, 3, 0, 8, 6, 1, 5, 8, 6, 2, 4, 9, 4, 7, 0, 1, 8, 9, 7, 3, 1, 2, 5, 9, 7, 4, 0, 2, 6 };
        heapSort(arr);
        for(int x : arr)
            System.out.print(x + " ");
    }
}