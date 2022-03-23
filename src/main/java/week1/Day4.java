package week1;

import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        //User Input
/*
Getting User Input
    While Java provides many methods for getting user input, the Scanner object is
    the most common, and perhaps the easiest to implement. Import the Scanner class to use the
    Scanner object, as seen here:

    import java.util.Scanner;

    In order to use the Scanner class, create an instance of the class by using the following
    syntax:

    Scanner myScanner = new Scanner(System.in);

    You can now read in different kinds of input data that the user enters.
    Here are some methods that are available through the Scanner class:
    Read a byte - nextByte()
    Read a short - nextShort()
    Read an int - nextInt()
    Read a long - nextLong()
    Read a float - nextFloat()
    Read a double - nextDouble()
    Read a boolean - nextBoolean()
    Read a complete line - nextLine()
    Read a word - next()
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String userName = scanner.nextLine();
        System.out.println("Please enter 1");
        int userAge = scanner.nextInt();

        System.out.printf("Thank you your first name is %s and your age is %s\n", userName, userAge);

//Primitive Operators
/*
Math Operators
    Java provides a rich set of operators to use in manipulating variables. A value used on
    either side of an operator is called an operand.

    For example, in the expression below, the numbers 6 and 3 are operands of the plus operator:

    int x = 6+3;

    Arithmetic operators:
        + addition
        - subtraction
        * multiplication
        / division
        % modulo

Addition
    The + operator adds together two values, such as two constants, a constant and a variable,
    or a variable and a variable.

Subtraction
    The - operator subtracts one value from another.

Multiplication
    The * operator multiplies two values.

Division
    The / operator divides one value by another.

Modulo
    The modulo (or remainder) math operation performs an integer division of one value
    by another, and returns the remainder of that division. The operator for the modulo
    operation is the percentage (%) character.
**/
        //Addition
        int sum1 = 50 + 10;
        int sum2 = sum1 + 66;
        int sum3 = sum1 + sum2;

        //Subtraction
        int sum4 = 1000 - 10;
        int sum5 = sum4 - 5;
        int sum6 = sum4 - sum5;

        //Multiplication
        int sum7 = 1000 * 2;
        int sum8 = sum7 * 10;
        int sum9 = sum7 * sum8;

        //Division
        int sum10 = 1000 / 5;
        int sum11 = sum10 / 2;
        int sum12 = sum10 / sum11;
//Operators
/*
Increment Operators
An increment or decrement operator provides a more convenient and compact way to increase
or decrease the value of a variable by one.

The increment operator -- is used to increase the value of a variable by one.
The decrement operator -- is used to decrease the value of a variable by one.

Prefix and Postfix
Two forms, prefix and postfix, may be used with both the increment and decrement operators.
With prefix form, the operator appears before the operand, while in postfix form, the operator
appears after the operand. Below is an explanation of how the two forms work:
Prefix: Increments the variable's value and uses the new value in the expression.


Assignment Operators
You are already familiar with the assignment operator =, which assigns a value to a variable.

int value = 5;

This assigned the value 5 to a variable called value of type int.

Java provides a number of assignment operators to make it easier to write code.
Addition and assignment (+-):

public class Program {
	public static void main(String[]args) {
		int num1 = 4;
		int num2 = 8;
		num2 += num1;

		System.out.println(num2);
	}
}
Output = 12

This will take the value of num1 and num2 and add them together and save the results in num2
while keeping num1 the same.

Subtraction and assignment (-=):

public class Program {
	public static void main(String[]args) {
		int num1 = 4;
		int num2 = 8;
		num2 -= num1;

		System.out.println(num2);
	}
}
Output = 4

This will do the same thing as the addition and assignment, but it will subtract instead
which will leave us with num2 = 4 and then num1 will still be 4.

*/
        System.out.println("\nOperators: ");
        //Increment x=x+1; can be simplified to ++x;
        int incrementTest = 5;
        ++incrementTest;
        System.out.println("Increment test: " + incrementTest);

        //Decrement
        int decrementTest = 5;
        --decrementTest;
        System.out.println("Decrement test: " + decrementTest);

        //Prefix
        int num1 = 34;
        int num2 = ++num1;
        System.out.println("Prefix: " + num2);

        //Postfix
        int x1 = 34;
        int y1 = x1++;
        System.out.println("Postfix: " + y1);

//Decision-Making
/*
Conditional statements are used to perform different actions based on different conditions.
The if statement is one of the most frequently used conditional statements.
If the if statement's condition expression evaluates to true, the block of code inside the
if statement is executed. If the expression is found to be false, the first set of code
after the end of the if statement (after the closing curly brace) is executed.
Syntax:
if (condition) {
   //Executes when the condition is true
}
In JAVA Any of the following comparison operators may be used to form the condition:
< less than
> greater than
!= not equal to
== equal to
<= less than or equal to
>= greater than or equal to

An if statement can be followed by an optional else statement, which executes
when the condition evaluates to false.
Syntax:
if (condition) {
    //Expression when condition is true
} else {
    //Expression when condition is false
}

Instead of using nested if-else statements, you can use the else if statement
to check multiple conditions.
Syntax:
if (condition) {
    //Expression when condition is true
} else if (condition) {
    //Expression when condition is true
} else {
    //Expression when condition is false
}
 */
        System.out.println("\nIf Statements");
        int myAge = 10;

        //if statement
        if(myAge > 10) {
            System.out.println("Standard if statement: " + myAge);
        }
        //if else statement
        if(10 < myAge) {
            System.out.println("if else statement True branch");
        } else {
            System.out.println("if else statement False branch");
        }
        //else if statement
        if(1 == 100) {
            System.out.println("else if statement True branch");
        } else if(myAge % 2 == 0) {
            System.out.println("else if statement False branch");
        } else {
            System.out.println("Try again...");
        }

//Switch Statement
/*
A switch statement tests a variable for equality against a list of values.
Each value is called a case, and the variable being switched on is checked
for each case.
Syntax:
switch (expression) {
   case value1 :
     //Statements
     break; //optional
   case value2 :
     //Statements
     break; //optional
    //You can have any number of case statements.
    default : //Optional
       //Statements
}
When the variable being switched on is equal to a case, the statements following
that case will execute until a break statement is reached. When a break statement
is reached, the switch terminates, and the flow of control jumps to the next line
after the switch statement. Not every case needs to contain a break. If no break
appears, the flow of control will fall through to subsequent cases until a break
is reached. The default case is if no other cases match.
 */
        int day = 3;
        System.out.println("\nSwitch Statement result below:");
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("I am the default");
        }

//While Loop
/*
A loop statement allows to repeatedly execute a statement or group of statements.
A while loop statement repeatedly executes a target statement as long as a given
condition is true.

Example:The while loops check for the condition x > 0. If it evaluates to true,
it executes the statements within its body. Then it checks for the statement again
and repeats.
 */
        System.out.println("\nWhile loop");
        int whileLoop = 3;
        while(whileLoop > 0) {
            System.out.println(whileLoop);
            whileLoop--;
        }

//Do While Loop
/*
A do...while loop is similar to a while loop, except that a do...while loop is
guaranteed to execute at least one time.

The condition appears at the end of the loop, so the statements in
the loop execute once before it is tested. Even with a false condition, the code will
run once.
 */
        System.out.println("\nDo While Loop");
        int doWhileLoop = 1;
        do {
            System.out.println(doWhileLoop);
            doWhileLoop++;
        } while(doWhileLoop < 5);

//For Loop
/*
Another loop structure is the for loop. A for loop allows you to efficiently
write a loop that needs to execute a specific number of times.
Syntax:
for (initialization; condition; increment/decrement) {
   statement(s)
}
Initialization: Expression executes only once during the beginning of loop
Condition: Is evaluated each time the loop iterates. The loop executes the
           statement repeatedly, until this condition returns false.
Increment/Decrement: Executes after each iteration of the loop.
*/
        System.out.println("\nFor Loop");
        for(int x = 1; x <=5; x++) {
            System.out.println(x);
        }

//Dragon Cave Project
//Guess The Number Project

    }
}
