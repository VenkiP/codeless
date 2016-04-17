import java.util.Scanner;

public class HackDFW_Codeless {
	
	public static void main(String[] args) {
		System.out.print("Welcome to the Codeless Adventure... \nShall we begin??"
				+ "\nYes or No");
		
		Scanner keyboard = new Scanner(System.in);
		String startThis = new String();
		//String commandNext = new String();
		startThis = keyboard.next();
		
		Location enterance = new Location("HackDFW Enterance", "Enterance to HackDFW Event: Good Luck");
		enterance.addExit(new Exit("enterHackDFW","Learn You Aint Shit"));
		
		Location youAintShit = new Location("You Aint Shit","You've figured out that you really have no clue how to code. "
				+ "However, you aren't alone: Manu is basically in the same baot. "
				+ "You have an idea to use the worlds most complicated lightbulb, but it doesn't go your way at first... "
				+ "What do you do?");
		youAintShit.addExit(new Exit("Brute Force This Shit", "That Didn't Work"));
		
		if (startThis.compareTo("Yes") == 0)
		{
			Location current = enterance;
			
			System.out.println(current.showLocation());
			current.showExits();
			
		}
		else
		{
			System.out.println("your loss fam");
		}
	}

}
