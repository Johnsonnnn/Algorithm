class CombSort
{
    public static int[] combSort (int[] arr)
    {
        double shrink_factor = 0.8;
        boolean isSorted = true;
        int gap = arr.length;
        
        while(gap > 1 || isSorted)
        {
            if (gap > 1)
                gap *= shrink_factor;    
            isSorted = false;
            for(int i=0; i + gap < arr.length; i++)
            {
                System.out.println("------------i:-------------:" + i);
                for(int j=0; j< arr.length; j++){
                    if(j == i + gap)
                        System.out.print("[" + arr[j] + "] ");
                    else if(j == i)
                        System.out.print("(" + arr[j] + ") ");
                    else
                        System.out.print(arr[j] + " ");
                }
                System.out.println();
                
                if (arr[i] > arr[i + gap])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    isSorted = true;
                }
            }
            System.out.println();
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr = { 3, 6, 2, 9, 8, 7, 1, 4, 5 };
        int[] newArr = combSort(arr);
        for(int x : newArr)
            System.out.print(x + " ");
    }
}



