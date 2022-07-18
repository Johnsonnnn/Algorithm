#include<iostream>
#include<vector>

using namespace std;
vector<int> selectionSort (vector<int> arr)
{
    int temp;
    
    for (int j = 0; j < arr.size() - 1; j++)
    {
        for (int i = 1; i < arr.size(); i++)
        {
            if (arr[i - 1] > arr[i])
            {
                temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }
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