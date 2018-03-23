import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char operator = scan.next().charAt(0);
        int num1 = scan.nextInt(), num2 = scan.nextInt();
        System.out.println(operator == '+' ? "result : " + ((float) num1 + num2) : operator == '-' ? "result : " + ((float) num1 - num2) : operator == '*' ? "result : " + ((float) num1 * num2) : operator == '/' ? num2 != 0 ? "result : " + ((float) num1 / num2) : "Cannot divide by zero!" : "No operator");
    }
}