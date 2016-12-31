import java.lang.System;

public class Solution5 {
  public static class Node {
    int value;
    Node next;
  }

  public static Node getKthToLast(Node n, int k) {
    int length = 0;
    Node p = new Node();
    for (p = n; p != null; p = p.next)
      length++;
    if (length < k)
      return null;
    Node q = n;
    for (int i = 0; i < k; i++)
      q = q.next;
    for (p = n; q != null; p = p.next)
      q = q.next;
    return p;
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
    System.out.println(getKthToLast(a1, 2).value);

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
    System.out.println(getKthToLast(b1, 3).value);
    System.out.println(getKthToLast(b1, 5) == null);
  }
}
