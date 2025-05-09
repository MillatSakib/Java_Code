/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm.Graph;

/**
 *
 * @author Sakib
 */





import java.util.Scanner;

public class BFSChatGPT {

    static int queue[] = new int[10];
    static int front = -1, rear = -1;

    public static void main(String[] args) {
        adjList();
    }

    static void adjList() {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[10][10];
        int node = 5, edge = 5;
        int visit[] = new int[10]; // 0 = WHITE, 1 = GRAY, 2 = BLACK
        int dist[] = new int[10];  // Distance array
        int prev[] = new int[10];  // Predecessor array

        // Initialize distance and predecessor arrays
        for (int i = 0; i < node; i++) {
            dist[i] = Integer.MAX_VALUE;
            prev[i] = -1;
        }

        // Graph Input
        for (int i = 0; i < edge; i++) {
            int p1 = sc.next().charAt(0) - 'A';
            int p2 = sc.next().charAt(0) - 'A';
            mat[p1][p2] = 1;
            mat[p2][p1] = 1;
        }

        // Print adjacency matrix
        for (int i = 0; i < node; i++) {
            for (int j = 0; j < node; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        // BFS Algorithm
        int src = 0; // Starting node (A = 0)
        enqueue(src);
        visit[src] = 1;  // GRAY
        dist[src] = 0;
        prev[src] = -1;

        while (front <= rear) {
            int u = dequeue();
            System.out.println((char) (u + 'A') + " ");
            
            for (int v = 0; v < node; v++) {
                if (mat[u][v] == 1 && visit[v] == 0) { // If WHITE
                    visit[v] = 1;  // GRAY
                    dist[v] = dist[u] + 1;
                    prev[v] = u;
                    enqueue(v);
                }
            }
            visit[u] = 2; // BLACK
        }
    }

    static void enqueue(int item) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        if (front == -1) front = 0;
        queue[++rear] = item;
    }

    static int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue[front++];
    }
}
