#include <iostream>
using namespace std;

bool isArmstrong(int n) {
    int orig = n;
    int sum = 0;
    while (n > 0) {
        int rem = n % 10;
        sum += rem * rem * rem;  
        n /= 10;
    }
    return sum == orig;
}

int main() {
    int num;
    cout << "Enter Number: ";
    cin >> num;

    if (isArmstrong(num)) {
        cout << num << " is an Armstrong number.\n";
    } else {
        cout << num << " is not an Armstrong number.\n";
    }

    return 0;
}
