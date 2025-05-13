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

public class ToplogicalSortKhansSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of nodes and edges
        System.out.print("Enter number of vertices: ");
        int V = scanner.nextInt();
        System.out.print("Enter number of edges: ");
        int E = scanner.nextInt();

        // Adjacency list and in-degree array
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        int[] inDegree = new int[V];

        // Input edges
        System.out.println("Enter edges (from to):");
        for (int i = 0; i < E; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            adj.get(u).add(v);    // Directed edge u -> v
            inDegree[v]++;        // Count in-degree of v
        }

        // Perform Kahn's algorithm
        topologicalSortKahn(V, adj, inDegree);
        scanner.close();
    }

    static void topologicalSortKahn(int V, ArrayList<ArrayList<Integer>> adj, int[] inDegree) {
        Queue<Integer> q = new LinkedList<>();

        // Enqueue all vertices with in-degree 0
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }

        int count = 0;
        ArrayList<Integer> topoOrder = new ArrayList<>();

        while (!q.isEmpty()) {
            int u = q.poll();
            topoOrder.add(u);

            for (int v : adj.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) {
                    q.add(v);
                }
            }
            count++;
        }

        // If all vertices are processed, graph has no cycle
        if (count != V) {
            System.out.println("The graph contains a cycle. Topological sort not possible.");
        } else {
            System.out.println("Topological Sort (BFS / Kahn's Algorithm):");
            for (int node : topoOrder) {
                System.out.print(node + " ");
            }
        }
    }
}

/*
Sample Input:
Enter number of vertices: 6
Enter number of edges: 6
Enter edges (from to):
5 2
5 0
4 0
4 1
2 3
3 1
Sample Output:
Topological Sort (BFS / Kahn's Algorithm):
4 5 2 3 1 0

*/