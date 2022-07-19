#include<iostream>
#include<vector>
using namespace std;

vector<int> gnomeSort (vector<int> arr)
{
    int pos = 0;
    while(pos < arr.size())
    {
        if (pos == 0 || arr[pos - 1] <= arr[pos])
            pos++;
        else
        {
            int temp = arr[pos - 1];
            arr[pos - 1] = arr[pos];
            arr[pos] = temp;
            pos--;
        }
    }
    return arr;
}
int main()
{
    vector<int> arr = { 3, 6, 2, 9, 8, 7, 1, 4, 5 };
    vector<int> newArr = gnomeSort(arr);
    for(int x : newArr){
        cout << x << " ";
    }
}