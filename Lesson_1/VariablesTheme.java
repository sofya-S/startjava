public class VariablesTheme {
  public static void main(String[] args) {
    System.out.println("\n1. Variables creation and values console output");
        byte win = 10;
        short ram = 16;
        int bit = 64;
        long swapFile = 12596;
        float processor = 2.50f;
        double ver = 19044.1826;
        char someChar = 'y';
        boolean task = true;
        System.out.println("byte - Windows " + win);
        System.out.println("short - " + ram + " GB ram");
        System.out.println("integer - " + bit + "-bit version of Windows");
        System.out.println("long - " + swapFile + " mB swap file");
        System.out.println("float - " + processor + " GHz processor");
        System.out.println("double - OS version" + ver);
        System.out.println("char - random character" + someChar);
        System.out.println("boolean - is task1 complete " + task);

        System.out.println("\n2. Cost calculation for discount items");
        double penPrice = 100f;
        double bookPrice = 200f;
        double discount = (penPrice + bookPrice) * 0.11;
        double discountPrice = (penPrice + bookPrice) - discount;
        System.out.println("Discount amount: " + discount);
        System.out.println("Total amount after discount: " + discountPrice);

        System.out.println("\n3. Console output of JAVA");
        System.out.println("   J    a v     v a");
        System.out.println("   J   a a v   v a a");
        System.out.println("J  J  aaaaa V V aaaaa");
        System.out.println(" JJ a      a V a     a");

        System.out.println("\n4. Display min and max values for numeric data types");
        byte byteVal = Byte.MAX_VALUE;
        System.out.println("initial num for byte - " + byteVal + ", incremented num for byte - " + (++byteVal)
                + ", decremented num for byte - " + (--byteVal));
        short shortVal = Short.MAX_VALUE;
        System.out.println("initial num for short - " + shortVal + ", incremented num for short - " + (++shortVal)
                + ", decremented num for short - " + (--shortVal));
        long longVal = Long.MAX_VALUE;
        System.out.println("initial num for long - " + longVal + ", incremented num for long - " + (++longVal)
                + ", decremented num for long - " + (--longVal));

        System.out.println("\n5. Swapping variable values");
        int x = 2;
        int y = 5;
        System.out.print("Part I, third variable. Initial values: first variable = " + x + ", second variable = "+ y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println(". New values after exchange: first variable = " + x + ", second variable = " + y);
        System.out.print("Part II, math. Initial values: first variable = " + x + ", second variable = " + y);
        x += y;
        y = x - y;
        x -= y;
        System.out.println(". New values after exchange: first variable = " + x + ", second variable = " + y);
        System.out.print("Part III, bitwise operation. Initial values: first variable = "
                + x + ", second variable = " + y);
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println(". New values after exchange: first variable = " + x + ", second variable = " + y);

        System.out.println("\n6. Console output of symbols and their codes");
        char charA = 35;
        char charB = 38;
        char charC = 64;
        char charD = 94;
        char charE = 95;
        System.out.println((int) charA + " - " + charA);
        System.out.println((int) charB + " - " + charB);
        System.out.println((int) charC + " - " + charC);
        System.out.println((int) charD + " - " + charD);
        System.out.println((int) charE + " - " + charE);

        System.out.println("\n7. Display amount of hundreds, tens and ones in a number");
        int num = 123;
        int ones = num % 10;
        int tens = num / 10 % 10;
        int hundreds = num / 100;
        System.out.println("Number " + num + " has " + hundreds + " hundreds.");
        System.out.println("Number " + num + " has " + tens + " tens.");
        System.out.println("Number " + num + " has " + ones + " ones.");

        System.out.println("\n8. Console output of ASCII-art");
        char slash = 0x002f;
        char backSlash = 0x005c;
        char underscore = 0x005f;
        char rightParentheses = 0x0028;
        char leftParentheses = 0x0029;
        char space = 0x0020;
        System.out.println("" + space + space + space + space + space + slash + backSlash);
        System.out.println("" + space + space + space + space + slash + space + space + backSlash);
        System.out.println("" + space + space + space + slash + underscore + rightParentheses + space + leftParentheses + backSlash);
        System.out.println("" + space + space + slash + space + space + space + space + space + space + backSlash);
        System.out.println("" + space + slash + underscore + underscore + underscore + underscore + slash + 
                backSlash + underscore + underscore + backSlash);

        System.out.println("\n9. Product and sum of digits");
        num = 345;
        ones = num % 10;
        tens = num / 10 % 10;
        hundreds = num / 100;
        int sumDigits = hundreds + tens + ones;
        int prodDigits = hundreds * tens * ones;
        System.out.println("Sum of digits for " + num + " = " + sumDigits);
        System.out.println("Product of digits for " + num + " = " + prodDigits);

        System.out.println("\n10. Seconds transformation");
        int totalSeconds  = 86399;
        int hour = totalSeconds / 3600 ;
        int minute = (totalSeconds % 3600) / 60;
        int second = totalSeconds  % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}