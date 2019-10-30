
import java.util.*;

public class Main {
	
	//Initial grid set for the game
	public static int[][] a = new int[][] { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
	
	public static void main (String[]args) {
		GenerateArray genArray = new GenerateArray();
		boolean game = true;
		
		int turns = 0;
		
		
		System.out.println("Welcome to 2048!" +
	            "\n Use 'a', 'd, 'w', and 's' to move left, right, up, and down respectively." +
	            "\n You can quit by pressing 'q' and restart by pressing 'r' ");
		
		//Initiating the game
		while(game) {
			
			int maxV = genArray.LargestBlock(a);
			System.out.println();
			System.out.println("The max value is : " + maxV);
			System.out.println();
			System.out.println("Amount of moves: " + turns);
			System.out.println();
			turns++;
			genArray.emptyBlocks(a,turns);
			
	
			
		}
		
	}

}