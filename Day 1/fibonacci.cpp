#include <iostream>
using namespace std;

void fibonacci(int n) {
    int a = 0, b = 1;
    for (int i = 1; i <= n; i++) {
        cout << a << " ";
        int temp = a + b;
        a = b;
        b = temp;
    }
    cout << endl;
}

int main() {
    int n;
    cout << "Enter number of terms: ";
    cin >> n;

    fibonacci(n); 

    return 0;
}