public class Calculator {
    
    public static void main(String[] args) {
        
        int a = 2;
        int b = 8;
        char sign = '^';
        double result = 1;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '%') {
            result = a % b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '%') {
            result = a % b;
        } else if (sign == '^') {
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}