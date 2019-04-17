package adt;

public class Queue implements QueueIntADT {

    Element backElement;

    @Override
    public void enqueue(int num) {
        Element newElement = new Element();
        newElement.value = num;

        if (backElement != null) {
            newElement.next = backElement;
        }

        backElement = newElement;
    }

    @Override
    public int dequeue() {
        Element popElement = backElement;
        backElement = backElement.next;
        return popElement.value;
    }

    @Override
    public int peek() {
        return backElement.value;
    }

    @Override
    public int size() {
        if (backElement == null) {
            return 0;
        } else {
            int sizeCount = 1;
            Element cur = backElement;
            while (cur.next != null) {
                cur = cur.next;
                sizeCount++;
            }
            return sizeCount;
        }
    }

    @Override
    public boolean isEmpty() {
        return backElement == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
