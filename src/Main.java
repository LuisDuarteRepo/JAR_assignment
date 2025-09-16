//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//main method where all classes will be instantiated and ran

import java.util.*;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!\n");

        Patron Luis = new Patron();

        Scanner myObj = new Scanner(System.in); //Create a Scanner object
        System.out.println("Enter patron ID (Seven digits):");
        System.out.println("Enter patron first name:");
        System.out.println("Enter patron last name:");
        System.out.println("Enter patron address (Street address, city, state, zip code):");
        System.out.println("Enter patron overdue bill:");

        //attribute for loops and checking
        int count = 0;

        //input
        String inputID = myObj.nextLine();
        String inputFirstName = myObj.nextLine();
        String inputLastName = myObj.nextLine();
        String inputAddress = myObj.nextLine();
        double inputOverdueBill = myObj.nextDouble();
        String inputOverdueBillString = Double.toString(inputOverdueBill); //converts the double to a String

        //figure out a way to show all the error messages when there are issues with all the input cases

        //user input check
        //loop checks if the patron ID has more than 7 digits, or has any special characters.
        for(int i = 0; i < inputID.length(); i++) {
            if (inputID.length() < 7) {
                inputID = inputID.substring(0, 6);
            } else if (inputID.length() > 7) {
                System.out.print("The patron's ID cannot be longer than 7 digits!\n ");
                return;
            } else if (!Character.isLetterOrDigit(inputID.charAt(i))) {
                System.out.print("The patron's ID cannot have special characters or letters!\n ");
                return;
            }
            count++;
        }// end of for(int i = 0; i < inputID.length(); i++)
        //loop checks if the patron's first name has digits, or any special characters.
        for(int i = 0; i < inputFirstName.length(); i++) {
            if(!Character.isLetter(inputFirstName.charAt(i))) {
                System.out.print("The patron's first name cannot have special characters or numbers!\n ");
                return;
            }
        }// end of for(int i = 0; i < inputFirstName.length(); i++)
        //loop checks if the patron's last name has digits, or any special characters.
        for(int i = 0; i < inputLastName.length(); i++) {
            if(!Character.isLetter(inputLastName.charAt(i))) {
                System.out.print("The patron's last name cannot have special characters or numbers!\n ");
                return;
            }
        }//end of for(int i = 0; i < inputFirstName.length(); i++)

        //loop checks if the patron's overdue bill is longer than five digits.
        //for(int i = 0; i < inputOverdueBillString.length(); i++) {
        //    if (inputOverdueBillString.length() <= 5) {
        //        inputOverdueBillString = inputOverdueBillString.substring(0, 4);
        //    } else if (inputOverdueBillString.length() >= 5) {
        //        System.out.print("The patron's overdue bill cannot be longer than five digits!\n ");
        //        return;
        //    }
        //    Double.parseDouble(inputOverdueBillString); //converts the String to a double
        //} // end of for(int i = 0; i < inputOverdueBillString.length(); i++)\

        //User output print methods
        System.out.print("The patron's information is " + inputID + " - "); //user ID is working as intended
        System.out.print(inputFirstName + " ");
        System.out.print(inputLastName + " - ");
        System.out.print(inputAddress + " - ");
        System.out.println(inputOverdueBillString);
        Luis.printPatronDetails();

    }
}