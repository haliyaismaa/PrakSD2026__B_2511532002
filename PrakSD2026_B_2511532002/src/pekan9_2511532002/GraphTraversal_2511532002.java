package pekan9_2511532002;
import java.util.*;

public class GraphTraversal_2511532002 {

    private Map<String, List<String>> graph_2002 = new HashMap<>();

    public void addEdge_2002(String node1_2002, String node2_2002) {
        graph_2002.putIfAbsent(node1_2002, new ArrayList<>());
        graph_2002.putIfAbsent(node2_2002, new ArrayList<>());

        graph_2002.get(node1_2002).add(node2_2002);
        graph_2002.get(node2_2002).add(node1_2002);
    }

    public void printGraph_2002() {
        System.out.println("Graf Awal (Adjacency List):");

        for (String node_2002 : graph_2002.keySet()) {
            System.out.print(node_2002 + " -> ");

            List<String> neighbors_2002 = graph_2002.get(node_2002);

            System.out.println(String.join(", ", neighbors_2002));
        }

        System.out.println();
    }

    public void dfs_2002(String start_2002) {
        Set<String> visited_2002 = new HashSet<>();

        System.out.println("Penelusuran DFS:");

        dfsHelper_2002(start_2002, visited_2002);

        System.out.println();
    }

    private void dfsHelper_2002(String current_2002,
                                Set<String> visited_2002) {

        if (visited_2002.contains(current_2002))
            return;

        visited_2002.add(current_2002);

        System.out.print(current_2002 + " ");

        for (String neighbor_2002 :
                graph_2002.getOrDefault(current_2002,
                new ArrayList<>())) {

            dfsHelper_2002(neighbor_2002, visited_2002);
        }
    }

    public void bfs_2002(String start_2002) {

        Set<String> visited_2002 = new HashSet<>();
        Queue<String> queue_2002 = new LinkedList<>();

        queue_2002.add(start_2002);
        visited_2002.add(start_2002);

        System.out.println("Penelusuran BFS:");

        while (!queue_2002.isEmpty()) {

            String current_2002 = queue_2002.poll();

            System.out.print(current_2002 + " ");

            for (String neighbor_2002 :
                    graph_2002.getOrDefault(current_2002,
                    new ArrayList<>())) {

                if (!visited_2002.contains(neighbor_2002)) {

                    queue_2002.add(neighbor_2002);
                    visited_2002.add(neighbor_2002);
                }
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        GraphTraversal_2511532002 graph_2002 =
                new GraphTraversal_2511532002();

        graph_2002.addEdge_2002("A", "B");
        graph_2002.addEdge_2002("A", "C");
        graph_2002.addEdge_2002("B", "D");
        graph_2002.addEdge_2002("B", "E");

        System.out.println("Graf Awal adalah:");
        graph_2002.printGraph_2002();

        graph_2002.dfs_2002("A");
        graph_2002.bfs_2002("A");
    }
}