import java.io.Console;

public class Game {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the capitals game");
		
		Console console = System.console();
		String answer = console.readLine("What is the capital of Australia? ");
		String capital = "Canberra";
		if(answer.equals(capital)){
			System.out.println("Correct!");
		}
		else {
			System.out.println("No the capital is " + capital);
		}

	}

}
