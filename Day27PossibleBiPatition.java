class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        int[] part = new int[N + 1];
        List<List<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i <= N; i++) 
            adj.add(new ArrayList<Integer>());
        
        for (int[] edge : dislikes) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        for(int i = 0; i <= N; i++) {
            if (part[i] == 0) {
                part[i] = 1;
                
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                
                while(!q.isEmpty()) {
                    int temp = q.poll();
                    for(int dis : adj.get(temp)) {
                        if(part[dis] == 0) {
                            part[dis] = -part[temp];
                            q.add(dis);
                        } 
                        else if (part[dis] == part[temp]) 
                            return false;
                    }
                }
            }
        }
        return true;
    }
}