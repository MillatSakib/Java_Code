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

public class BFSLevelAdjacencyMatrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number of nodes: ");
        int n = in.nextInt();

        int[][] adjMatrix = new int[n][n];

        System.out.println("Enter the adjacency matrix (0 or 1):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjMatrix[i][j] = in.nextInt();
            }
        }

        System.out.print("Enter source node: ");
        int source = in.nextInt();

        bfsWithLevels(adjMatrix, n, source);
    }

    static void bfsWithLevels(int[][] adjMatrix, int n, int source) {
        boolean[] visited = new boolean[n];
        int[] level = new int[n];

        Queue<Integer> q = new LinkedList<>();
        visited[source] = true;
        level[source] = 0;
        q.add(source);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.println("Node " + u + " is at level " + level[u]);

            for (int v = 0; v < n; v++) {
                if (adjMatrix[u][v] == 1 && !visited[v]) {
                    visited[v] = true;
                    level[v] = level[u] + 1;
                    q.add(v);
                }
            }
        }
    }
}

/*

Sample Input:
Enter number of nodes: 5
Enter the adjacency matrix (0 or 1):
0 1 1 0 0
1 0 0 1 0
1 0 0 0 1
0 1 0 0 0
0 0 1 0 0
Enter source node: 0

Sample Output:
Node 0 is at level 0
Node 1 is at level 1
Node 2 is at level 1
Node 3 is at level 2
Node 4 is at level 2


*/