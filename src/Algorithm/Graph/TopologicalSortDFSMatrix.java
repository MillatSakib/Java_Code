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

public class TopologicalSortDFSMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of vertices
        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();
        int[][] matrix = new int[V][V];

        // Input adjacency matrix
        System.out.println("Enter the adjacency matrix (space separated):");
        scanner.nextLine(); // consume leftover newline
        for (int i = 0; i < V; i++) {
            String[] row = scanner.nextLine().trim().split(" ");
            for (int j = 0; j < V; j++) {
                matrix[i][j] = Integer.parseInt(row[j]);
            }
        }

        // Perform topological sort
        topologicalSortDFS(matrix, V);
        scanner.close();
    }

    static void topologicalSortDFS(int[][] matrix, int V) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(matrix, i, visited, stack);
            }
        }

        System.out.println("Topological Sort (DFS):");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    static void dfs(int[][] matrix, int node, boolean[] visited, Stack<Integer> stack) {
        visited[node] = true;
        for (int v = 0; v < matrix.length; v++) {
            if (matrix[node][v] == 1 && !visited[v]) {
                dfs(matrix, v, visited, stack);
            }
        }
        stack.push(node); // push after visiting all descendants
    }
}

/*
Sample Input:
Enter the number of vertices: 6
Enter the adjacency matrix (space separated):
0 0 0 0 1 1
0 0 0 0 0 0
1 1 0 0 0 0
0 1 0 0 0 0
0 0 0 1 0 0
0 0 1 0 0 0

Sample Output:
Topological Sort (DFS):
2 3 1 0 4 5
*/