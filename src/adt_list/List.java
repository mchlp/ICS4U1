package adt_list;

public class List implements ListIntADT {
    private class Element {
        int value;
        Element next;
    }

    private Element first;

    private Element getElement(int i) {
        Element target = first;
        while (target != null) {
            if (i == 0) return target;
            i--;
            target = target.next;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public int get(int i) {
        return getElement(i).value
    }

    @Override
    public void insert(int i, int j) {
        Element element = new Element();
        element.value = j;

        if (i == 0) {
            element.next = first;
            first = element;
        } else {
            Element target = getElement(i - 1);

            element.next = target.next;
            target.next = element;
        }
    }

    @Override
    public void remove(int i) {
        Element target = first;
        Element prev = null;
        while (target != null) {
            if (target.value == i) {
                prev.next = target.next;
                return;
            }
            prev = target;
            target = target.next;
        }
    }

    @Override
    public void removeAt(int i) {
        if (i == 0) {
            first = first.next;
        } else {
            Element target = getElement(i - 1);
            if (target.next == null) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                target.next = target.next.next;
            }
        }
    }

    @Override
    public void replace(int i, int j) {
        getElement(i).value = j;
    }

    @Override
    public int size() {
        int i = 0;

        Element target = first;
        while (target != null) {
            target = target.next;
            i ++;
        }

        return i;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
