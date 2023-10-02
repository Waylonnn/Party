import java.util.Scanner;

public class Main {
    /*Write a program that prompts the user for their party affiliation (Democrat, Republican, or Independent) and
    responds accordingly with a Donkey, Elephant, or Person  (i.e. “You get a Democratic Donkey.”).D

    Note: Create a menu so the user chooses D, R, or I and assume that any other choice will be Other.
    Use a cascaded if structure (if, else if, else), not multiple standalone if statements.
    Tests Runs:
    D, R, I, and Other as user input*/

    public static void main(String[] args) {
        String party;
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your party affiliation? (D, R, or I): ");
        party = scan.nextLine().toUpperCase();
        if(party.equals("D")){
            System.out.println("You get a Democratic Donkey!");
        } else if(party.equals("R")){
            System.out.println("You get a Republican Elephant!");
        } else if(party.equals("I")){
            System.out.println("You get a Independent Person!");
        } else{
            System.out.println("Error: Invalid Party.");
        }
    }
}