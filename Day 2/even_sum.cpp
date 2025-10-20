#include <iostream>
using namespace std;

int sumEven(int n){
    int sum =0;
    for(int i=1; i<=n; i++){
        sum = sum + 2 * i;
    }
return sum;
}

int main(){
    int n;
    cout<<"Enter Number: ";
    cin>>n;

    cout << "Sum of first " << n << " even numbers = " << sumEven(n);
    return 0;
}