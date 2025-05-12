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

// Class representing an edge in the graph
class Edge implements Comparable<Edge> {
    int src, dest, wt;

    public Edge(int src, int dest, int wt) {
        this.src = src;
        this.dest = dest;
        this.wt = wt;
    }

    // For sorting edges by weight
    @Override
    public int compareTo(Edge other) {
        return this.wt - other.wt;
    }
}

public class KruskalMST {
    int[] parent, rank;
    int v; // Number of vertices

    public KruskalMST(int v) {
        this.v = v;
        parent = new int[v];
        rank = new int[v];
        for (int i = 0; i < v; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    // Find the root of a set
    int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]); // Path compression
        return parent[x];
    }

    // Union of two sets
    void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        if (xRoot == yRoot) return;

        // Union by rank
        if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
        } else if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot;
        } else {
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
    }

    // Kruskal's algorithm to compute MST weight and print the MST edges
    int kruskal(Edge[] edges) {
        Arrays.sort(edges); // Sort edges by weight

        int result = 0;
        int edgeCount = 0;
        System.out.println("Edges in the MST:");

        for (int i = 0; i < edges.length && edgeCount < v - 1; i++) {
            Edge e = edges[i];
            int x = find(e.src);
            int y = find(e.dest);

            if (x != y) {
                result += e.wt;
                union(x, y);
                edgeCount++;
                System.out.println(e.src + " - " + e.dest + " with weight " + e.wt);
            }
        }
        return result;
    }

    // Example usage
    public static void main(String[] args) {
        int v = 4; // Number of vertices
        Edge[] edges = {
            new Edge(0, 1, 10),
            new Edge(0, 2, 6),
            new Edge(0, 3, 5),
            new Edge(1, 3, 15),
            new Edge(2, 3, 4)
        };

        KruskalMST graph = new KruskalMST(v);
        int mstWeight = graph.kruskal(edges);
        System.out.println("Weight of MST is " + mstWeight);
    }
}