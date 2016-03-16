
public class Sudoku {

	public static void main(String[] args) {
		int[][] userGrid = new int[][]
				{{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0}};
				
		//Grid for program to guess and check
		int grid[][] = new int [9][9];
		
		String possibilitiesGrid[][] = new String[9][9];
		print(grid);
	}

	public static void print(int[][] grid){
		System.out.println();
		
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print(grid[i][j]);
			}
		}
	}
}
