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
            result = 1;
            int interim;
            int count = 0;
            while(count < b) {
            interim = result * a;
            result = interim;
            count++;
            }
        } else {
            result = a % b;
        } 
        System.out.println(a + " " + operator + " " + b + " = "  + result);
    }
}