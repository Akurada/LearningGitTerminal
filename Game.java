import java.io.Console;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.FileNotFoundException;

class Game {
	public static void main(String[] args) {
		System.out.println("Guess the capital city: ");
		System.out.println("Type Exit to stop the game");
		Console console = System.console();
		int total = 0;
		int correct = 0;
		
		Random rand = new Random();

		try (BufferedReader br = new BufferedReader(new FileReader("capitals2.csv"));) {
		
			String line;
			while ((line = br.readLine()) != null) {
				String[] cols = line.split(",");
				String country = cols[0];
				String capital = cols[1];
				String answer = console.readLine("What is the capital of " + country + "? ");
				
				if(answer.equalsIgnoreCase("exit")){
					break;
				}
				if (answer.equalsIgnoreCase(capital)) {
					switch (rand.nextInt()%3) {
						case 0: System.out.println("Well Done!");
						break;
						case 1: System.out.println("That's Right!");
						break;
						case 2: System.out.println("Correct!");
						break;
					}
					
					correct++;
				}
				else {
					System.out.println("No, the answer is " + capital + "!");	
				}
				total++;
			}
		}
	catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
		System.out.println("You scored " + correct + " out of " + total);
	}
}