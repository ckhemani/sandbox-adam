package week2;

//Git
/*
Git is a free and opensource distributed version control system.
Git is software that is used for tracking changes in your source
code. This code is normally found in the src folder. Git can track
your src folder and it can also track your entire project. Git is
simple to use but can become complicated very quickly.

git: https://git-scm.com/
* */

//GitKraken
/*
GitKraken is a intuitive tool that simplifies using git commands. It also
gives you a nice ueser interface to work with.

GitKraken: https://www.gitkraken.com/
* */

//GitHub
/*
GitHub is an online repository system for you to be able to store your code,
files, images, and much more. Using an online repository like GitHub allows
you the developer to be able to build, ship, maintain, and collaborate with
other developers.

GitHub: https://github.com/
* */

//Exceptions
/*
An exception is a problem that occurs during program execution.

Types of Exceptions
Checked exceptions happen at compile time.
Unchecked Exceptions happen at runtime.

Handling Exceptions
Exception handling is a powerful mechanism that handles runtime errors
to maintain normal application flow.

An exception can occur for many different reasons. Some examples:
- A user has entered invalid data.
- A file that needs to be opened cannot be found.
- A network connection has been lost in the middle of communications.
- Insufficient memory and other issues related to physical resources.

Exceptions can be caught using a combination of the try and catch keywords.
A try/catch block is placed around the code that might generate an exception.

Syntax:
try {
//some code
} catch (Exception e) {
//some code to handle errors
}

A single try block can contain multiple catch blocks that handle different
exceptions separately.

try {
  //some code
} catch (ExceptionType1 e1) {
  //Catch block
  e1.getMessage();
} catch (ExceptionType2 e2) {
  //Catch block
  e2.getMessage();
} catch (ExceptionType3 e3) {
  //Catch block
  e3.getMessage();
}

throw
The throw keyword allows you to manually generate exceptions from your
methods. Some of the numerous available exception types include the
IndexOutOfBoundsException, IllegalArgumentException, ArithmeticException,
and so on.

static int div(int a, int b) throws ArithmeticException {
    	if(b == 0) {
        	throw new ArithmeticException("Division by Zero");
    	} else {
        	return a / b;
    	}
	}

throws
The throws statement in the method definition defines the type of
Exception(s) the method can throw.
* */

//Play with code, work on sections, add exceptions to projects.
//If anyone is having problems with week 1 material let me know
//and we can do one on one during this time.

//What is git clone command used for?
//What is git?

import java.util.Scanner;

public class Day2 {
   public static void main(String[] args) {
      //Exception Handling
      System.out.println("Hello");

//      try{
//         int[] a = new int[2];
//         //Try to access an index that does not exist.
//         System.out.println(a[5]);
//      } catch (Exception e) {
//         System.out.println("An Error Occured");
//         e.printStackTrace();
//      }
      System.out.println("Hello");

      //The divide method will throw the ArithmeticException.
      //Change the second number to 0.
      //System.out.println(div(1, 1));

      //Calling the user age method and selecting a letter instead of a number.
      age();

      System.out.println("The program finishes...");
   }

   //Divide Method
   public static int div(int firstNum, int secondNum) throws ArithmeticException {
      if(secondNum == 0) {
         throw new ArithmeticException("Division by Zero");
      } else {
         return firstNum / secondNum;
      }
   }

   public static void age() throws ArithmeticException{
      int secondNum = 0;
      int firstNum = 2;

      try{
         int[] a = new int[2];
         System.out.println(a[5]);
         if(secondNum != 0) {
            System.out.println("In true brach");
            //throw new ArithmeticException("Wrong Input");
         } else {
            System.out.println("False branc");
            System.out.println(firstNum / secondNum);
         }
      } catch (ArithmeticException e1) {
         System.out.println("Wrong input...");
         e1.printStackTrace();
      } catch (IllegalArgumentException e2) {
         e2.printStackTrace();
      }
   }
}
