class Solution
{
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source, int destination)
    {
        int count = 0;
        ArrayList<Integer> queue = new ArrayList<>();
        queue.add(source);
        while(queue.size()>0){
            int value = queue.remove(0);
            if (value == destination) {
                count++;
            }
            for (int neighbour:adj.get(value)) {
                queue.add(neighbour );
            }
        }
        return count;
    }
}
