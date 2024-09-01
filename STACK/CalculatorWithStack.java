package STACK;

import java.util.Stack;

public class CalculatorWithStack {

    public static void main(String[] args) {
        String expression = "5 * 3 * 6 / 2 - 4"; // Example expression
        double result = evaluateExpression(expression);
        System.out.println("Result: " + result);
    }

    public static double evaluateExpression(String expression) {
        // Remove all spaces from the expression
        expression = expression.replaceAll("\\s+", "");

        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (Character.isDigit(currentChar)) {
                StringBuilder numBuilder = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    numBuilder.append(expression.charAt(i));
                    i++;
                }
                i--;
                double num = Double.parseDouble(numBuilder.toString());
                numbers.push(num);
            } else if (currentChar == '(') {
                operators.push(currentChar);
            } else if (currentChar == ')') {
                while (operators.peek() != '(') {
                    performOperation(numbers, operators);
                }
                operators.pop(); // Pop the '('
            } else if (isOperator(currentChar)) {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(currentChar)) {
                    performOperation(numbers, operators);
                }
                operators.push(currentChar);
            }
        }

        while (!operators.isEmpty()) {
            performOperation(numbers, operators);
        }

        return numbers.pop();
    }

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    public static void performOperation(Stack<Double> numbers, Stack<Character> operators) {
        char op = operators.pop();
        double num2 = numbers.pop();
        double num1 = numbers.pop();
        double result = applyOperator(num1, num2, op);
        numbers.push(result);
    }

    public static double applyOperator(double num1, double num2, char op) {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return num1 / num2;
            default:
                return 0;
        }
    }
}


