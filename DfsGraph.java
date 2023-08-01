import java.util.ArrayList;

class DfsGraph {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v+1];
        ArrayList<Integer> ans = new ArrayList<>();
        solve(ans,adj,vis,0);
        return ans;
    }

    private void solve(ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int i) {
        ans.add(i);
        vis[i] = true;
        for(int it: adj.get(i)){
            if(!vis[it]){
                solve(ans,adj,vis,it);
            }
        }
    }
}