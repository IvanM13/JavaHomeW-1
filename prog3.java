//3. Реализовать простой калькулятор

import java.util.Scanner;

public class prog3 {
	public static void main(String args[]) {
		String op;
		double num1, num2;
		
		Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter num1 ");
		num1 = scan.nextDouble();

		System.out.print("Enter operator: ");
		op = scan.next();
		
		System.out.print("Enter num2 ");
		num2 = scan.nextDouble();
		
		switch (op)
		{
			case "+":
				System.out.println(num1 + num2);
				break;
				
			case "-":
				System.out.println(num1 - num2);
				break;
				
			case "*":
				System.out.println(num1 * num2);
				break;
				
			case "/":{
				if (num2 != 0)
					System.out.println(num1 / num2);
				else
					System.out.println("Divizion be zero");
				break;}
				
			default:
				System.out.println("wrong!");
		}
		scan.close();
	}
}
