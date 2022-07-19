import java.util.Arrays;
class QuickSort
{
    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static int partition(int[] arr, int left, int right)
    {
        int pivot = right;
        int storeIndex = left;
        
        for(int i=left; i < right; i++)
        {
            if(arr[i] < arr[pivot])
            {
                swap(arr, storeIndex, i);
                storeIndex++;
            }
        }
        swap(arr, storeIndex, pivot);
        return storeIndex;
    }
    
    public static void quickSort (int[] arr, int left, int right)
    {
           if(left < right)
           {
               int pivot = partition(arr, left, right);
               quickSort(arr, left, pivot - 1);
               quickSort(arr, pivot + 1, right);
           }
    }
    
    public static void main(String[] args)
    {
        int[] arr = { 3, 6, 2, 9, 8, 7, 1, 4, 5 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

