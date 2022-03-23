package week3;

import java.util.ArrayList;
import java.util.LinkedList;


public class Day2 {
   //Tuesday Array / Collections / List / 4 pm  go over a couple of GUI problems
   public static void main(String[] args) {

      //Declaring a 1D array
      int[] month_days = new int[12];
      month_days[0] = 31;
      month_days[1] = 28;
      month_days[2] = 31;
      month_days[3] = 30;
      month_days[4] = 31;
      month_days[5] = 30;
      month_days[6] = 31;
      month_days[7] = 31;
      month_days[8] = 30;
      month_days[9] = 31;
      month_days[10] = 30;
      month_days[11] = 31;

      System.out.println("July has " + month_days[6] + " days in it.");

      //2D Arrays
      System.out.println("\nTwo Dimentional Array\n");

      int rows = 4;
      int columns = 5;

      int[][] intArray = new int[rows][columns];

      String[][] myArray = new String[rows][columns];

      //Filling the 2D array
      for(int r = 0; r < rows; r++) {
         for(int c = 0; c < columns; c++) {
            myArray[r][c] = " 0";
            intArray[r][c] = 0;
         }
      }

      myArray[0][0] = ":)";
      myArray[3][4] = " 1";

      System.out.println("\nPrinting the String[][]");

      //Printing the 2D array
      for(int i = 0; i < rows; i++) {
         //First iterationg it will print out the first row
         for(int j = 0; j < columns; j++) {
            System.out.print(myArray[i][j]);
         }
         //This allows for a line break and then it will print the next row.
         System.out.println();
      }

      System.out.println("\nPrinting the int[][]");

      //Printing the 2D array
      for(int i = 0; i < rows; i++) {
         //First iterationg it will print out the first row
         for(int j = 0; j < columns; j++) {
            System.out.print(intArray[i][j]);
         }
         //This allows for a line break and then it will print the next row.
         System.out.println();
      }

      //ArryList
      System.out.println("\nArray List");
      ArrayList<String> studentNamesArrayList = new ArrayList<>();
      studentNamesArrayList.add("Adam");
      studentNamesArrayList.add("Lindsay");
      studentNamesArrayList.add("Ellie");
      studentNamesArrayList.add("Laila");
      studentNamesArrayList.add("Bear");

      System.out.println("Student Names: " + studentNamesArrayList);

      //Linked List
      System.out.println("\nLinked List");
      LinkedList<String> employeeRegistryLinkedList = new LinkedList<>();

      employeeRegistryLinkedList.add("Employee 1");
      employeeRegistryLinkedList.add("Employee 2");
      employeeRegistryLinkedList.add("Employee 3");
      employeeRegistryLinkedList.add("Employee 4");

      System.out.println("Employee Names: " + employeeRegistryLinkedList);

   }
}



















