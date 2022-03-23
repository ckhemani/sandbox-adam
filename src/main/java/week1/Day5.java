package week1;

//Methods Overview
/*
    A Method is a block of code that get exicuted once called.
    You can pass data, known as parameters, into a method.
    Methods are used to perform certain actions, and they are also known as functions.
    Why use methods? To reuse code: define the code once, and use it many times.

    https://www.w3schools.com/java/java_methods.asp
* */

//Parameters
/*
    Information can be passed to methods as parameter. Parameters act as variables inside the method.
    Parameters are specified after the method name, inside the parentheses.
    You can add as many parameters as you want, just separate them with a comma.
    When a parameter is passed to the method, it is called an argument.

    https://www.w3schools.com/java/java_methods.asp
* */

import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {

        int firstNumber = 1;
        int secondNumber = 2;

        //Call intro method and printing the return
        System.out.println(intro());

        //Calling the do something method
        doSomething();

        //Calling the sum method and passing the arguments firstNumber and secondNumber
        System.out.println(sum(firstNumber, secondNumber));

    }

    //TODO Method 1: Intro Method
    public static String intro() {
        String fullName = getUserName();
        return String.format(
                """
                Hello, and welcome to the game!
                My name is %s!
                I am looking forward to going home! :)
                """, fullName);
    }

    //TODO Method 2: Get User firstAndLastName
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    //TODO Method 3: Something
    public static void doSomething() {
        System.out.println("This method is doing something...");
    }

    //TODO Method 4: Sum Method
    public static int sum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
