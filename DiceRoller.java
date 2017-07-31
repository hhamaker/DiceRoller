import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiceRoller {
	public static void main (String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			//ask the user for how many sides they want on the dice
			System.out.println("How Many sides are on your dice?");
			String input1 = br.readLine();
			//parse the string to an int
			int numSides = Integer.parseInt(input1);
			//ask the user how many dice they are rolling
			System.out.println("How Many dice are you rolling?");
			String input2 = br.readLine();
			//parse the numDice into an int.
			int numDice = Integer.parseInt(input2);
			int total = 0;
			//iterate through the number of dice
			for (int x = 0; x < numDice; x++) {
				//generate a random number between 1 and 100
				double temp1 = (Math.random()*100 + 1);
				//while that number is greater than the number of sides
				while(temp1 >= numSides+1){
					//reroll the number
					temp1 = (Math.random()*100 + 1);
				}
				//cast the double to an int
				int temp = (int) temp1;
				//tell the user what the value of that roll was.
				System.out.println("The "+ (x+1) + " value: " + temp);
				//increment the total with the value of the dice roll
				total = total+temp;
			}
			//tell the user the total of the all of the dice rolls
			System.out.println("Total: " + total);
		} catch (IOException e) {
			//catch the exceptions.
			e.printStackTrace();
		} 
		
	}
}
