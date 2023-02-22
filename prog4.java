/*
4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
восстановить выражение до верного равенства. Предложить хотя бы
одно решение или сообщить, что его нет.*/

import java.util.Scanner;

public class prog4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("(выход - exit): ");
        String equation = in.next();
        while (!equation.equals("exit")) {
            String result = resultOfEquation(equation);
            System.out.printf("%s -> %s\n", equation, result);
            System.out.printf("(выход - exit): ");
            equation = in.next();
        }
        in.close();
    }
    
    static String resultOfEquation(String equation) {        
        String[] firstSplit = equation.split("=");
        String equationResult = firstSplit[1];
        String[] secondSplit = firstSplit[0].split("\\"+"+");
        String left = secondSplit[0];
        String right = secondSplit[1];
        String leftNum = "";
        String rightNum = "";
        String NewRes = "";
        for (int i = 0; i < 10; i++) {                      
            for (int j = 0; j < 10; j++) {                
                for (int k = 0; k < 10; k++) {
                    NewRes = equationResult.replace('?', (char) (k + '0'));
                    leftNum = left.replace('?', (char) (i + '0'));
                    rightNum = right.replace('?', (char) (j+'0'));                    
                    if (Integer.parseInt(leftNum) + Integer.parseInt(rightNum) == Integer.parseInt(NewRes)) {
                        return leftNum + '+' + rightNum + '=' + NewRes;
                    }
                }
            }
        }
        return "Решения нет";
    }
}