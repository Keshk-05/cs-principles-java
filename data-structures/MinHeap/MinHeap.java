/**
 * A min heap data structure
 * that holds integers
 */
public class MinHeap {
  private int heap[];

  MinHeap() { // Default constructor
    /**
    * Default heap can hold 50 elements
    */
    heap = new int[50];
  }

  MinHeap(int size) { // Takes in size and deines a heap that can hold that many elements
    heap = new int[size];
  }

  public void print() {
    for (int val : this.heap ) {
      if (val != 0) {
        System.out.println(val + " ");
      }
    }
  }

  public boolean insert(int key) {
    int index = 0;
    boolean inserted = false;

    while (index < this.heap.length && this.heap[index] != 0) { // Loop through the array/tree until you reach an empty spot or run out of space
      if (this.heap[index] == key) { // If the key already exists
        return inserted;
      }
      index++;
    }

    if (index >= this.heap.length) { // If we hit this, this means we need more space. So make more space.
      int newHeap[] = new int[this.heap.length + 50]; // Create an array with 50 more elements
      for (int i = 0; i < this.heap.length; i++) {
        newHeap[i] = this.heap[i]; // Copy over the old array to the new one
      }
      this.heap = newHeap; // Set the new, bigger array as the new heap
    }

    this.heap[index] = key;
    this.heapify();
    inserted = true;
    return inserted;
  }

  public boolean delete(int key) {
    return true;
  }

  public void heapify() {
    int i = 0;
    // int index = 0;
    while (i < this.heap.length - 1 && this.heap[i] != 0) {
      // index = i; // Get the very last FILLED index of the array
      i++;
    }
    boolean swap = true; // Used to see if any swaps took place
    while (index != 0 && swap) { // Continue until we have passed the 0 index
      int nodeIndex = 0;
      if (index % 2 == 0) { // Check if the index is even. Even index = right child
        nodeIndex = (index - 2) / 2;
      } else { // Left child (odd index)
        nodeIndex = (index - 1) / 2;
      }

      if (heap[index] != 0) {
        if (heap[nodeIndex] > heap[index]) { // If nodes don't follow the heap property
          int hold = this.heap[nodeIndex];
          heap[nodeIndex] = heap[index];
          this.heap[index] = hold;
        } else {
          swap = false;
        }
      }
      index = nodeIndex;
    }
  }
}