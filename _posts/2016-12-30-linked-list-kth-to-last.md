---
layout: post
title: 5. Implement an algorithm to find the kth to last element of a singly linked list.
date: 2016-12-30
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
```
