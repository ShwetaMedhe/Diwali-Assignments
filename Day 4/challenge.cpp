//You are given an array of size n that contains distinct numbers from 0 to n. You task is to find the one number that is missing from the array.

#include <iostream>
using namespace std;

int findMissing(int arr[], int n) {
    int sum = 0;
    for (int i = 0; i < n; i++)
        sum += arr[i];          

    int total = n * (n + 1) / 2; 
    return total - sum;          
}

int main() {
    int arr[] = {0, 1, 2, 4, 5, 6, 7};   
    int n = sizeof(arr) / sizeof(arr[0]); 

    cout << "Missing number is: " << findMissing(arr, n) << endl;

    return 0;
}
