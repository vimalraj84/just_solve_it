package com.bilqu.solve.prob;

public class NumberOfIsland {

    public static void main(String[] args) {
        // 11110
        // 11010
        // 11000
        // 00000
        int[][] islandGrid1 = new int[][]{{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};
        System.out.println("{{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0,},{0,0,0,0,0}} -> "+findNumIslands(islandGrid1));
        int[][] islandGrid2 = new int[][]{{1,1,0,0,0},{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}};
        System.out.println("{{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0,},{0,0,0,0,0}} -> "+findNumIslands(islandGrid2));

    }

    private static int findNumIslands(int[][] grid){
        int count = 0;
        for(int i = 0; i<grid.length;i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j] == 1){
                    ++count;
                    doBFS(grid, i, j);
                }
            }
        }
        return count;
    }

    private static void doBFS(int[][]grid, int i, int j){
        if(i < 0||j < 0)
            return;
        if(i>=grid.length || j >= grid[i].length)
            return;

        if(grid[i][j] == 0){
            return;
        }

        //Flip to zero so that it will be skipped in the next iteration
        grid[i][j] = 0;

        //Recursively search for the above, below , left , right position for '1'
        doBFS(grid,i-1,j);//up
        doBFS(grid,i+1,j);//down
        doBFS(grid,i,j-1);//left
        doBFS(grid,i,j+1);//right
    }
}
