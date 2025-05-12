/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm.Graph;

import java.util.Scanner;

/**
 *
 * @author Sakib
 */

class GraphTraversalMatrix {

    public void DFSRec(int[][] adjMatrix, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");

        int numVertices = adjMatrix.length;
        for (int v = 0; v < numVertices; v++) {
            if (adjMatrix[s][v] == 1 && !visited[v]) {
                DFSRec(adjMatrix, v, visited);
            }
        }
    }

    public void DFS(int[][] adjMatrix, int startVertex) {
        int numVertices = adjMatrix.length;
        boolean[] visited = new boolean[numVertices];
        DFSRec(adjMatrix, startVertex, visited);
        System.out.println(); // Add a newline after traversal
    }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of vertices in the graph: ");
    int numVertices = scanner.nextInt();
    int[][] adjMatrix = new int[numVertices][numVertices];

    System.out.println("Enter the adjacency matrix (enter 1 if there's an edge, 0 otherwise):");

    scanner.nextLine(); // Consume leftover newline just once before the loop
    for (int i = 0; i < numVertices; i++) {
        String[] rowEntries = scanner.nextLine().trim().split(" ");
        for (int j = 0; j < numVertices; j++) {
            adjMatrix[i][j] = Integer.parseInt(rowEntries[j]);
        }
    }

    System.out.print("Enter the starting vertex for DFS: ");
    int startVertex = scanner.nextInt();

    System.out.println("Depth First Traversal (starting from vertex " + startVertex + "):");
    GraphTraversalMatrix gt = new GraphTraversalMatrix();
    gt.DFS(adjMatrix, startVertex);
    
    scanner.close();
}
}

/*
Sample Input:
Enter the number of vertices in the graph: 3
Enter the adjacency matrix (enter 1 if there's an edge, 0 otherwise):
0 1 0
1 1 1
1 0 0
Enter the starting vertex for DFS: 0

Sample Output:
Depth First Traversal (starting from vertex 0):
0 1 2


*/
