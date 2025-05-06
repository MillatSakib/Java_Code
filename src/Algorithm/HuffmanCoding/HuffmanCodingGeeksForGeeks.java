/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm.HuffmanCoding;
import java.util.PriorityQueue;

/**
 *
 * @author Sakib
 */
public class HuffmanCodingGeeksForGeeks {
    class Node{
    char ch;
    int freq;
    Node left;
    Node right;
    Node(char c, int f, Node l, Node r){
    ch=c;
    freq=f;
    left=l;
    right=r;
    }
    }
    
    void printHCodes(char[] arr, int[] freq){
    PriorityQueue<Node> h = new PriorityQueue<>((n1, n2) -> n1.freq - n2.freq);
    for(int i=0;i<arr.length; i++){
    h.add(new Node(arr[i],freq[i],null,null));
    }
    while(h.size()>1){
    Node l=h.poll();
    Node r = h.poll();
    h.add(new Node('$',l.freq+r.freq,l,r));
    }
    printRec(h.peek(),"");
    }
    
    void printRec(Node root, String s){
    if (root.left == null && root.right == null) {
            System.out.println(root.ch + ": " + s);
            return;
        }
    printRec(root.left,s+"0");
    printRec(root.right,s+"1");
    }
    
     public static void main(String[] args) {
        HuffmanCodingGeeksForGeeks huff = new HuffmanCodingGeeksForGeeks();
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] freqs = {5, 9, 12, 13, 16, 45};
        huff.printHCodes(chars, freqs);
    }
}
