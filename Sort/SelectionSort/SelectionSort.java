public class SelectionSort
{
    public static int[] selectionSort (int[] arr)
    {
        int temp;
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int minIndex = i;
            for (int j = i; j < arr.length; j++)
            {
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if (minIndex != i)
            {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr = { 3, 6, 2, 9, 8, 7, 1, 4, 5 };
        int[] newArr = selectionSort(arr);
        for(int x : newArr){
            System.out.print(x + " ");
        }
    }
}

