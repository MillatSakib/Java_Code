/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm.Graph;
import java.util.*;
/**
 *
 * @author Sakib
 */


public class DFSPathFinder {

    static boolean[] visited;
    static List<Integer> path = new ArrayList<>();

    // DFS function to find path
    public static boolean dfs(int[][] graph, int current, int destination) {
        visited[current] = true;
        path.add(current);

        if (current == destination) {
            return true;
        }

        for (int i = 0; i < graph.length; i++) {
            if (graph[current][i] == 1 && !visited[i]) {
                if (dfs(graph, i, destination)) {
                    return true;
                }
            }
        }

        // Backtrack if destination not found in this path
        path.remove(path.size() - 1);
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of vertices
        System.out.print("Enter number of vertices: ");
        int n = scanner.nextInt();

        int[][] graph = new int[n][n];

        // Input adjacency matrix
        System.out.println("Enter the adjacency matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        // Input source and destination
        System.out.print("Enter source vertex (0 to " + (n - 1) + "): ");
        int source = scanner.nextInt();

        System.out.print("Enter destination vertex (0 to " + (n - 1) + "): ");
        int destination = scanner.nextInt();

        visited = new boolean[n];

        // Call DFS
        boolean found = dfs(graph, source, destination);

        if (found) {
            System.out.println("Path from " + source + " to " + destination + ": " + path);
        } else {
            System.out.println("No path found from " + source + " to " + destination);
        }

        scanner.close();
    }
}


/*
Sample Input:
Enter number of vertices: 4
Enter the adjacency matrix:
0 1 0 0
1 0 1 1
0 1 0 1
0 1 1 0
Enter source vertex (0 to 3): 0
Enter destination vertex (0 to 3): 3

Sample Output:
Path from 0 to 3: [0, 1, 2, 3]
*/