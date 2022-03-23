package week1;

public class Day3 {
    public static void main(String[] args) {

//Welcome to Java!
/*
Java is a high level, modern programming language designed in the early 1990s by
Sun Microsystems, and currently owned by Oracle.

Java is Platform Independent, which means that you only need to write the program once
to be able to run it on a number of different platforms! Java is portable, robust,
and dynamic, with the ability to fit the needs of virtually any type of application.

Java guarantees that you'll be able to Write Once, Run Anywhere.

More than 3 billion devices run Java.
Java is used to develop apps for Google's Android OS, various Desktop Applications, such
as media players, antivirus programs, Web Applications, Enterprise Applications (i.e. banking),
and many more!
*/

//Comments
/*
The purpose of including comments in your code is to explain what the code is doing.
Java supports both single and multi-line comments. All characters that appear within a
comment are ignored by the Java compiler.

A single-line comment starts with two forward slashes and continues until it reaches the end
of the line.
For example:he purpose of including comments in your code is to explain what the code is doing.
Java supports both single and multi-line comments. All characters that appear within a
comment are ignored by the Java compiler.

A single-line comment starts with two forward slashes and continues until it reaches the end
of the line.
For example:


// This is a single line comment
x = 5; // This is a single-line comment

Adding comments as you write code is a good practice, because they provide clarification and
understanding when you need to refer back to it, as well as for others who might need to read it.

Multi-Line Comments
Java also supports comments that span multiple lines. You start this type of comment with a
forward slash followed by an asterisk, and end it with an asterisk followed by a forward slash.
*/

//Variables
/*
Store data for processing. A variable is given a name (or identifier), such as area,
age, height, and the like. The name uniquely identifies each variable, assigning a value to
the variable and retrieving the value stored.

Variables have types.
- int: for integers
- double: for floating point or real numbers with optional decimal points and fractional parts
- String: for texts such as "Hello" or "Good Morning!". Text strings are enclosed within double
  quotes.

You can declare a variable of a type and assign it a value.

Example:
String name = "David";

This creates a variable called name of type String, and assigns it the value "David".

It is important to note that a variable is associated with a type with a type, and is only
capable of storing values of that particular type. For example: an int variable can store
integer value, but cannot store double values or texts like "Hello".

The char stands for character and hold a single character.

Another type is the Boolean type, which has only two possible values: true and false.
This data type is used for simple flags that track true/false conditions.
*/
        //Variables
        int age = 4;
        double score = 99.9;
        String word = "hello";
        char group = 'a';
        boolean correct = true;

        //String concat
        String one = "Hello";
        String two = " World!";
        System.out.println(one.concat(two));
        System.out.println(one + two);

        //String interpolation
        // "%sello" "h"
        // => hello

        //System.out.printf("%s world!\n", one);
        String temp = String.format("%s world!", one);
        //System.out.println(temp);

       //Everyone please work on the Section 1 problems. You can watch the videos
       //that are tagged to the GUI for section 1 and you can also ping me if you
       //have any questions on a problem.
    }
}
