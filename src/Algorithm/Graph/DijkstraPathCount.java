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

public class DijkstraPathCount {
    static class Edge {
        int to, weight;
        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    public static void dijkstraCountPaths(List<List<Edge>> graph, int source, int[] dist, int[] count) {
        int V = graph.size();
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(count, 0);
        dist[source] = 0;
        count[source] = 1;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{source, 0}); // {node, distance}

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0];
            int d = curr[1];
            if (d > dist[u]) continue;

            for (Edge edge : graph.get(u)) {
                int v = edge.to;
                int w = edge.weight;

                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    count[v] = count[u];
                    pq.add(new int[]{v, dist[v]});
                } else if (dist[u] + w == dist[v]) {
                    count[v] += count[u];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = scanner.nextInt();
        System.out.print("Enter number of edges: ");
        int E = scanner.nextInt();

        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter edges (from to weight):");
        for (int i = 0; i < E; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            graph.get(u).add(new Edge(v, w)); // directed graph
        }

        System.out.print("Enter source node: ");
        int source = scanner.nextInt();
        System.out.print("Enter destination node: ");
        int dest = scanner.nextInt();

        int[] dist = new int[V];
        int[] count = new int[V];

        dijkstraCountPaths(graph, source, dist, count);

        if (dist[dest] == Integer.MAX_VALUE) {
            System.out.println("No path exists from " + source + " to " + dest);
        } else {
            System.out.println("Shortest distance from " + source + " to " + dest + " = " + dist[dest]);
            System.out.println("Number of shortest paths = " + count[dest]);
        }

        scanner.close();
    }
}

/*
Sample Input:
Vertices: 5
Edges: 6
Edges:
0 1 2
0 2 2
1 3 1
2 3 1
1 4 3
2 4 3
Source: 0
Destination: 3

Sample Output:
Shortest distance from 0 to 3 = 3
Number of shortest paths = 2.

*/