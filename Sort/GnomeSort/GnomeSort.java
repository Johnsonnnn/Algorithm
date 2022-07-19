class GnomeSort
{
    public static int[] gnomeSort (int[] arr)
    {
        int pos = 0;
        while(pos < arr.length)
        {
            if (pos == 0 || arr[pos - 1] <= arr[pos])
                pos++;
            else
            {
                int temp = arr[pos - 1];
                arr[pos - 1] = arr[pos];
                arr[pos] = temp;
                pos--;
            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr = { 3, 6, 2, 9, 8, 7, 1, 4, 5 };
        int[] newArr = gnomeSort(arr);
        for(int x : newArr){
            System.out.print(x + " ");
        }
    }
}

