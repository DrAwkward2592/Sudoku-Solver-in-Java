
public class Sudoku {
	static int[][] userGrid = new int[][]
			{{0,0,0,0,0,0,0,0,7},
			{0,0,0,0,0,0,0,0,7},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0}};
			
	//Grid for program to guess and check
	static int grid[][] = new int [9][9];
	
	static String possibilitiesGrid[][] = new String[9][9];
	
	public static void main(String[] args) {
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				grid[i][j] = userGrid[i][j];
			}
		}
		print(grid);
		print(loop(0,0,grid));
		
	}

	public static int[][] loop(int y, int x, int[][] grid){
		//while not solved
		while(!validity(8,8,grid)||grid[8][8]==0){
			
			if(userGrid[y][x]!=0){
			
				int yy=0,xx=0;
				if(x==8){yy=y+1;xx=0;}
				else{yy=y;xx=x+1;}
				loop(yy,xx,grid);
			}else{
				if(grid[y][x]<9){
					grid[y][x]++;
					if(validity(y, x, grid)){
						int xx,yy;
						if(x==8){yy=y+1;xx=0;}
						else{yy=y;xx=x+1;}
						
						loop(yy,xx,grid);
					}
				}else{
					grid[y][x]=0;
					break;
				}
				
			}
			
			
		}
		
		
		return grid;
	}
	
	public static boolean validity(int x, int y, int[][] grid){
		String temp = "";
		for(int i=0;i<9;i++){
			
			//horizontal
			temp=temp+ Integer.toString(grid[i][y]);
			
			//vertical
			temp=temp+Integer.toString(grid[x][i]);
			
			//square
			temp=temp+Integer.toString(grid[(x/3)*3 +i/3][(y/3)*3 +i%3]);
		}
		
		int count=0;
		int idx=0;
		
		while((idx=temp.indexOf(Integer.toString(grid[x][y]), idx))!=-1){
			idx++;
			count++;
		}
		
		return count==3;
		
	}
	
	public static void print(int[][] grid){
	
		for(int i=0;i<9;i++){
			System.out.println();
			for(int j=0;j<9;j++){
				System.out.print(grid[i][j]);
			}
		}
	}
}
