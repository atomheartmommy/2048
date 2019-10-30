import java.util.*;

public class GenerateArray {
	static Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	
	
	//finds the largest block
	public int LargestBlock(int[][] ints) {
	    int currentHighestValue = Integer.MIN_VALUE;
	    for (int row = 0; row < ints.length; row++) {
	        for (int col = 0; col < ints[row].length; col++) {
	            int value = ints[row][col];
	            if (value > currentHighestValue) {
	                currentHighestValue = value;
	            }
	        }
	    }
	    return currentHighestValue; 
	}

	

	
	public void emptyBlocks(int[][] array,int emcount) {
		int count = 0;
		
		

		
		// picks a random character from this string. a probability of 0.8 for 2s and 0.2 for 4s
		String prob = "2222222244";
		char num = prob.charAt(rand.nextInt(prob.length()));
		char num2 = prob.charAt(rand.nextInt(prob.length()));
		String insertNum = String.valueOf(num);
		String insertNum2 = String.valueOf(num2);
		

		// determines how many empty spots are in the array
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (array[i][j] == 0) {
					count++;
				}
			}
		}

		String[] storeEmptyBlocks = new String[count];
		int counter = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (array[i][j] == 0) {
					storeEmptyBlocks[counter] = String.valueOf(i) + "," + String.valueOf(j);
					counter++;
				}
			}
		}
		 
		try {
			if (emcount == 1 ) {// first turn prints out two random numbers
				String getEmptyBlocks = storeEmptyBlocks[rand.nextInt(storeEmptyBlocks.length)];
				String getEmptyBlocks2 = storeEmptyBlocks[rand.nextInt(storeEmptyBlocks.length)];
				
				while (getEmptyBlocks.equals(getEmptyBlocks2)) {
					getEmptyBlocks = storeEmptyBlocks[rand.nextInt(storeEmptyBlocks.length)];
				}
				
				String[] emptyRowCol = getEmptyBlocks.split(",");
				String[] emptyRowCol2 = getEmptyBlocks2.split(",");
				
				int row = Integer.parseInt(emptyRowCol[0]);
				int col = Integer.parseInt(emptyRowCol[1]);
				
				int row2 = Integer.parseInt(emptyRowCol2[0]);
				int col2 = Integer.parseInt(emptyRowCol2[1]);
				
				array[row][col] = Integer.parseInt(insertNum);
				array[row2][col2] = Integer.parseInt(insertNum2);
				
				
				
			}
			
			else {// everyother turn adds one number to the array
	
				String getEmptyBlocks = storeEmptyBlocks[rand.nextInt(storeEmptyBlocks.length)];
				String[] emptyRowCol = getEmptyBlocks.split(",");
				int row = Integer.parseInt(emptyRowCol[0]);
				int col = Integer.parseInt(emptyRowCol[1]);
				array[row][col] = Integer.parseInt(insertNum);
				
			}
			
			}
		
			catch(Exception E) { // if there are no more moves
				System.out.println("Ran out of moves, try again!");
				System.out.println();
				System.exit(0);
			}
		
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) { 
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();

			
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (array[i][j] == 2048) {
					System.out.println("Congratulations, you beat the game!");
				}
			}
			
		}
		System.out.println();
		System.out.println("Submit your next move: ");
		System.out.println();
		String control = scan.nextLine();
		Operations operations = new Operations(control, array);
		
	}
}
