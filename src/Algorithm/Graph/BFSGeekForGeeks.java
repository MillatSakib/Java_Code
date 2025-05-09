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
public class BFSGeekForGeeks {

    public static void main(String[] Args) {
        int v;
        int Edge;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number of Node: ");
        v = in.nextInt();
        System.out.println("Please enter the number of Edge: ");
        Edge = in.nextInt();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < Edge; i++) {
            System.out.println("For Edege "+i);
            System.out.println("Please enter the source Node: ");
            int src = in.nextInt();
            System.out.println("Please enter the destination Node: ");
            int dest = in.nextInt();
            adj.get(src).add(dest);
            adj.get(dest).add(src);
        }
        new BFSGeekForGeeks().BFSDis(adj, v);
    }

    
    
    void BFS(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {

        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while (q.isEmpty() == false) {
            int u = q.poll();
            System.out.println(u + " ");
            for (int v : adj.get(u)) {
                if (visited[v] == false) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }

    
    
    void BFSDis(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v + 1];
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                BFS(adj, i, visited);
            }
        }
    }
}


/*
Sample Input:
5
4
0 1
0 2
1 3
2 4

Sample Output:
0 1 2 3 4
*/