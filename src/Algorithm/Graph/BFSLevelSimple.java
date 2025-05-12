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

public class BFSLevelSimple {

    public static void main(String[] args) {
        int v, edge;
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        System.out.print("Enter number of Nodes: ");
        v = in.nextInt();

        System.out.print("Enter number of Edges: ");
        edge = in.nextInt();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            System.out.println("Edge " + i);
            System.out.print("Source node: ");
            int src = in.nextInt();
            System.out.print("Destination node: ");
            int dest = in.nextInt();
            adj.get(src).add(dest);
            adj.get(dest).add(src); // undirected graph
        }

        System.out.print("Enter source node for level calculation: ");
        int source = in.nextInt();

        BFSLevelSimple obj = new BFSLevelSimple();
        obj.BFSWithLevels(adj, v, source);
    }

    void BFSWithLevels(ArrayList<ArrayList<Integer>> adj, int v, int source) {
        boolean[] visited = new boolean[v];
        int[] level = new int[v]; // Stores the level of each node

        Queue<Integer> q = new LinkedList<>();
        visited[source] = true;
        level[source] = 0;
        q.add(source);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.println("Node " + u + " is at level " + level[u]);

            for (int neighbor : adj.get(u)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    level[neighbor] = level[u] + 1;
                    q.add(neighbor);
                }
            }
        }
    }
}


/*
Sample Input:
Enter number of Nodes: 6
Enter number of Edges: 5
Edge 0
Source node: 0
Destination node: 1
Edge 1
Source node: 0
Destination node: 2
Edge 2
Source node: 1
Destination node: 3
Edge 3
Source node: 2
Destination node: 4
Edge 4
Source node: 3
Destination node: 5
Enter source node for level calculation: 0


Sample Output:
Node 0 is at level 0
Node 1 is at level 1
Node 2 is at level 1
Node 3 is at level 2
Node 4 is at level 2
Node 5 is at level 3
*/