package edu.neu.mgen.Assigsment;

import java.util.ArrayList;

public class Assistant20231021 {
/*Lab 1 part 1 - Array
Initiate two integer arrays, x, and y, each containing 5 numbers.
Create another array z of length 5, the elements of which are the max of the respective numbers of the two arrays x and y.
Organize a nice-looking output to the terminal that looks like the following:
Array x = { array x values here separated by coma }
Array y = { array y values here separated by coma }
Array z = x + y = { array z values here separated by coma }*/
  public static void main(String[] args) {
    
    
          int[] x = {0,1,2,3,4};
          int[] y = {5,6, 7, 8, 9};
          int[] z = new int[5];
  
          
          for (int i = 0; i < 5; i++) {
              z[i] = Math.max(x[i], y[i]);
          }
           
          System.out.print("Array x = {");
          for (int i = 0; i < 5; i++) {
              System.out.print(x[i]);
              if (i < 4) {
                  System.out.print(", ");
              }
          }
          System.out.println("}");
            System.out.print("Array y = {");
          for (int i = 0; i < 5; i++) {
              System.out.print(y[i]);
              if (i < 4) {
                  System.out.print(", ");
              }
          }
          System.out.println("}");
  
          System.out.print("Array z = x + y = {");
          for (int i = 0; i < 5; i++) {
              System.out.print(z[i]);
              if (i < 4) {
                  System.out.print(", ");
              }
          }
          System.out.println("}");





         /*  Lab 1 part 2 - ArrayList
      Initiate an ArrayList that contain 5 names
      Switch the first and last letters in each name in the ArrayList. Do not forget that each name begins with a capital letter, but the other letters are lowercase. The names with switched letters should follow the same rule as there are new names.
      Organize a nice-looking output to the terminal that looks like the following:
      Names = { list of names here separated by coma }
      Names (switched) = { list of names with switched first and last letters here separated by coma }*/

        ArrayList<String> names = new ArrayList<>();
        names.add("Islene");
        names.add("Mike");
        names.add("Lisa");
        names.add("David");
        names.add("Mason");

        
        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            char firstLetter = Character.toUpperCase(name.charAt(0));
            char lastLetter = Character.toLowerCase(name.charAt(name.length() - 1));
            String switchedName = lastLetter + name.substring(1, name.length() - 1) + firstLetter;
            switchedNames.add(switchedName);
        }

        // Print the original and switched names
        System.out.print("Names = {");
        for (String name : names) {
            System.out.print(name);
            System.out.print(", ");
        }
        System.out.println("}");

        System.out.print("Names (switched) = {");
        for (String name : switchedNames) {
            System.out.print(name);
            System.out.print(", ");
        }
        System.out.println("}");
    }
}







    






   
