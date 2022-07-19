#include<iostream>
using namespace std;
void swap(int arr[], int a, int b)
{
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}

int partition(int arr[], int left, int right)
{
    int pivot = right;
    int storeIndex = left;
    for(int i=left; i < right; i++)
    {
        if(arr[i] < arr[pivot])
        {
            swap(arr, storeIndex, i);
            storeIndex++;
        }
    }
    swap(arr, storeIndex, pivot);
    return storeIndex;
}

void quickSort (int arr[], int left, int right)
{
    if(left < right)
    {
        int pivot = partition(arr, left, right);
        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }
}

int main()
{
    int arr[] = { 3, 6, 2, 9, 8, 7, 1, 4, 5 };
    quickSort(arr, 0, (sizeof(arr) / sizeof(int)) - 1);
    for(int x : arr){
        cout << x << " ";
    }
}