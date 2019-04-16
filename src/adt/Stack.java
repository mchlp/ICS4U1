package adt;

public class Stack implements StackIntADT {

    Element topElement;

    @Override
    public void push(int i) {
        if (topElement == null) {
            topElement = new Element();
            topElement.value = i;
        } else {
            Element newTop = new Element();
            newTop.value = i;
            newTop.next = topElement;
            topElement = newTop;
        }
    }

    @Override
    public int pop() {
        Element poppedElement = topElement;
        topElement = topElement.next;
        return poppedElement.value;
    }

    @Override
    public int peek() {
        return topElement.value;
    }

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            int sizeCount = 1;
            Element cur = topElement;
            while (cur.next != null) {
                cur = cur.next;
                sizeCount++;
            }
            return sizeCount;
        }
    }

    @Override
    public boolean isEmpty() {
        return topElement == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
