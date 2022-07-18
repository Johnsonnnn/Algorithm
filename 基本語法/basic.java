public class basic{
    public static int[] selectionSort(int[] arr)
    {
        arr[0] = -99999;
        arr[1] = 100000;
        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr = {3, 6, 2, 9, 8, 7, 1, 4, 5};
        int[] newArr = selectionSort(arr);
        for(int i=0; i < newArr.length; i++)
            System.out.print(newArr[i] + " ");
        System.out.println();
        for(int i : newArr)
            if(i > 0 && i < 10)
                System.out.print("get ");
            else if(i > 10)
                System.out.print("found ");
            else
                System.out.print(i + " ");
    }
}