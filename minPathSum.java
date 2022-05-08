// A Java program to count all possible paths
// from top left to bottom right
class minPathSum{

		public static int minPathSum(int[][] grid) {

					int height = grid.length;
					int width = grid[0].length;
					for (int row = 0; row < height; row++) {
						for (int col = 0; col < width; col++) {
								System.out.print("    grid["+row+"]["+col+"]="+grid[row][col]);
						}
							System.out.println();
					}
					
					System.out.println("--------------------------------------------------");
					
					for (int row = 0; row < height; row++) {
						for (int col = 0; col < width; col++) {
							if(row == 0 && col == 0) grid[row][col] = grid[row][col];
							else if(row == 0 && col != 0) grid[row][col] = grid[row][col] + grid[row][col - 1];
							else if(col == 0 && row != 0) grid[row][col] = grid[row][col] + grid[row - 1][col];
							else grid[row][col] = grid[row][col] + Math.min(grid[row - 1][col], grid[row][col - 1]);
							
							System.out.print("    Sgrid["+row+"]["+col+"]="+grid[row][col]);
						}
						System.out.println();
					}
					return grid[height - 1][width - 1];
				}
		 
    public static void main(String args[])

    {
		int[][] grid =  { { 1, 3,2,4 }, { 3, 1,3, 1},{ 2, 4,6,3 }};  //3 x4 matrix. 3 rows and 4 colums.
		
		minPathSum zz = new minPathSum();
		System.out.println("-------------------------------------------------------------------");
        System.out.println("Minimum path Sum: "+zz.minPathSum(grid));
    }
}
 
