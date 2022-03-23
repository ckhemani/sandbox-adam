package week3;

//Tackle Box Applicaiton
//Use a Set and Map

import java.security.KeyStore;
import java.util.*;

public class Day4 {
   private static Scanner scanner = new Scanner(System.in);
   private static Set<String> tackleBox = new HashSet<>();
   private static Map<Integer, String> fishingDestination = new HashMap<>();
   private static int key = 1;

   public static void main(String[] args) {
      System.out.println(intro());




      while (true) {
         System.out.println(gameMenu());
         int input = scanner.nextInt();
         switch (input) {
            case 1:
               tackleBox();
               break;
            case 2:
               addFishingDestination();
               break;
            case 3:
               System.out.println("\nThank you for playing!\n");
               System.exit(0);
            default:
               break;
         }
      }
   }

   //In the destination method you will be able to add a fishing destination.
   public static void addFishingDestination() {
      System.out.println("Please add you destination: ");
      scanner.nextLine();
      String destination = scanner.nextLine();
      fishingDestination.put(key, destination);
      key++;
      System.out.println("\nYour Destinations are: ");

//      for(type variableName: collenction) {
//
//      }

      for(Map.Entry<Integer, String> myMap: fishingDestination.entrySet()) {
         System.out.println("Key: " + myMap.getKey() + " Destination: " + myMap.getValue());
      }

   }

   //The tackle box menu will let you review your inventory.
   public static void tackleBoxMenu() {
      System.out.println("\nReview Inventory: \n" +
                         "1: Inventory \n" +
                         "2: Exit: ");
   }

   //The tackle box is where you will store you gear.
   public static void tackleBox() {
      System.out.println("What would you like to add to your tackle box?");
      String item = scanner.next();

      if(tackleBox.add(item)) {
         System.out.println("You have succesfully added " + item + " to your box.");
      } else {
         System.out.println("Item already exists");
      }

      tackleBoxMenu();
      int choice = scanner.nextInt();
      if(choice == 1) {
         System.out.println("Inventory: " + tackleBox);
      }
   }

   //The game menu.
   public static String gameMenu() {
      return "\nPlease seclet a category: \n" +
              "1. Enter the tackle Box!\n" +
              "2. Add Fishing Destination\n" +
              "3. Exit\n";
   }

   //The starting intro to the game.
   public static String intro() {
      return "\nWelcome to the fising game!";
   }


}
