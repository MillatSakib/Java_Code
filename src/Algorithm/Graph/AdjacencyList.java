package Algorithm.Graph;

import java.util.Scanner;

class AdjList {
    int contentValue;
    AdjList next;

    public int getContentValue() {
        return contentValue;
    }

    public void setContentValue(int contentValue) {
        this.contentValue = contentValue;
    }

    public AdjList getNext() {
        return next;
    }

    public void setNext(AdjList next) {
        this.next = next;
    }
}

public class AdjacencyList {
    static AdjList[] prev = new AdjList[100];

    static void addEdge(AdjList[] listArr, char s, char des) {
        int u = s - 'A';
        int v = des - 'A';

        AdjList newNode = new AdjList();
        newNode.setContentValue(v);
        newNode.setNext(null);

        if (listArr[u] == null) {
            listArr[u] = newNode;
            prev[u] = newNode;
        } else {
            prev[u].setNext(newNode);
            prev[u] = newNode;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number of nodes (max 26 for A-Z): ");
        int arrlen = input.nextInt();

        AdjList[] listArr = new AdjList[arrlen];
        for (int i = 0; i < arrlen; i++) {
            listArr[i] = null;
            prev[i] = null;
        }
        
        
        addEdge(listArr, 'A', 'B');
        addEdge(listArr, 'A', 'C');
        addEdge(listArr, 'A', 'D');
        addEdge(listArr, 'A', 'E');
        
        
        
        for (int i = 0; i < arrlen; i++) {
            System.out.print((char) (i + 'A') + ": ");
            AdjList curr = listArr[i];
            while (curr != null) {
                System.out.print((char) (curr.getContentValue() + 'A') + " -> ");
                curr = curr.getNext();
            }
            System.out.println("null");
        }

        input.close();
    }
}
