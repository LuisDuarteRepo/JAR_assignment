//Class: Patron
//Represents a library patron that has an ID, a first and last name, a billing address and an overdue books fee amount

import java.util.Scanner;

public class Patron {
    //Attributes
    public int id;
    public String firstName;
    public String lastName;
    public String billingAddress;
    public double amountDue;

    //Scanner class to read input from users
    Scanner input = new Scanner(System.in);

    //Method to add patrons
    public Patron() {

        System.out.print("Enter ID: ");
        this.id = input.nextInt();
        input.nextLine();
        System.out.print("Enter first name: ");
        this.firstName = input.nextLine();
        System.out.print("Enter last name: ");
        this.lastName = input.nextLine();
        System.out.print("Enter billing address: ");
        this.billingAddress = input.nextLine();
        System.out.print("Enter amount due: ");
        this.amountDue = input.nextDouble();

    }


}//end of public class Patron
