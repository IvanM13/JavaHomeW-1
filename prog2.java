
/*2. Вывести все простые числа от 1 до 1000 */
import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter of the number in the seguance: ");
        int n = in.nextInt();
        in.close();
        boolean b = true;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.print(i + " ");
            else b = true;
        }
    }
} 

    

