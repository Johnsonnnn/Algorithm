#include<iostream>
#include<vector>
using namespace std;

vector<int> combSort (vector<int> arr)
{
    double shrink_factor = 0.8;
    bool isSorted = true;
    int gap = arr.size();
    
    while(gap > 1 || isSorted)
    {
        if (gap > 1)
            gap *= shrink_factor;    
        isSorted = false;
        for(int i=0; i + gap < arr.size(); i++)
        {
            cout << "------------i:-------------:" << i << endl;
            for(int j=0; j< arr.size(); j++){
                if(j == i + gap)
                    cout << "[" << arr[j] << "] ";
                else if(j == i)
                    cout << "(" << arr[j] << ") ";
                else
                    cout << arr[j] << " ";
            }
            cout << endl;
            
            if (arr[i] > arr[i + gap])
            {
                int temp = arr[i];
                arr[i] = arr[i + gap];
                arr[i + gap] = temp;
                isSorted = true;
            }
        }
        cout << endl;
    }
    return arr;
}
int main()
{
    vector<int> arr = { 3, 6, 2, 9, 8, 7, 1, 4, 5 };
    vector<int> newArr = combSort(arr);
    for(int x : newArr){
        cout << x << " ";
    }
}



