import java.util.Scanner;
public class rpgMain {

	public static void main(String[] args) {

		playerCharacter player = new playerCharacter(100, 10, 10, 1000);
		enemyCharacter enemy = new enemyCharacter(100,1,1,1000);
		Scanner input = new Scanner(System.in);
		
		System.out.println("RPGame: The RPG made for you!");
		System.out.println("\nYou wake up dazed and confused, not remembering anything. \nWhat is your name?");
		String name = input.nextLine();
		System.out.println("Oh, so your name is " + name + "...");
		System.out.println("What a great name!");

	}

}
