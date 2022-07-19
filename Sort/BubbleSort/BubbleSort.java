public class BubbleSort
{
    public static int[] bubbleSort(int arr[]){
        int temp;
		for(int j=0; j < arr.length - 1; j++){
		    for(int i=1; i < arr.length - j; i++){
    		    if(arr[i - 1] > arr[i]){
    		        temp = arr[i - 1];
    		        arr[i - 1] = arr[i];
    		        arr[i] = temp;
    		    }
    		}
		}
		return arr;
    }
	public static void main(String[] args) {
		int[] arr = {3, 6, 2, 9, 8, 7, 1, 4, 5};
		bubbleSort(arr);
		for (int x : arr){
		    System.out.println(x);
		}
	}
}