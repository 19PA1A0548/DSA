class Solution {
    public int numIslands(char[][] grid) {
        int total_islands = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]== '1'){
                    total_islands += dfs(grid,i,j);
                }
            }
        }
        return total_islands;
    }
    
    public int dfs(char[][] grid,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0'){
            return 0;
        }
        else{
        grid[i][j]='0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        return 1;
        }
    }
}
