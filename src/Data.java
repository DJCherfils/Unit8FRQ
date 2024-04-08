public class Data
{
    public static final int MAX = 10;
    private int[][] grid = {{1,2,3,4}, {5,6,7,8}, {9, 10, 11, 12}};
    /** Fills all elements of grid with randomly generated values, as
     described in part (a)
     * Precondition: grid is not null.
     * grid has at least one element.
     */
    public void getGrid(){
        for(int i = 0; i < grid.length; i ++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
    public void repopulate()
    {
        int randNum = 0;
        for(int i = 0; i < grid.length; i ++){
            for (int j = 0; j <grid[0].length; j++){
                randNum = (int)(Math.random() * MAX - 1 + 1) + 1;
                while(randNum % 10 != 0 && randNum % 100 == 0){
                        randNum = (int)(Math.random() * MAX - 1 + 1) + 1;
                }
                grid[i][j] = randNum;
            }
        }
    }
    /** Returns the number of columns in grid that are in increasing
     order, as described
     * in part (b)
     * Precondition: grid is not null.
     * grid has at least one element.
     */
    public int countIncreasingCols()
    {
        int count = 0;
        for(int k = 0; k < grid[0].length; k++){
            boolean ordered = true;
            for(int l = 1; l < grid.length; l ++){
                if(grid[l][k] < grid[l - 1][k]){
                    ordered = false;
                }
            }
            if(ordered){
                count ++;
            }

        }
        return count;
    }

}