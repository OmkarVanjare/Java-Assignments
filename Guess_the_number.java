package CWH;
import java.util.*;
import java.util.Random;
class Game{
	int computer_input,user_input;
	int numberofguessees = 0;
	public int getNumberofguessees() {
		return numberofguessees;
	}
	public void setNumberofguessees(int numberofguessees) {
		this.numberofguessees = numberofguessees;
	}
	public Game() {
		System.out.println("Guess the number");
		Random r = new Random();
		computer_input = r.nextInt(100);
	}
	public void takeUserinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number between 0 to 100");
		user_input = sc.nextInt();	
	}
	public boolean isCorrectNumber() {
		numberofguessees++;
		if(user_input==computer_input) {
			System.out.format("Yes you have guessed it rigth in %d attemps",numberofguessees);
			return true;
		}
		else if(user_input>computer_input) {
			System.out.println("The entered number is too high");
			return false;
		}
		else if(user_input < computer_input) {
			System.out.println("The entered number is too low");
			return false;
		}
		else {
			return false;
		}
	}
}
public class Guess_the_number {

	public static void main(String[] args) {
		boolean b = false;
		Game g = new Game();
		while(!b) {
		g.takeUserinput();
		b=g.isCorrectNumber();
		}

	}

}
