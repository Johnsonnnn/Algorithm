#include<iostream>
#include<vector>

using namespace std;
vector<int> selectionSort (vector<int> arr)
{
    int temp;
    
    for (int i = 0; i < arr.size() - 1; i++)
    {
        int minIndex = i;
        for (int j = i; j < arr.size(); j++)
        {
            if(arr[minIndex] > arr[j]){
                minIndex = j;
            }
        }
        if (minIndex != i)
        {
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    return arr;
}
int main()
{
    vector<int> arr = { 3, 6, 2, 9, 8, 7, 1, 4, 5 };
    vector<int> newArr = selectionSort(arr);
    for(int x : newArr){
        cout << x << " ";
    }
}