public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Even and odd numbers count");
        int count = -10;
        int evenSum = 0;
        int oddSum = 0;
        do {
            if(count % 2 == 0) {
                evenSum += count;
            } else {
                oddSum += count;
            }
            count++;
        } while(count <= 20);
        System.out.println("In the [-10, 21] interval sum of even numbers equals "
                + evenSum + " and sum of odd numbers equals " + oddSum);

        System.out.println("\n2. Display numbers in an interval in descending order");
        int min = 10;
        int max = 5;
        int num = -1;
        System.out.println("Numbers are:\n");
        if(max < 10) {
            max = 10;
        } else if(max < -1) {
            max = -1;
        }
        if(min < 10) {
            min = 10;
        } else if(-1 < min) {
            min = -1;
        }
        for(int i = max; i >= min; i--) {
            System.out.println(max);
            max--;
        }

        System.out.println("\n3. Display number`s digits reversed and summed");
        num = 1234;
        int sum = 0;
        System.out.println("Reversed numbers are: ");
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
            System.out.println(digit);
        }
        System.out.println("Sum of digit equals: " + sum);

        System.out.println("\n4. Display digits in several lines");
        count = 0;
        for(int i = 1; i < 24; i += 2) {
            System.out.printf("%5d", i);
            count++;
            if(count % 5 == 0) {
                System.out.println();
            }
        }
        while (count % 5 != 0) {
            System.out.printf("%5d", 0);
            count++;
        }

        System.out.println("\n\n5. Check parity of last digit in a number");
        num = 3141591;
        while (num == 3141591) {
            int digit = num % 10;
            if(digit % 2 == 0) {
                System.out.println(num + " contains even number of ones");
            } else {
                System.out.println(num + " contains odd number of ones");
            }
            num--;
            }

        System.out.println("\n6. Draw figures in console");
        count = 0;
        for(int i = 1; i <= 50; i++) {
            System.out.print("*");
            count++;
            if(count % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();        
        int lenght = 5;
        int line;
        int size = 1;
        while(lenght >= size) {
            line = 1;
            while(line <= lenght) {
                System.out.print("#");
                line++;
            }
            lenght--;
            System.out.println();
        }
        System.out.println();
        int half = 5;
        int otherHalf = 3;
        do {
            line = 9;
            do {
                System.out.print("$");
                --line;
            } while (line / 2 >= half);
            System.out.println();
            half--;
            if (half == 3) {
                do { 
                int temp = otherHalf; 
                while (temp-- > 0) 
                    System.out.print("$");
                    System.out.println();
                otherHalf--;
                } while (otherHalf > 0);
            }
        } while (half > 3);


        System.out.println("\n7. Print ASCII symbols in console");
        System.out.printf("%5s %5s %n", "Dec", "Char");
        char symb = 0;
        for(int i = 0; i < 123; i++) {
            symb++;
            if(symb % 2 == 0 && symb > 96) {
                System.out.printf("%5s %5s %n",(int) symb, symb);
            } else if(symb % 2 != 0 && symb < 48) {
                System.out.printf("%5s %5s %n",(int) symb, symb);
            }
        }

        System.out.println("\n8. Check if number is a palindrome");
        num = 1234321;
        int reversedNum = 0;
        int copyNum = num;
        while (num > 0) {
            int digit = num % 10; 
            reversedNum = (reversedNum * 10) + digit;
            num /= 10;
        }
        if(copyNum == reversedNum) {
            System.out.println(reversedNum + " is a palindrome");
        } else {
            System.out.println(reversedNum + " is NOT a palindrome");
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
            if(counter < 4) {
                sumFirst += j;
            } else {
                sumSecond += j;
            }
            if(counter == 3) {
                System.out.println(" sum equals " + sumFirst);
            } else if (counter == 6) {
                System.out.println(" sum equals " + sumSecond);
            }
            }
            if(sumFirst == sumSecond) {
                System.out.println("number is lucky");
            } else {
                System.out.println("number isn`t lucky");
            }

        System.out.println("\n10. Pythagorean multiplication table");
        System.out.print("  | ");
        for(count = 2; count <= 9; count++) {
            System.out.printf("%4d", count);
            }
        System.out.println();
        System.out.println("------------------------------------");
        for (count = 2; count <= 9; ++count) {
            System.out.print(count + " | ");
            for (num = 2; num <= 9; ++num) {
                System.out.printf("%4d", (count * num));
            }
            System.out.println();
        }
    }
}