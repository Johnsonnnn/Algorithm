#include<iostream>
using namespace std;

void bubbleSort(int arr[], int len){
    for(int i=0; i < len; i++)
        for(int j=i; j < len; j++)
            if (arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
}
                
int binarySearch(int arr[], int findNum, int left, int right){
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

int main(){
    int arr[] = { 3, 5, 3, 0, 8, 6, 1, 5, 8, 6, 2, 4, 9, 4, 7, 0, 1, 8, 9, 7, 3, 1, 2, 5, 9, 7, 19, 4, 0, 2, 6, 7};
    int len = sizeof(arr) / sizeof(int);
    bubbleSort(arr, len);
    int result = binarySearch(arr, 19, 0, len - 1);
    for(int x : arr)
        cout << x << " ";
    cout << endl;
    cout << "binarySearch:" << result << endl;
    cout << "arr[result]:" << arr[result] << endl;
}