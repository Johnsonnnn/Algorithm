public class OddEvenSort
{
    public static int[] oddEvenSort (int[] arr)
    {
        int temp;
        boolean isSorted = false;
        
        while(!isSorted){
            isSorted = true;
            for (int i = 0; i < 2; i++)
            {
                for (int j = i; j < arr.length - 1; j+=2)
                {
                    if(arr[j] > arr[j + 1]){
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        isSorted = false;
                    }
                }
            }
        }
        
        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr = { 3, 6, 2, 9, 8, 7, 1, 4, 5 };
        int[] newArr = oddEvenSort(arr);
        for(int x : newArr){
            System.out.print(x + " ");
        }
    }
}

