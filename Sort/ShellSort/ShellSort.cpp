#include<iostream>
using namespace std;

void showArr(int arr[], int step, int len){
    for(int i=0; i < len; i++){
        cout << arr[i] << " ";
        if(i > 0 && i % step == step - 1)
            cout << endl;
    }
    cout << endl;
}

void shellsortSort(int arr[], int step, int len){
    cout << "-----------------------" << endl;
    cout << "Step: " << step << endl;
    showArr(arr, step, len);
    for(int i=0; i < step; i++){
        for(int j=i; j < len; j+=step){
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
    cout << "::after::" << endl;
    showArr(arr, step, len);
    cout << "-----------------------" << endl;
}
int main(){
    int arr[] = { 3, 5, 3, 0, 8, 6, 1, 5, 8, 6, 2, 4, 9, 4, 7, 0, 1, 8, 9, 7, 3, 1, 2, 5, 9, 7, 4, 0, 2, 6, 7};
    for(int step=5; step > 0; step-=2)
        shellsortSort(arr, step, sizeof(arr) / sizeof(int));
    for(int x : arr)
       cout << x << " ";
}
