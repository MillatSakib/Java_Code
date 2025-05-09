package Algorithm.Graph;

import java.util.*;


/*
1. At first insert the first node in queue.
2. Then we have to dequque the front element.
3. Then we have to visit that node which are connected with dequeued node and not
visited yet and we have to enqueue those element.
4. Step (2) & (3) will be continued until the queue will be empty.
*/

public class GraphTraversalUaingBFS {

    static int queue[] = new int[10];
    static int front = -1, rear = 1;

    public static void main(String[] Args) {
        adjList();
    }

    static void adjList() {
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[10][10];
        int node = 5, edege = 5;
        int visit[] = new int[10];
        int p1, p2;
        for (int i = 0; i < edege; i++) {
            p1 = (int) sc.next().charAt(0) - 'A';
            p2 = (int) sc.next().charAt(0) - 'A';
            mat[p1][p2] = 1;
            mat[p2][p1] = 1;

        }

        for (int i = 0; i < node; i++) {
            for (int j = 0; j < node; j++) {
                System.out.println(mat[i][j] + "");

            }
            System.out.println("");
        }

        int src = 7;
        enqueue(src);
        visit[src] = 1;
        while (front < rear) {
            int p = dequeue();
            System.out.println((char) (p + 'A') + "");
            for (int c = 0; c < node; c++) {
                if (mat[p][c] == 1 && visit[c] != 1) {
                    enqueue(c);
                    visit[c] = c;
                }
            }
        }

    }

    static void enqueue(int item) {
        queue[++rear] = item;

    }

    static int dequeue() {
        return queue[++front];
    }
}
