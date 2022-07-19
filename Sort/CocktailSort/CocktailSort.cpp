#include<iostream>
#include<vector>
using namespace std;

vector<int> cocktailSort (vector<int> arr)
{
    int left = 0;
    int right = arr.size() - 1;
    while(left < right)
    {
        for(int i=left; i < right; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        right--;
        for(int i=right; left < i; i--)
        {
            if (arr[i - 1] > arr[i])
            {
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }
        }
        left++;
    }
    return arr;
}
int main()
{
    vector<int> arr = { 3, 6, 2, 9, 8, 7, 1, 4, 5 };
    vector<int> newArr = cocktailSort(arr);
    for(int x : newArr){
        cout << x << " ";
    }
}
