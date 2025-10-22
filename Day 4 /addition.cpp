#include <iostream>
using namespace std;

int add(int a, int b) {
    return a + b;
}

int main() {
    int x, y;

    cout << "Enter two numbers: ";
    cin >> x >> y;

    int result = add(x, y);

    cout << "Addition of two numbers = " << result << endl;

    return 0;
}
