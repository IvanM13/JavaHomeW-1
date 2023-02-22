/* 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
(произведение чисел от 1 до n)
*/
import java.util.Scanner;

public class prog1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        in.close();

        int s = 0;
        int f = 1;

        for(int i = 1; i<=n; i++){
            s += i;
            f *= i;

        }
        System.out.printf(" T = %d, Factorial = %d\n", s, f);
    }
}