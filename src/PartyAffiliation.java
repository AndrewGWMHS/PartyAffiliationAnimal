import java.util.Scanner;
public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String party;
        System.out.println("What is your party affiliation? Enter in the first letter of your party, Ex: [D(emocratic),R(epublican),I(ndependant)]");
        party = scan.nextLine();
        if (party.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey");
        }
        else if (party.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant");
        }
        else if (party.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person");
        }
        else {
            System.out.println("Invalid Party");
            System.exit(0);
        }
    }
}