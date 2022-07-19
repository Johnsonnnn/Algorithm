class CocktailSort
{
    public static int[] cocktailSort (int[] arr)
    {
        int left = 0;
        int right = arr.length - 1;
        while(left < right)
        {
            for(int i=left; i < right; i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            right--;
            for(int i=right; left < i; i--)
            {
                if (arr[i - 1] > arr[i])
                {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
            left++;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr = { 3, 6, 2, 9, 8, 7, 1, 4, 5 };
        int[] newArr = cocktailSort(arr);
        for(int x : newArr){
            System.out.print(x + " ");
        }
    }
}



