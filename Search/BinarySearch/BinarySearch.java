public class BinarySearch{
    static void bubbleSort(int[] arr){
        for(int i=0; i < arr.length; i++)
            for(int j=i; j < arr.length; j++)
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
    }
                    
    static int binarySearch(int[] arr, int findNum, int left, int right){
        int mid = (int)((right + left) / 2);
        if(arr[mid] == findNum)
            return mid;
        else if(findNum < arr[mid])
            return binarySearch(arr, findNum, left, mid - 1);
        else if(arr[mid] < findNum)
            return binarySearch(arr, findNum, mid + 1, right);
        else
            return -1;
    }
    
    public static void main(String[] args){
        int[] arr = { 3, 5, 3, 0, 8, 6, 1, 5, 8, 6, 2, 4, 9, 4, 7, 0, 1, 8, 9, 7, 3, 1, 2, 5, 9, 7, 19, 4, 0, 2, 6, 7};
        bubbleSort(arr);
        int result = binarySearch(arr, 19, 0, arr.length - 1);
        for(int x : arr)
            System.out.print(x + " ");
         System.out.println();
         System.out.println("binarySearch:" + result);
         System.out.println("arr[result]:" + arr[result]);
    }
}