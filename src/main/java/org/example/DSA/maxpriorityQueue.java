package org.example.DSA;

public class maxpriorityQueue {
    private Integer[] heap;
    private int n;

    public maxpriorityQueue(int n)
    {
        heap = new Integer[n+1];
        n = 0;
    }

    public boolean isEmpty()
    {
    return n==0;
    }
    public int size()
    {
        return n;
    }

    private void reArray(int a)
    {
        Integer [] temp = new Integer[2*a];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public void print ()
    {
        for (int x=1; x<=n; x++)
        {
            System.out.print(heap[x] + " ");

        }
    }

    public void insert (int val)
    {
        if (val == heap.length -1)
        {
           reArray(2*heap.length);
        }
        n++;
        heap[n] = val;
        swim(n);

    }

    private void swim(int k)
    {
        while (k >1 && heap[k/2] < heap[k])
        {
            int temp = heap[k];
            heap[k] = heap[k/2];
            heap[k/2] = temp;
            k = k/2; //we need to shift up till new value is inserted is at correct position
        }
    }

    public static void main(String[] args) {
        maxpriorityQueue maxpriorityQueue = new maxpriorityQueue(5);
        System.out.println(maxpriorityQueue.size());
        System.out.println(maxpriorityQueue.isEmpty());
        maxpriorityQueue.insert(4);
        maxpriorityQueue.insert(5);
        maxpriorityQueue.insert(2);
        maxpriorityQueue.insert(6);

        maxpriorityQueue.insert(1);

        maxpriorityQueue.insert(3);
        maxpriorityQueue.print();

    }
}
