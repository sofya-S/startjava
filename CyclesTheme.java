public class CyclesTheme{

    public static void main(String[] args) {
        System.out.println("\n1. Even and odd numbers count");
        int count;
        count = -10;
        int even = 0;
        int odd = 0;
        do {
            count = count + 1;
            if(count % 2 == 0){
                even++;
            } else {
                odd++;
        }
        } while(count < 20);
        System.out.println("There are " + even + " even numbers and " + odd + " odd numbers in the [-10, 21] interval.");

        System.out.println("\n2. Display numbers in an interval in descending order");
        int num;
        num = 10;
        System.out.println("Numbers are:\n" + num);
        for(int i = 5; num > -1; i++){
            num = num - i;
            System.out.println(num);
        }

        System.out.println("\n3. Display number`s digits reversed and summed");
        num = 1234;
        int sum;
        sum = 0;
        System.out.println("reversed numbers are: ");
        while (num > 0) {
            int interim = num / 10;
            int digit = num - interim * 10;
            sum = sum + digit;
            num = interim;
            System.out.println(digit);
        }
        System.out.println("Sum of digit equals: " + sum);

        System.out.println("\n4. Display digits in several lines");
        count = 0;
        int zero = 0;
        for(int i = 1; i < 24; i = i + 2){
            System.out.printf("%5d", i);
            count++;
            if(count % 5 == 0){
                System.out.println("");
            } else if(i >= 23){
                while (count % 5 != 0) {
                    System.out.printf("%5d", zero);
                    count++;
                }
            }
        }

        System.out.println("\n\n5. Check parity of last digit in a number");
        num = 3141591;
        while (num == 3141591) {
            int interim = num / 10;
            int digit;
            digit = num - interim*10;
            if(digit % 2 == 0){
                System.out.println(num + " contains even number of ones");
            } else{
                System.out.println(num + " contains odd number of ones");
            }
            num--;
            }

        System.out.println("\n6. Draw figures in console");
        char dollar = 36;
        char asterisk = 42;
        char sharp = 35;
        count = 0;
        for(int i = 1; i <= 50; i++){
            System.out.print(asterisk);
            count++;
            if(count % 10 == 0){
                System.out.println("");
            } else {
                System.out.print("");
            }
        }
        while (count > 35){
            count--;
            System.out.print(sharp);
            if (count == 45 || count == 41 || count == 38 || count == 36 || count == 35) {
                System.out.println("");
            } else {
                System.out.print("");
            }       
        }
        do {
            System.out.print(dollar);
            count--;
            if (count == 34 || count == 32|| count == 29 || count == 27 || count == 26) {
                System.out.println("");
            } else {
                System.out.print("");
            }
        } while(count > 26);

        System.out.println("\n7. Print ASCII symbols in console");
        String header1 = "Dec";
        String header2 = "Char";
        System.out.printf("%5s %5s %n", header1, header2);
        char xXx = 0;
        for(int i = 0; i < 123; i++){
            xXx++;
            if((int)xXx % 2 == 0 & (int)xXx > 96){
                System.out.printf("%5s %5s %n",(int)xXx, xXx);;
            } else if((int)xXx % 2 != 0 & (int)xXx < 48){
                System.out.printf("%5s %5s %n",(int)xXx, xXx);
            }
        }

        System.out.println("\n8. Check if number is a palindrome");
        num = 1234321;
        sum = 0;
        int remainder = 0;
        int temp;
        temp = num;
        while (num >= 1) {
            remainder = num % 10; 
            sum = (sum*10) + remainder;
            num = num / 10;
            if(temp == sum){
                System.out.println(sum + " is a palindrome");
            } else {
                System.out.print("");
            }
        }

        System.out.println("\n9. Check whether number is lucky");
        num = 123321;
        int sumFirst = 0;
        int sumSecond = 0;
        int counter = 0;
        String number = String.valueOf(num);
        for (int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            Math.pow(j, 2);
            System.out.print(j);
            counter++;
            if(counter < 4){
                sumFirst = sumFirst + j;
            } else {
                sumSecond = sumSecond + j;
            }
            if(counter == 3){
                System.out.println(" sum equals " + sumFirst);
            } else if (counter == 6){
                System.out.println(" sum equals " + sumSecond);
            }
            }
            if(sumFirst == sumSecond){
                System.out.println("number is lucky");
            } else {
                System.out.println("number isn`t lucky");
            }

        System.out.println("\n10. Pythagorean multiplication table");
        System.out.print("  | ");
        for(count = 2; count <= 9; count++){
            System.out.printf("%4d", count);
            }
        System.out.println("");
        System.out.println("------------------------------------");
        for (count = 2; count <= 9; ++count) {
            System.out.print(count + " | ");    
            for (num = 2; num <= 9; ++num) {            
                System.out.printf("%4d", (count*num));
            }
            System.out.println();
        }
    }
}