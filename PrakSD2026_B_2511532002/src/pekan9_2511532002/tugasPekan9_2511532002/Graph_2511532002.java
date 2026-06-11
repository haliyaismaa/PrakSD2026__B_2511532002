package tugasPekan9_2511532002;

import java.util.*;

public class Graph_2511532002 {
	private Map<String, List<String>> graph_2002;
	public Graph_2511532002() {
	    graph_2002 = new HashMap<>();
	}
	
    // Menambahkan Edge
    public void addEdge_2002(String source_2002, String destination_2002) {

        graph_2002.putIfAbsent(source_2002, new ArrayList<>());
        graph_2002.putIfAbsent(destination_2002, new ArrayList<>());

        graph_2002.get(source_2002).add(destination_2002);
        graph_2002.get(destination_2002).add(source_2002);
    }

    // Mengambil Graph
    public Map<String, List<String>> getGraph_2002() {
        return graph_2002;
    }

    // BFS
    public List<String> bfs_2002(String start_2002,
                                 String goal_2002) {

        Queue<String> queue_2002 = new LinkedList<>();
        Set<String> visited_2002 = new HashSet<>();
        Map<String, String> parent_2002 = new HashMap<>();

        queue_2002.add(start_2002);
        visited_2002.add(start_2002);

        while (!queue_2002.isEmpty()) {

            String current_2002 = queue_2002.poll();

            if (current_2002.equals(goal_2002)) {
                break;
            }

            for (String neighbor_2002 :
                    graph_2002.getOrDefault(current_2002,
                    new ArrayList<>())) {

                if (!visited_2002.contains(neighbor_2002)) {

                    visited_2002.add(neighbor_2002);
                    parent_2002.put(neighbor_2002,
                            current_2002);

                    queue_2002.add(neighbor_2002);
                }
            }
        }

        return buildPath_2002(parent_2002,
                start_2002,
                goal_2002);
    }

    // DFS
    public List<String> dfs_2002(String start_2002,
                                 String goal_2002) {

        Stack<String> stack_2002 = new Stack<>();
        Set<String> visited_2002 = new HashSet<>();
        Map<String, String> parent_2002 = new HashMap<>();

        stack_2002.push(start_2002);

        while (!stack_2002.isEmpty()) {

            String current_2002 = stack_2002.pop();

            if (visited_2002.contains(current_2002)) {
                continue;
            }
            visited_2002.add(current_2002);

            if (current_2002.equals(goal_2002)) {
                break;
            }
            List<String> neighbors_2002 =
                    graph_2002.getOrDefault(
                            current_2002,
                            new ArrayList<>());

            for (int i_2002 = neighbors_2002.size() - 1;
                 i_2002 >= 0;
                 i_2002--) {

                String neighbor_2002 =
                        neighbors_2002.get(i_2002);

                if (!visited_2002.contains(neighbor_2002)) {

                    parent_2002.put(neighbor_2002,
                            current_2002);

                    stack_2002.push(neighbor_2002);
                }
            }
        }
        return buildPath_2002(parent_2002,start_2002, goal_2002);
    }

    // Membentuk Path
    private List<String> buildPath_2002(
            Map<String, String> parent_2002,
            String start_2002,
            String goal_2002) {

        List<String> path_2002 =
                new ArrayList<>();

        if (!start_2002.equals(goal_2002) && !parent_2002.containsKey(goal_2002)) {

            return path_2002;
        }

        String current_2002 = goal_2002;

        while (current_2002 != null) {

            path_2002.add(current_2002);

            if (current_2002.equals(start_2002)) {
                break;
            }

            current_2002 =
                    parent_2002.get(current_2002);
        }

        Collections.reverse(path_2002);

        return path_2002;
    }
}