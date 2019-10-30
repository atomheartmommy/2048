import java.util.Scanner;

public class Operations {

	String input;
	Scanner scan = new Scanner(System.in);

	Operations(String control, int[][] array) {
		input = control;
		Movement move = new Movement();

		switch (input) {

		//moving the grid down
		case "s":
			for (int j = 0; j < 4; j++) {
				for (int i = 3; i >= 0; i--) {
					if (array[i][j] != 0) {
						int tempRow = i;
						while (move.goDown(array, tempRow, j) == 0) {
							tempRow++;
						}
						if (move.goDown(array, tempRow, j) != 0 && move.goDown(array, tempRow, j) == array[i][j]) {
							array[tempRow + 1][j] += array[i][j];
							array[i][j] = 0;
						}
						if (tempRow != i) {
							array[tempRow][j] = array[i][j];
							array[i][j] = 0;
						}
					}
				}
			}
			break;

		
		//moving the grid up
		case "w":
			for (int j = 0; j < 4; j++) {
				for (int i = 0; i <= 3; i++) {
					if (array[i][j] != 0) {
						int temprow = i;
						while (move.goUp(array, temprow, j) == 0) {
							temprow--;
						}
						if (move.goUp(array, temprow, j) != 0 && move.goUp(array, temprow, j) == array[i][j]) {
							array[temprow - 1][j] += array[i][j];
							array[i][j] = 0;
						}
						if (temprow != i) {
							array[temprow][j] = array[i][j];
							array[i][j] = 0;
						}
					
						
					}
				}
			}
			break;

		
		//moving the grid left
		case "a":
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j <= 3; j++) {
					if (array[i][j] != 0) {
						int tempcol = j;
						while (move.goLeft(array, i, tempcol) == 0) {
							tempcol--;
						}
						if (move.goLeft(array, i, tempcol) != 0 && move.goLeft(array, i, tempcol) == array[i][j]) {
							array[i][tempcol - 1] += array[i][j];
							array[i][j] = 0;
						}
						if (tempcol != j) {
							array[i][tempcol] = array[i][j];
							array[i][j] = 0;
						}
					}
				}
			}
			break;

		
		//moving the grid right
		case "d":
			for (int i = 0; i < 4; i++) {
				for (int j = 3; j >= 0; j--) {
					if (array[i][j] != 0) {
						int tempcol = j;
						while (move.goRight(array, i, tempcol) == 0) {
							tempcol++;
						}
						if (move.goRight(array, i, tempcol) != 0 && move.goRight(array, i, tempcol) == array[i][j]) {
							array[i][tempcol + 1] += array[i][j];
							array[i][j] = 0;
						}
						if (tempcol != j) {
							array[i][tempcol] = array[i][j];
							array[i][j] = 0;
						}
					}
				}
			}
			break;

		
		//quitting the game
		case "q":
			System.out.println("are you sure you want to quit? y/n");
			String quit = scan.next();
			
			switch (quit) {
			case "y":
				System.out.println("quitting");
				System.exit(0);
				break;
			case "n":
				System.out.println("choose your next move");
				break;
			}
			
			break;

		
		//restarting the game	
		case "r":
			System.out.println("are you sure you want to restart? y/n");
			String restart = scan.next();
			
			switch (restart) {
			case "y":
				System.out.println("restarting");
				System.out.println("");
				Main.main(null);
				break;
			case "n":
				System.out.println("enter your next move");
				break;
			}
			
			break;
			
		default:
			System.out.println("Invalid Entry!");
			
		}
	}
}
