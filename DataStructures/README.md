# Data Structures
Below is the documentation and the assumtions that have been made for the data structures included this directory.

## Min Heap
Uses an array to build a heap.

`2i + 1` = left child
`2i + 2` = right child

**Only holds integers**

**Keys cannot repeat.** The `insert()` function will return `false` if the key already exists and `true` otherwise.

**Assumes that the value `0` will not be inserted** by the user. This assumsion is powering the `insert()`. Every heap is initialized to `0` when it begins and `insert()` uses this to check for the next empty node and also to dynamically increases the size of the tree whenever needed.

## Node
## Class Variables and Member Functions
```
Node {
  String value;
  String key;

  void setValue(String v);
  void setKey(int k);
  String getValue();
  int getKey();
}
```

## Stack
