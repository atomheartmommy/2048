
public class Movement {
 
	//Moving down
	public int goDown(int[][] a, int i, int j) {
		if (i < 3) {
			return a[i+1][j];
		}
		else {
			return 1;
		}
	}
	
	//Moving up
	public int goUp(int[][] a, int i, int j) {
		if (i > 0) {
			return a[i-1][j];
		}
		else {
			return 1;
		}
	}
	
	//Moving left
	public int goLeft(int[][] a, int i, int j) {
		if (j > 0) {
			return a[i][j-1];
		}
		else {
			return 1;
		}
	}
	
	//Moving right 
	public int goRight(int[][] a, int i, int j) {
		if (j < 3) {
			return a[i][j+1];
		}
		else {
			return 1;
		}
	}
}
