package DataStructures;

import java.lang.reflect.Array;

import javax.management.RuntimeErrorException;

public class Queue {
  private int[] items;
  private int item_count;

  public Queue() {
    this(10);
  }

  public Queue(int size) {
    this.items = new int[size];
    this.item_count = 0;
  }

  public boolean insert(int x) {
    if (this.item_count >= this.items.length)
      return false;
    this.items[item_count++] = x;
    return true;
  }

  public int remove() {
    if (item_count == 0) {
      Error e = new Error("Trying to access empty queue.");
      throw new RuntimeErrorException(e);
    }
    else {
      int head = this.items[0];
      this.item_count--;
      for (int i = 0; i < this.items.length - 1; i++)
        this.items[i] = this.items[i + 1];
      return head;
    }
  }
}

