public class CalculatorTask{

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        char operator = 94;
        if(operator == 43) {
            System.out.println(a + " + " + b + " = " + (a+b));
        } else if(operator == 45) {
            System.out.println(a + " " + operator + " " + b + " = " + (a-b));
        } else if(operator == 42) {
            System.out.println(a + " " + operator + " " + b + " = " + (a*b));
        } else if(operator == 47) {
            System.out.println(a + " " + operator + " " + b + " = " + (a/b));
        } else if(operator == 37) {
            System.out.println(a + " " + operator + " " + b + " = " + (a%b));
        } else if(operator == 94) {
            System.out.println(a + " " + operator + " " + b + " = " + Math.pow(a,b));
        } else{
            System.out.println("Invalid Input");
        }
   
  }
}