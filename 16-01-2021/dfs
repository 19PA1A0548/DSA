class Solution
{
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        
         ArrayList<Integer> result = new ArrayList<Integer>();
         HashSet<Integer> set = new HashSet();
        dfs(0,adj,result,set);
        return result;
    }
    
    public void dfs(int index, ArrayList<ArrayList<Integer>> adj , ArrayList<Integer> l, HashSet<Integer> set ){
        set.add(index);
        l.add(index);
        for(Integer neighbour : adj.get(index)){
            if(!set.contains(neighbour)){
                    dfs(neighbour, adj,l,set);
                }
        }
    }
    
}
