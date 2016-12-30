import java.util.HashSet;
import java.lang.System;

public class Solution4 {
  public static class Node {
    int value;
    Node next;
  }

  public static Node deleteDuplicates(Node n) {
    if (n == null)
      return n;
    
    HashSet<Integer> set = new HashSet<Integer>();
    set.add(n.value);
    for (Node p = n; p.next != null; p = p.next) {
      if (set.contains(p.next.value))
        p.next = p.next.next;
      else
        set.add(p.next.value);
    }
    return n;
  }

  public static void printNode(Node n) {
    for (Node p = n; p != null; p = p.next)
      System.out.print(p.value + " ");
    System.out.println(); 
  }

  public static void main(String... args) {
    Node a1 = new Node();
    Node a2 = new Node();
    Node a3 = new Node();
    
    a1.value = 3;
    a1.next = a2;
    a2.value = 2;
    a2.next = a3;
    a3.value = 5;
  	printNode(a1);
    deleteDuplicates(a1);
    printNode(a1);

    Node b1 = new Node();
    Node b2 = new Node();
    Node b3 = new Node();
    Node b4 = new Node();

    b1.value = 1;
    b1.next = b2;
    b2.value = 2;
    b2.next = b3;
    b3.value = 1;
    b3.next = b4;
    b4.value = 3;
    printNode(b1);
    deleteDuplicates(b1);
    printNode(b1);

    Node c = null;
    deleteDuplicates(c);
    printNode(c);
  }
}
