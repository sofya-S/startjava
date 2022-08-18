public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Variables creation and values console output");
        byte win = 10;
        short ram = 16;
        int  bit = 64;
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
        float penDiscount = (100 * 11) / 100;
        float bookDiscount = (200 * 11) / 100;
        float totalDiscount = penDiscount + bookDiscount;
        float totalCost = (penPrice + bookPrice) - totalDiscount;
        System.out.println("Discount amount: " + totalDiscount);
        System.out.println("Total amount after discount: " + totalCost);

        System.out.println("\n3. Console output of JAVA");
        System.out.println("   J   a v      v a");
        System.out.println("   J  a a v    v a a");
        System.out.println("J  J  aaaaa V V aaaa");
        System.out.println(" JJ a      a V a    a");

        System.out.println("\n4. Display min and max values for numeric data types");
        byte byteIntVal = Byte.MAX_VALUE;
        System.out.print("initial value for byte - " + byteIntVal + ", ");
        byteIntVal++;
        System.out.print("incremented value for byte - " + byteIntVal + ", ");
        byteIntVal--;
        System.out.println("decremented value for byte - " + byteIntVal);
        short shortIntVal = Short.MAX_VALUE;
        System.out.print("initial value for short - " + shortIntVal + ", ");
        shortIntVal++;
        System.out.print("incremented value for short - " + shortIntVal + ", ");
        shortIntVal--;
        System.out.println("decremented value for short - " + shortIntVal);
        long longIntVal = Long.MAX_VALUE;
        System.out.print("initial value for long - " + longIntVal + ", ");
        longIntVal++;
        System.out.print("incremented value for long - " + longIntVal + ", ");
        longIntVal--;
        System.out.println("decremented value for long - " + longIntVal);

        System.out.println("\n5. Swapping variable values");
        int x = 2;
        int y = 5;
        System.out.print("Part I, third variable. Initial values: first variable = " + x + ", second variable = "+ y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println(". New values after exchange: first variable = " + x + ", second variable = " + y);
        System.out.print("Part II, math. Initial values: first variable = " + x + ", second variable = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(". New values after exchange: first variable = " + x + ", second variable = " + y);
        System.out.print("Part III, bitwise operation. Initial values: first variable = " + x + ", second variable = " + y);
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
        int asciiA= charA;
        int asciiB= charB;
        int asciiC= charC;
        int asciiD= charD;
        int asciiE= charE;
        System.out.println(asciiA + "\t\t" + charA);
        System.out.println(asciiB + "\t\t" + charB);
        System.out.println(asciiC + "\t\t" + charC);
        System.out.println(asciiD + "\t\t" + charD);
        System.out.println(asciiE + "\t\t" + charE);


        System.out.println("\n7. Display amoumt of hundreds, tens and ones in a number");
        int num = 123;
        int numOnes = num / 1;
        int numTens = num / 10;
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
        System.out.println(new String(new char[]{space,space,space,space,space,slash,backSlash}));
        System.out.println(new String(new char[]{space,space,space,space,slash,space,space,backSlash}));
        System.out.println(new String(new char[]{space,space,space,slash,underscore,rightHook,space,leftHook,backSlash}));
        System.out.println(new String(new char[]{space,space,slash,space,space,space,space,space,space,backSlash}));
        System.out.println(new char[]{space,slash,underscore,underscore,underscore,underscore,slash,backSlash,underscore,underscore,backSlash});

        System.out.println("\n9. Product and sum of digits");
        int numO = 345;
        int numF = numO / 100;
        int numS = numO % 100;
        int numT = numS / 10;
        int numW = numS / 9;
        int numSum = numF + numT + numW;
        int numProduct = numF * numT * numW;
        System.out.println("Sum of digits for " + numO + " = " + numSum);
        System.out.println("Product of digits for" + numO + " = " + numProduct);


        System.out.println("\n10. Seconds transformation");
        int almostDay = 86399;
        int hour = almostDay / 3600 ;
        int minute = (almostDay % 3600) / 60;
        int second = ((almostDay % 3600) % 60) % 60;
        System.out.println(hour +":" + minute + ":" + second);



    }
}