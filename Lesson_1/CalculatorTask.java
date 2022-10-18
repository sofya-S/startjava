public class CalculatorTask {

    public static void main(String[] args) {
        int a = 14;
        int b = 3;
        int result;
        char operator = '^';
        if(operator == '+') {
            result = a + b;
        } else if(operator == '-') {
            result = a - b;
        } else if(operator == '*') {
            result = a * b;
        } else if(operator == '/') {
            result = a / b;
        } else if(operator == '^') {
            result = a;
            for(int i = 1; i < b; i++) {
            result *=  a;
            }
        } else {
            result = a % b;
        } 
        System.out.println(a + " " + operator + " " + b + " = "  + result);
    }
}