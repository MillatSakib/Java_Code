/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm.Graph;

/**
 *
 * @author Sakib
 */


import java.util.Arrays;

public class PrimsMST {

    // Function to implement Prim's Minimum Spanning Tree (MST) algorithm
    public static void primMST(int[][] graph) {
        int V = graph.length; // Number of vertices in the graph
        int[] key = new int[V]; // key[i] will hold the minimum weight edge connecting i to the MST
        boolean[] mSet = new boolean[V]; // mSet[i] will be true if vertex i is included in the MST
        int[] parent = new int[V];  // Array to store parent vertex in MST
        int res = 0; // Stores the weight of the MST

        // Initialize key[] with Integer.MAX_VALUE and mSet[] with false
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0; // Start with the first vertex (vertex 0) included in the MST
        parent[0] = -1; // Root node has no parent

        // The MST will have V-1 edges
        for (int count = 0; count < V - 1; count++) {
            // Pick the minimum weight edge not yet included in the MST
            int u = -1;

            // Find the vertex with the minimum key value from the vertices not yet included in MST
            for (int i = 0; i < V; i++) {
                if (!mSet[i] && (u == -1 || key[i] < key[u])) {
                    u = i;
                }
            }

            if (u == -1) break;

            mSet[u] = true; // Include the selected vertex in the MST
            res += key[u];    // Add the weight of the edge to the result

            // Update the key values of the adjacent vertices of the selected vertex
            for (int v = 0; v < V; v++) {
                // graph[u][v] is non-zero only for adjacent vertices of u
                // mSet[v] is false for vertices not yet included in MST
                if (graph[u][v] != 0 && !mSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;  // Update parent of v
                    key[v] = graph[u][v];
                }
            }
        }

        // Print the edges of the Minimum Spanning Tree in the desired format
        System.out.println("Edges of the Minimum Spanning Tree:");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + " => " + graph[i][parent[i]]);
        }
        System.out.println("Total weight of MST: " + res);
    }

    public static void main(String[] args) {
        // Example graph represented as an adjacency matrix
        //   0  1  2  3  4
        //0  0  2  0  6  0
        //1  2  0  3  0  5
        //2  0  3  0  0  0
        //3  6  0  0  0  0
        //4  0  5  0  0  0
        int[][] graph = {
                {0, 2, 0, 6, 0},
                {2, 0, 3, 0, 5},
                {0, 3, 0, 0, 0},
                {6, 0, 0, 0, 0},
                {0, 5, 0, 0, 0}
        };

        // Function call to find and print the weight of the minimum spanning tree
        primMST(graph);
    }
}
