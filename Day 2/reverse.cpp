#include <iostream>
using namespace std;

int reverse(int n) {
    int rev = 0;
    while (n > 0) {
        int digit = n % 10;       
        rev = rev * 10 + digit; 
        n /= 10;                 
    }
    return rev;
}

int main() {
    int num;
    cout << "Enter a number: ";
    cin >> num;

    int rev = reverse(num);
    cout << "Reversed number: " << rev << endl;

    return 0;
}
