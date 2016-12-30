---
layout: post
title: 4. Write code to remove duplicates from an unsorted linked list.
date: 2016-12-29
---
### Tests

```markdown
a1 = {3, 5, 2};
b1 = {1, 2, 3, 1};
c = null
```

### Solution

```markdown
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
```
