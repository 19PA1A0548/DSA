class Solution
{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<>();
        int start = 0;
        set.add(start);
        result.add(start);
        for(Integer neighbour : adj.get(start)){
            if(!set.contains(neighbour)){
                result.add(neighbour);
                set.add(neighbour);
            }
        }

        for(int i=1;i<result.size();i++){
            for(Integer neighbour : adj.get(result.get(i))){
                if(!set.contains(neighbour)){
                    result.add(neighbour);
                    set.add(neighbour);
                }
            }
        }
        return result;
    }
    
}
