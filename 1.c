/* 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
(произведение чисел от 1 до n)
*/
#include <stdio.h>
int main()
{
    int i, n, s = 0, f = 1;
    printf("Enter the integer: ");
    scanf(" %d", &n);

    for(i = 1; i<=n; i++)
    {
        s += i;
        f *= i;
    }

    printf("T = %d, Factorial = %d", s, f);

    return 0;
}