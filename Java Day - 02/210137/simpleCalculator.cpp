#include <bits/stdc++.h>
using namespace std;
class Calculator
{
public:
    int add(int a, int b)
    {
        return a + b;
    }
    int subtract(int a, int b)
    {
        return a - b;
    }
    int multiply(int a, int b)
    {
        return a * b;
    }
    int divide(int a, int b)
    {
        return a / b;
    }
};

int main()
{
    Calculator obj;
    int a, b;
    cout << "Enter two numbers: ";
    cin >> a >> b;

    cout << "Addition of two numbers : " << obj.add(a, b) << '\n';
    cout << "Subtraction of two numbers : " << obj.subtract(a, b) << '\n';
    cout << "Multiplication of two numbers : " << obj.multiply(a, b) << '\n';
    cout << "Division of two numbers : " << obj.divide(a, b) << '\n';
}
