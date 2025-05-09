package Algorithm.Graph;

import java.util.*;

public class ConnectedComponentWithBFS {

    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the number of Nodes: ");
        int v = in.nextInt();

        System.out.print("Please enter the number of Edges: ");
        int edge = in.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // Read edges
        for (int i = 0; i < edge; i++) {
            System.out.println("For Edge " + (i + 1) + ":");
            System.out.print("  Enter the source Node: ");
            int src = in.nextInt();

            System.out.print("  Enter the destination Node: ");
            int dest = in.nextInt();

            adj.get(src).add(dest);
            adj.get(dest).add(src); // Since the graph is undirected
        }

        ConnectedComponentWithBFS obj = new ConnectedComponentWithBFS();
        int components = obj.BFSDis(adj, v);
        System.out.println("\nNumber of connected components: " + components);
    }

    // Performs BFS from a single node
    void BFS(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");

            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }

    // Traverses all components and returns their count
    int BFSDis(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        int componentCount = 0;

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                BFS(adj, i, visited);
                componentCount++;
            }
        }

        return componentCount;
    }
}
