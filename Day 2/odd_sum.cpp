#include <iostream>
using namespace std;

int oddSum(int n){
    int sum=0;
    for(int i=1; i<=n; i++){
        sum = sum + (2 * i - 1);
    }
    return sum;
}

int main(){
    int n;
    cout << "Enter Number: ";
    cin >> n;

    cout << "Sum of first " << n << " odd numbers = " << oddSum(n);
    return 0;

}