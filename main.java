/******************************************************************************

 Liudmila Chizhikova (c) 
Автор Чижикова Людмила Андреевна 

*******************************************************************************/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите математический оператор (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Результат: " + result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль");
                } else {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                }
                break;
            default:
                System.out.println("Ошибка: неподдерживаемый оператор");
                break;
        }

        scanner.close();
}} 
