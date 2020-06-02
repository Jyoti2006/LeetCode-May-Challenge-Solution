class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         Map<Integer, List<Integer>> graph = new HashMap<>();
    Set<Integer> visited = new HashSet<>();
    for(int n[] : prerequisites)
    {
        graph.computeIfAbsent(n[0], k -> new ArrayList<>()).add(n[1]);
    }
    
    for(int i = 0; i < numCourses; i++)
    {
        if(!visited.contains(i))
        {
            if(hasCycle(graph, new HashSet<>() ,visited, i))
            {
                return false;
            }
        }
    }
    return true;
    }
    private boolean hasCycle(Map<Integer, List<Integer>> graph, Set<Integer> path,
                         Set<Integer> visited, int node)
{
    List<Integer> neighbours = graph.get(node);
    if(neighbours == null) return false;
    path.add(node);
    visited.add(node);
    boolean result = false;
    for(int n : neighbours)
    {
        if(path.contains(n)) return true;
        if(!visited.contains(n))
        {
            result |= hasCycle(graph, path, visited, n);
        }
        path.remove(n);
    }
    return result;
}
}