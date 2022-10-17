public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Translation from pseudocode to Java");
        int age = 21;
        if(age > 20) {
            System.out.println("Adult");
        } else if(age < 20) {
            System.out.println("Minor");
        }
        boolean isMale = true;
        if(!isMale) {
            System.out.println("Female");
        } else {
            System.out.println("Male");
        }
        double height = 1.61;
        if(height < 1.80) {
            System.out.println("Short");
        } else if(height > 1.80) {
            System.out.println("Tall");
        }
        String someName = "Igor";
        char letter = someName.charAt(0);        
        if(letter == 'M') {
            System.out.println("Hi, Maria!");
        } else if(letter ==  'I') {
            System.out.println("Igor, pull the switch!");
        } else {
            System.out.println("who`s there?!");
        }  

        System.out.println("\n2. Min&max numbers search");
        int x = 10;
        int y = -11;
        if(x > y) {
            System.out.println(x + " is bigger than " + y);
        } else if(x < y) {
            System.out.println(y + " is bigger than " + x);
        } else {
            System.out.println(x + " equals " + x);
        }

        System.out.println("\n3. Defining a number");
        int someNum = -13;
        if(someNum == 0){
            System.out.println(someNum + " is awesome");            
        } else {
            if(someNum > 0) {
                System.out.print(someNum + " is a positive ");
            } else {
                System.out.print(someNum + " is a negative ");
            }
            if(someNum % 2 == 0){
                System.out.print("even number");
            } else {
                System.out.println("odd number");
            }
        }


        System.out.println("\n4. Finding same digits in a number");
        int firstNum = 761;
        int firstHundreds = firstNum / 100;
        int firstTens = firstNum / 10 % 10;
        int firstOnes = firstNum % 10;
        int secondNum = 666;
        int secondHundreds = secondNum / 100;
        int secondTens = secondNum / 10 % 10;
        int secondOnes = secondNum % 10;
        System.out.println("Digits of first number are " + firstHundreds + ", " + firstTens + " and " + firstOnes
                + "; digits of second number are " + secondHundreds + ", " + secondTens + " and " + secondOnes);
        if(firstHundreds == secondHundreds) {
            System.out.println("Matching hundreds are " + firstHundreds + " and " + secondHundreds);
        } else {
            System.out.println("No matches in hundreds");
        }
        if(firstTens == secondTens) {
            System.out.println("Matching tens are " + firstTens + " and " + secondTens);
        } else {
            System.out.println("No matches in tens");
        }
        if(firstOnes == secondOnes) {
            System.out.println("Matching ones are " + firstOnes + " and " + secondOnes);
        } else {
            System.out.println("No matches in ones");
        }

        System.out.println("\n5. Defining a letter, number or symbol by it`s code");
        char someChar = '\u0057';             
        if(someChar >= 'a' && someChar <= 'z') {
            System.out.println(someChar + " lowercase letter");
        } else if(someChar >= 'A' && someChar <= 'Z') {
            System.out.println(someChar + " is an uppercase letter");
        } else if(someChar >= '0' && someChar <= '9') {
            System.out.println(someChar + " is a number");
        } else {
            System.out.println(someChar + " is neither a letter, nor a number");
        }

        System.out.println("\n6.Finding accrued interest by deposit amount");
        int deposit = 101000;
        int interest;
        if(deposit > 300000) {
            interest = (deposit * 10) / 100;
        } else if(deposit > 100000) {
            interest = (deposit * 7) / 100;
        } else {
            interest = (deposit * 5) / 100;
        }
        System.out.println("Deposit equals " + deposit + ", accrued interest equals " + interest
                 + ", total sum equals " + (deposit + interest));

        System.out.println("\n7.Finding grades for subjects");
        int histPercent = 59;
        int csPercent = 91;
        int histGrade;
        if(histPercent > 91) {
            histGrade = 5;
        } else if(histPercent > 73) {
            histGrade = 4;
        } else if(histPercent > 60) {
            histGrade = 3;
        } else {
            histGrade = 2;
        }
        int compSciGrade;
        if(csPercent > 91) {
            compSciGrade = 5;
        } else if(csPercent > 73) {
            compSciGrade = 4;
        } else if(csPercent > 60) {
            compSciGrade = 3;
        } else {
            compSciGrade = 2;
        }
        int meanGrade = (histGrade + compSciGrade) / 2;
        int meanPercent = (histPercent + csPercent) / 2;
        System.out.println("History grade is " + histGrade);
        System.out.println("Computer Science grade is " + compSciGrade);
        System.out.println("Mean grade equals " + meanGrade);
        System.out.println("Mean percent equals " + meanPercent +"%");

        System.out.println("\n8.Profit calculation");
        int monthlyRent = 5000;
        int monthlyPrimeCost = 9000;
        int monthlyMeanIncome = 13000;
        int yearlyProfit = (monthlyMeanIncome - monthlyPrimeCost - monthlyRent) * 12;
        if(yearlyProfit > 0) {
            System.out.println("Yearly profit equals + " + yearlyProfit +" rubles");
        } else {
            System.out.println("Yearly profit equals " + yearlyProfit +" rubles");
        }

        System.out.println("\n9.Dollar bill count");
        int hundredDollarBills = 10;
        int tenDollarBills = 5;
        int oneDollarBills = 50;
        System.out.println("There are " + hundredDollarBills + " hundred, " + tenDollarBills + " ten and "
                + oneDollarBills + " one-dollar bills");
        int withdraval = 567;             
        int requiredHundreds = withdraval / 100;
        int requiredTens = withdraval / 10 % 10;
        int requiredOnes = withdraval % 100 % 10;
        int recalculatedWithdraval = (requiredHundreds * 100) +(requiredTens * 10) + requiredOnes;
        int shortage = requiredTens - tenDollarBills;
        if(requiredTens > tenDollarBills) {
            System.out.print("Not enough ten-dollar bills, gotta use additional " + shortage * 10
                + " one-dollar bills to make required for withdraval of ");
        } else {
            System.out.print("Sufficial amount of bills of all denominations to make required for withdraval of ");
        }
        System.out.println(recalculatedWithdraval + " dollars");
    }
}