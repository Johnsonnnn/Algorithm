#include<iostream>
#include<vector>
using namespace std;

vector<int> selectionSort(vector<int> arr)
{
    arr[0] = -99999;
    arr.insert(arr.end(), 100000);
    return arr;
}
int main()
{
    vector<int> arr = {3, 6, 2, 9, 8, 7, 1, 4, 5};
    vector<int> newArr = selectionSort(arr);
    for(int i=0; i < newArr.size(); i++)
        cout << newArr[i] << " ";
    cout << endl;
    for(int i : newArr)
        if(i > 0 && i < 10)
            cout << "get" << " ";
        else if(i > 10)
            cout << "found" << " ";
        else
            cout << i << " ";
}
    