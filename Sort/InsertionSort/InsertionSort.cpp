#include<iostream>
using namespace std;
void insertionSort(int arr[], int len)
{
    for(int i=0; i < len; i++){
        if(i > 0 && arr[i - 1] > arr[i])
        {
            int nowPoint = i;
            int tempValue = arr[i];
            while(nowPoint > 0 && arr[nowPoint - 1] > tempValue)
            {
                arr[nowPoint] = arr[nowPoint - 1];
                nowPoint--;
            }
            arr[nowPoint] = tempValue;
        }
    }
}

int main()
{
    int arr[] = { 3, 5, 3, 0, 8, 6, 1, 5, 8, 6, 2, 4, 9, 4, 7, 0, 1, 8, 9, 7, 3, 1, 2, 5, 9, 7, 4, 0, 2, 6 };
    insertionSort(arr, sizeof(arr) / sizeof(int));
    for(int x : arr)
        cout << x << " ";
}