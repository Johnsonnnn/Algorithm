#include<iostream>
#include<vector>
using namespace std;

vector<int> oddEvenSort (vector<int> arr)
{
    bool isSorted = false;
    
    while(!isSorted){
        isSorted = true;
        for (int i = 0; i < 2; i++)
        {
            for (int j = i; j < arr.size() - 1; j+=2)
            {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
    return arr;
}
int main()
{
    vector<int> arr = { 3, 6, 2, 9, 8, 7, 1, 4, 5 };
    vector<int> newArr = oddEvenSort(arr);
    for(int x : newArr){
        cout << x << " ";
    }
}