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

 
public class CycleDetectionUsingBFS { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Please enter number of vertices: "); 
        int vertex = sc.nextInt(); 
        int Graph[][] = new int[vertex][vertex]; 
        System.out.print("Please enter number of edges: "); 
        int edges = sc.nextInt(); 
        int src, dest; 
        System.out.println("Please enter the edges (source and destination): "); 
        for (int i = 0; i < edges; i++) { 
            src = sc.nextInt(); 
            dest = sc.nextInt(); 
            Graph[src][dest] = 1; 
            Graph[dest][src] = 1; 
        } 
        int queue[] = new int[vertex]; 
        int front = 0, rear = 0; 
        boolean visited[] = new boolean[vertex]; 
        int parent[] = new int[vertex]; 
        Arrays.fill(visited, false); 
        Arrays.fill(parent, -1); 
        System.out.print("Please enter the start vertex: "); 
        int start = sc.nextInt(); 
        boolean Cycle = false; 
        visited[start] = true; 
        queue[rear] = start; 
        rear++; 
        while (front < rear) { 
            int current = queue[front]; 
            front++; 
            for (int i = 0; i < vertex; i++) { 
                if (Graph[current][i] == 1) { 
                    if (!visited[i]) { 
                        visited[i] = true; 
                        queue[rear] = i; 
                        rear++; 
                        parent[i] = current; 
                    } else if (parent[current] != i) { 
                        Cycle = true; 
                        break; 
                    } 
                } 
            } 
            if (Cycle) { 
                break; 
            } 
        } 
        if (Cycle) { 
            System.out.println("Cycle detected in the graph."); 
        } else { 
            System.out.println("No cycle detected in the graph."); 
        } 
    } 
} 

/*
Sample Input:
5
6
0 1
0 2
1 4
1 3
2 3
3 4
0

Sample Output:
Cycle Detected in the graph
*/