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

public class TopologicalSortkhansMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of vertices
        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();
        int[][] matrix = new int[V][V];

        // Read the adjacency matrix
        System.out.println("Enter the adjacency matrix (space separated):");
        scanner.nextLine(); // consume leftover newline
        for (int i = 0; i < V; i++) {
            String[] row = scanner.nextLine().trim().split(" ");
            for (int j = 0; j < V; j++) {
                matrix[i][j] = Integer.parseInt(row[j]);
            }
        }

        topologicalSort(V, matrix);
        scanner.close();
    }

    public static void topologicalSort(int V, int[][] matrix) {
        int[] inDegree = new int[V];

        // Calculate in-degrees
        for (int u = 0; u < V; u++) {
            for (int v = 0; v < V; v++) {
                if (matrix[u][v] == 1) {
                    inDegree[v]++;
                }
            }
        }

        // Enqueue vertices with in-degree 0
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        // Perform Kahn's algorithm
        ArrayList<Integer> topoOrder = new ArrayList<>();
        int count = 0;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            topoOrder.add(u);

            for (int v = 0; v < V; v++) {
                if (matrix[u][v] == 1) {
                    inDegree[v]--;
                    if (inDegree[v] == 0) {
                        queue.add(v);
                    }
                }
            }
            count++;
        }

        if (count != V) {
            System.out.println("The graph contains a cycle. Topological sort not possible.");
        } else {
            System.out.println("Topological Sort:");
            for (int node : topoOrder) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}

/*
Sample Input:
Enter the number of vertices: 3
Enter the adjacency matrix (space separated):
0 1 1
1 0 0
0 0 1
Sample Output:
The graph contains a cycle. Topological sort not possible.
*/