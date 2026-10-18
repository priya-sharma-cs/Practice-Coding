import java.util.ArrayList;

public class RateInMaze {
    public static void main(String[] args) {
        int[][] maze = {
            { 1, 0, 0, 0 },
            { 1, 1, 0, 1 },
            { 1, 1, 0, 0 },
            { 0, 1, 1, 1 }
        };

        RateInMaze obj = new RateInMaze();
        ArrayList<String> ans = obj.ratInMaze(maze);

        System.out.println(ans);
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
       int n = maze.length;
       boolean[][] visited = new boolean[n][n];
        StringBuilder sb = new StringBuilder("");
        findpaths(maze,0,0,sb,visited,ans);
        return ans;
        
        
    }
   public static void findpaths(
       int[][] maze, int row, int col,
       StringBuilder path, boolean[][] visited,
       ArrayList<String> ans
   ){
        int n = maze.length;
        if (row < 0 || col < 0 || row >= n || col >= n) {
            return;
        }

        if (visited[row][col] || maze[row][col] == 0) {
            return;
        }
        if(row==n-1 && col ==n-1){
            ans.add(path.toString());
            return;
        }
        visited[row][col]=true;
        
        path.append("D");
        findpaths(maze,row+1,col,path,visited,ans);
        path.deleteCharAt(path.length()-1);
        
        path.append("L");
        findpaths( maze,row,col-1,path,visited,ans);
        path.deleteCharAt(path.length()-1);
        
        path.append("R");
        findpaths( maze,row,col+1,path,visited,ans);
        path.deleteCharAt(path.length()-1);
        
        path.append("U");
        findpaths(maze,row-1,col,path,visited,ans);
        path.deleteCharAt(path.length()-1);
        
        visited[row][col]=false;
    }
}

