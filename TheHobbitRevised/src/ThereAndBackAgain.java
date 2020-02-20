//Leo Yang
//Inheritance practice code
//started 2/5/2020
import java.util.ArrayList;

public class ThereAndBackAgain 
{

	public static void main(String[] args) 
	{
		
		Hobbit frodo = new Hobbit("Frodo");
		Hobbit sam = new Hobbit("Sam");
		Dwarf gimli = new Dwarf("Gimli");
		
		// Create a traveling party called party1 by creating an array of Travelers 
		// and filling it with frodo, sam, and gimli
		Traveler[] party1 = {frodo, sam, gimli};
		
		// Then, use a loop to make all travelers go a distance of 50 miles  
		for(Traveler person: party1) {
			person.travel(50);
			System.out.println(person.getName()+" has traveled "+ person.getDistanceTraveled()+ " miles.");
		}
			
		// Then, for each Traveler in the travelingParty, print their name and how far they've
		//    traveled in miles.  (In the next piece, you'll do this in methods, but 
		//    for a first pass, just do it in main and print to the console.)
		// Expected output:  Frodo has traveled 50 miles.
		//                   Sam has traveled 50 miles.
		//                   Gimli has traveled 50 miles.
		
		
		
		
		
		
		System.out.println();
		
		System.out.println("\n\n\nPART 2: \n");

		String[] dwarfNames = {"Fili", "Kili", "Dori", "Ori", "Nori", "Balin", "Dwalin",
		"Oin", "Gloin", "Bifur", "Bofur", "Bombur", "Thorin"};

		// Make a new ArrayList to hold a 2nd party of Travelers called party2:
		// Make a new Hobbit called "Bilbo" and add him to party2
		
		Hobbit Bilbo = new Hobbit("Bilbo");
		Wizard Gandalf = new Wizard("Gandalf", "gray");

		ArrayList<Traveler> party2 = new ArrayList<Traveler>();
			party2.add(Bilbo);
			party2.add(Gandalf);
			
	
		
		// Make a new Wizard called "Gandalf" and add him to party2.


		//write createParty
		// Call the createParty method and pass it party2 and the dwarfNames array.
	CreateParty(party2, dwarfNames);
		// create party should add all the new dwarves to party2,

		//Write allTravel
		// Finally, call the allTravel method passing it party2 and 100 (representing
		// the 100 miles that party2 has traveled together.

		//Make sure your code prints out the name and distances party2 has traveled.
	for(Traveler dude : party2) {
		System.out.println(dude.getName() + " has traveled " + dude.getDistanceTraveled());
	}
	}
	public static void CreateParty(ArrayList<Traveler> party, String[] names) {
		for(String dude: names) {
			Traveler guy = new Traveler(dude);
			party.add(guy);
		}
		}
	
	public static void allTravel(ArrayList<Traveler> party, int miles) {
		for(Traveler dude : party) {
			dude.travel(miles);
		}
	}
}
