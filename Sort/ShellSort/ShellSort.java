class ShellSort{
    static void showArr(int[] arr, int step){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            if(i > 0 && i % step == step - 1)
                System.out.println();
        }
        System.out.println();
    }
    
    
    static void shellsortSort(int[] arr, int step){
        System.out.println("-----------------------");
        System.out.println("Step: " + step);
        showArr(arr, step);
        for(int i=0; i < step; i++){
            for(int j=i; j < arr.length; j+=step){
                if(j > step - 1 && arr[j - step] > arr[j]){
                    int tempValue = arr[j];
                    int nowPoint = j;
                    while (nowPoint > step - 1 && arr[nowPoint - step] > tempValue){
                        arr[nowPoint] = arr[nowPoint - step];
                        nowPoint -= step;
                    }
                    arr[nowPoint] = tempValue;
                }
            }
        }
        System.out.println("::after::");
        showArr(arr, step);
        System.out.println("-----------------------");
    }
    public static void main(String[] args){
        int[] arr = { 3, 5, 3, 0, 8, 6, 1, 5, 8, 6, 2, 4, 9, 4, 7, 0, 1, 8, 9, 7, 3, 1, 2, 5, 9, 7, 4, 0, 2, 6, 7};
        for(int step=5; step > 0; step-=2)
            shellsortSort(arr, step);
        for(int x : arr)
            System.out.print(x + " ");
    }
}

