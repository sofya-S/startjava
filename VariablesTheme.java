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
        float penPrice = 100f;
        float bookPrice = 200f;
        float discount = (penPrice * 11) / 100 + (bookPrice * 11) / 100;
        float discountPrice = (penPrice + bookPrice) - discount;
        System.out.println("Discount amount: " + discount);
        System.out.println("Total amount after discount: " + discountPrice);

        System.out.println("\n3. Console output of JAVA");
        System.out.println("   J    a v     v a");
        System.out.println("   J   a a v   v a a");
        System.out.println("J  J  aaaaa V V aaaaa");
        System.out.println(" JJ a      a V a     a");

        System.out.println("\n4. Display min and max values for numeric data types");
        byte byteVal = Byte.MAX_VALUE;
        System.out.print("initial value for byte - " + byteVal + ", incremented value for byte - ");
        System.out.print(byteVal+1);
        System.out.print(", decremented value for short - ");
        System.out.println(byteVal-1);
        short shortVal = Short.MAX_VALUE;
        System.out.print("initial value for short - " + shortVal + ", incremented value for short - ");
        System.out.print(shortVal+1);
        System.out.print(", decremented value for short - ");
        System.out.println(shortVal-1);
        long longVal = Long.MAX_VALUE;
        System.out.print("initial value for long - " + longVal + ", incremented value for long - ");
        System.out.print(longVal + 1);
        System.out.print(", decremented value for long - ");
        System.out.println(longVal-1);

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
        y -= x;
        x -= y;
        System.out.println(". New values after exchange: first variable = " + x + ", second variable = " + y);
        System.out.print("Part III, bitwise operation. Initial values: first variable = "
                + x + ", second variable = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(". New values after exchange: first variable = " + x + ", second variable = " + y);

        System.out.println("\n6. Console output of sybmols and their codes");
        char charA = 35;
        char charB = 38;
        char charC = 64;
        char charD = 94;
        char charE = 95;
        System.out.println((int)charA + " - " + charA);
        System.out.println((int)charB + " - " + charB);
        System.out.println((int)charC + " - " + charC);
        System.out.println((int)charD + " - " + charD);
        System.out.println((int)charE + " - " + charE);

        System.out.println("\n7. Display amount of hundreds, tens and ones in a number");
        int num = 123;
        int numOnes = num % 100 % 10;
        int numTens = num / 10 % 10;
        int numHundreds = num / 100;
        System.out.println("Number " + num + " has " + numHundreds + " hundreds.");
        System.out.println("Number " + num + " has " + numTens + " tens.");
        System.out.println("Number " + num + " has " + numOnes + " ones.");

        System.out.println("\n8. Console output of ASCII-art");
        char slash = 47;
        char backSlash = 92;
        char underscore = 95;
        char rightHook = 40;
        char leftHook = 41;
        char space = 32;
        System.out.println(space+""+space+""+space+""+space+""+space+""+slash+""+backSlash);
        System.out.println(space+""+space+""+space+space+""+slash+""+space+""+space+""+backSlash);
        System.out.println(space+""+space+""+space+slash+""+underscore+""+rightHook+""+space+""+leftHook+""+backSlash);
        System.out.println(space+""+space+""+slash+space+""+space+space+""+space+""+space+""+space+""+backSlash);
        System.out.println(space+""+slash+""+underscore+""+underscore+""+underscore+""+underscore+""+slash+""+
                backSlash+""+underscore+""+underscore+""+backSlash);

        System.out.println("\n9. Product and sum of digits");
        int numOriginal = 345;
        int numHundred = numOriginal / 100;
        int numTen = numOriginal / 10 % 10;
        int numOne = numOriginal % 100 % 10;
        int sumDigits = numHundred + numTen + numOne;
        int prodDigits = numHundred * numTen * numOne;
        System.out.println("Sum of digits for " + numOriginal + " = " + sumDigits);
        System.out.println("Product of digits for " + numOriginal + " = " + prodDigits);

        System.out.println("\n10. Seconds transformation");
        int totalSeconds  = 86399;
        int hour = totalSeconds / 3600 ;
        int minute = (totalSeconds % 3600) / 60;
        int second = totalSeconds  % 60;
        System.out.println(hour +":" + minute + ":" + second);
    }
}