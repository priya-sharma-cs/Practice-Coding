package PracticeCoding1.Leetcode.DP;

public class MinimumPath_Sum {
    
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(MinimumPath(grid, 0, 0));
    }
    public static int MinimumPath(int[][] grid , int cr , int cc ){
        if(cr==grid.length-1 && cc==grid[0].length-1){
            return grid[cr][cc];
        }
        if(cr> grid.length-1 || cc>grid[0].length-1){
            return Integer.MAX_VALUE;
        }
        int h =MinimumPath(grid,cr+1,cc);
        int v = MinimumPath(grid,cr,cc+1);
        return Math.min(h,v) + grid[cr][cc];
    }
}
