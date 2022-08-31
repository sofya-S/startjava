public class IfElseStatementTheme {
  public static void main(String[] args) {
    System.out.println("\n1. Translation from pseudocode to Java");
    int age = 21;
    if(age > 20) {
     System.out.println("Adult");
     } else if(age < 20) {
        System.out.println("Minor");
        };
    boolean isMale = false;
    if(isMale == false) {
           System.out.println("Female");
        } else if(isMale == true) {
           System.out.println("Male");
        };
    double height = 1.81;
    if(height < 1.80) {
     System.out.println("Short");
     } else if(height > 1.80) {
      System.out.println("Tall");
        };
    String someName = "Maria";        
    if(someName.charAt(0) == 'M') {
     System.out.println("Hi, Maria!");
     } else if(someName.charAt(0) ==  'I') {
           System.out.println("who`s there?!");
        };

    System.out.println("\n2. Min&max numbers search");
    int x = 10;
    int y = -11;
    if(x > y) {
     System.out.println(x + " is bigger than " + y);
     } else if(x < y) {
      System.out.println(y + " is bigger than " + x);
      } else {
         System.out.println(x + " equals " + x);
      };

    System.out.println("\n3. Defining a number");
    int someNum = 11;
    boolean isEven = someNum % 2 == 0;   
    if(someNum > 0) {
      if(isEven == true) {
        System.out.println(someNum + " is a positive even number");
      } else {
        System.out.println(someNum + " is a positive odd number");
      }} else if(someNum < 0) {
      if(isEven == true) {
        System.out.println(someNum + " is a negative even number");
      } else {
        System.out.println(someNum + " is a negative odd number");
        }} else {
         System.out.println(someNum + " is awesome");
      };

    System.out.println("\n4. Finding same digits in a number");
    int a = 761;
    int a1 = a / 100;
    int a2 = a / 10 % 10;
    int a3 = a % 100 % 10;
    int b = 961;
    int b1 = b / 100;
    int b2 = b / 10 % 10;
    int b3 = b % 100 % 10;
    System.out.println("Digits of first number are " + a1 + ", " + a2 + " and " + a3 + 
            "; digits of second number are " + b1 + ", " + b2 + " and " + b3);
    if(a1 == b1) {
     System.out.println("Matching hundreds are " + a1 + " and " + b1);
     } else {
        System.out.println("No matches in hundreds");
      };
    if(a2 == b2) {
      System.out.println("Matching tens are " + a2 + " and " + b2);
        } else {
        System.out.println("No matches in tens");
        };
    if(a3 == b3) {
       System.out.println("Matching ones are " + a3 + " and " + b3);
        } else {
           System.out.println("No matches in ones");
      };

    System.out.println("\n5. Defining a letter, number or sybol by it`s code");
    char xXx = '\u0057';             
    if((int)xXx < 48) {
      System.out.println(xXx + " is neither a letter, nor a number");
     } else if((int)xXx < 65) {
        System.out.println(xXx + " is a number");
      } else if((int)xXx < 97) {
      System.out.println(xXx + " is an uppercase letter");
      } else {
      System.out.println(xXx + " is a lowercase letter");
      };

    System.out.println("\n6.Finding accrued interest by deposit amount");
    int deposit = 101000;
    int interest;
    if(deposit > 300000) {
      interest = (deposit * 10) / 100;
        } else if(deposit > 100000) {
         interest = (deposit * 7) / 100;
        } else {
         interest = (deposit * 5) / 100;
        };
      System.out.println("Deposit equals " + deposit + ", accrued interest equals " + interest);

    System.out.println("\n7.Finding grades for subjects");
    int histPercent = 59;
    int compSciPercent = 91;
    int meanPercent = (histPercent + compSciPercent)/2;
    int histGrade;
    if(histPercent > 91) {
      histGrade = 6;
      } else if(histPercent > 73) {
         histGrade = 4;
      } else if(histPercent > 60) {
         histGrade = 3;
      } else {
         histGrade = 2;
      };
      int compSciGrade;
      if(meanPercent > 91) {
         compSciGrade = 6;
      } else if(meanPercent > 73) {
         compSciGrade = 4;
      } else if(meanPercent > 60) {
         compSciGrade = 3;
      } else {
         compSciGrade = 2;
      };
    int meanGrade = (histGrade + compSciGrade)/2;
    System.out.println("History grade is " + histGrade);
    System.out.println("Computer Science grade is " + compSciGrade);
    System.out.println("Mean grade equals " + meanGrade);
    System.out.println("Mean percent equals " + meanPercent +"%");

    System.out.println("\n8.Profit calculation");
    int monthlyRent = 5000;
    int monthlyPrimeCost = 9000;
    int monthlyMeanIncome = 13000;
    int yearlyProfit = (monthlyMeanIncome - monthlyPrimeCost - monthlyRent)*12;
    if(yearlyProfit > 0) {
      System.out.println("Yearly profit equals + " + yearlyProfit +" rubles");
      } else {
         System.out.println("Yearly profit equals " + yearlyProfit +" rubles");
      };

    System.out.println("\n9.Dollar bill count");
    int withdraval = 567;
    int tenDollarBills = 5;
    int requiredHundreds = withdraval / 100;
    int requiredTens = withdraval / 10 % 10;
    int requiredOnes = withdraval % 100 % 10;
    int shortage = requiredTens - tenDollarBills;
    int recalculatedWithdraval = (requiredHundreds *100) +(requiredTens *10) + requiredOnes;
    System.out.println(requiredHundreds +" hundreds, " + requiredTens +" tens and " + requiredOnes
            + " ones are required for withdraval of" + recalculatedWithdraval + " dollars");
    if(requiredTens > tenDollarBills) {
      System.out.println("Not enough ten-dollar bills, gotta use additional " + shortage*10 + " one-dollar bills");
      } else {
         System.out.println("Sufficial amount of bills of all denominations for withdraval");
      };
    }
}