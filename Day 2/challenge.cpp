// Given an integer n, reverse its digits and return the reversed number. Ignore leading zeros in the reversed result.

#include <iostream>
using namespace std;

int reverseNumber(int num) {
    int rev = 0;

    while (num != 0) {
        int digit = num % 10;
        rev = rev * 10 + digit;
        num /= 10;
    }

    return rev;
}

int main() {
    int num;
    cout << "Enter a number: ";
    cin >> num;

    int reversed = reverseNumber(num);
    cout << "Reversed number: " << reversed << endl;

    return 0;
}