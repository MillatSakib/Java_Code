/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm.Graph;

/**
 *
 * @author Sakib
 */


import java.util.*;

class DijkstraAlgoSimple {
    static class Edge {
        int to, weight;
        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    public static void dijkstra(List<List<Edge>> graph, int source, int[] dist) {
        int V = graph.size();
        boolean[] visited = new boolean[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{source, 0}); // {node, distance}

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[0];
            if (visited[u]) continue;
            visited[u] = true;

            for (Edge edge : graph.get(u)) {
                int v = edge.to;
                int weight = edge.weight;

                if (!visited[v] && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new int[]{v, dist[v]});
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: vertices and edges
        System.out.print("Enter number of vertices: ");
        int V = scanner.nextInt();
        System.out.print("Enter number of edges: ");
        int E = scanner.nextInt();

        // Create graph
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Input edges
        System.out.println("Enter edges (from to weight):");
        for (int i = 0; i < E; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            graph.get(u).add(new Edge(v, w)); // Directed edge with weight
        }

        // Input source
        System.out.print("Enter the source node: ");
        int source = scanner.nextInt();

        int[] dist = new int[V];
        dijkstra(graph, source, dist);

        // Output shortest distances
        System.out.println("Shortest distances from node " + source + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("To node " + i + " = " + (dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]));
        }

        scanner.close();
    }
}

/*
Sample Input
Enter number of vertices: 5
Enter number of edges: 6
Enter edges (from to weight):
0 1 10
0 4 5
1 2 1
2 3 4
4 1 3
4 2 9
Enter the source node: 0

Sample Output:
Shortest distances from node 0:
To node 0 = 0
To node 1 = 8
To node 2 = 9
To node 3 = 13
To node 4 = 5
*/