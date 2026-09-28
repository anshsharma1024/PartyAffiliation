import java.util.Scanner;

class PartyAffiliation {
    void main()
    {
        // Declare variables
        Scanner in = new Scanner(System.in);
        String choice = "";

        // Display a menu of party choices
        System.out.println("Party Affiliation Menu");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");

        // Ask the user for their choice
        System.out.print("Enter your choice (D, R, or I): ");
        choice = in.nextLine();

        // Cascaded if: D = Donkey, R = Elephant, I = Person, anything else = Other
        if(choice.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if(choice.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant.");
        }
        else if(choice.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Person.");
        }
        else
        {
            System.out.println("You get Other.");
        }
    }
}