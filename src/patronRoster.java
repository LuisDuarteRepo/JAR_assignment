//Class: patronRoster
//class that will store the array for the LMS

import java.util.Scanner;

public class patronRoster {
    Patron thePatrons[] = new Patron[50];
    public static int count;

    Scanner sc = new Scanner(System.in);

    //method 1: compare the IDs
    public int compareIDObjects(Patron id1, Patron id2) {

        //if IDs match
        if (id1.id == id2.id) {
            //prints out this message
            System.out.println("This ID already exists!");
            return 0;
        }

        return 1;

    }//end of public int compareIDObjects(Patron id1, Patron id2)

    //method 2: add patrons
    public void addPatron(Patron p) {

        Patron p1 = new Patron();
        p1.id = 1;

        //checks if the patron has already been added
        for (int i = 0; i < count; i++) {

            if (compareIDObjects(p, p1) == 1) {
                System.out.println("This ID already exists!");
                return;
            }
        }//end of for (int i = 0; i < count; i++)

        if (count < 50) {
            thePatrons[count] = p;
            count++;
        } else {
            System.out.println("No more space to add more patrons!");
        }//end of if else

    }//end of public void addPatron(Patron p)

    //method 3: Search patron by ID
    public void searchByID() {
        System.out.println("Search by Patron ID");

        int id;
        System.out.println("Please enter the ID of the patron you want to search: ");
        id = sc.nextInt();

        int flag = 0;

        System.out.println("S.No\\t\\tName\\t\\tAuthor\\t\\tAvailable Qty\\t\\tTotal Qty");

        for(int i = 0; i < count; i++) {
            if(id == thePatrons[i].id) {
                System.out.print("Patron ID: " + thePatrons[i].id + " - First name: " + thePatrons[i].firstName + " - Last name: " + thePatrons[i].lastName);
                //Figure out how to get these in the array
                System.out.println(" - Patron Billing Address: " + thePatrons[i].billingAddress + " - Overdue Bill Amount: " + thePatrons[i].amountDue);
                flag++;
                return;
            }
        }//end of for(int i = 0; i < count; i++)
        if(flag == 0) {
            System.out.println("Patron ID" + id + "not found!");
        }
    }//end of public void searchByID()

    //Method 4: to display all patrons
    public void showAllPatrons() {
        System.out.println("Showing all Patrons and Relevant information");

        for(int i = 0; i < count; i++) {
            System.out.print("Patron ID: " + thePatrons[i].id + " - First name: " + thePatrons[i].firstName + " - Last name: " + thePatrons[i].lastName);
            //Figure out how to get these in the array
            System.out.println(" - Patron Billing Address: " + thePatrons[i].billingAddress + " - Overdue Bill Amount: " + thePatrons[i].amountDue);
        }//end of for(int i = 0; i < count; i++)
    }//end of public void showAllPatrons()

    //method 5:
    public void displayMenu(){

        //displaying the menu
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("1. Add Patron");
        System.out.println("2. Delete Patron");
        System.out.println("3. Show All Patrons");
        System.out.println("0. Exit LMS");
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }

    //Method 6 see if Patron's ID exists
    public int IDavailable(int id) {

        for(int i = 0; i < count; i++) {
            if(id == thePatrons[i].id) {
                System.out.println("The Patron's ID exists.");
                return i;
            }
        }
        System.out.println("Patron does not exist.");
        return -1;
    }

    //Method 7 Delete Patron using ID
    public Patron deletePatron(int id) {
        System.out.println("Enter Patron ID you wish to delete: ");
        id = sc.nextInt();

        int patronIndex = IDavailable(id);

        if(patronIndex != -1){
            thePatrons[patronIndex] = null;
            return thePatrons[patronIndex];
        }
        return null;
    }

}

