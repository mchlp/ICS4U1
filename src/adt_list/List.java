package adt_list;

public class List implements ListIntADT {

    private Element firstElement;

    private Element getElement(int i) {
        Element target = firstElement;
        for (int c=0; c<i; c++) {
            target = target.next;
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
        }
        return target;
    }

    @Override
    public int get(int i) {
        return getElement(i).value;
    }

    @Override
    public void insert(int i, int j) {
        Element element = new Element();
        element.value = j;

        if (i == 0) {
            element.next = firstElement;
            firstElement = element;
        } else {
            Element before = getElement(i - 1);
            element.next = before.next;
            before.next = element;
        }
    }

    @Override
    public void remove(int i) {
        Element remove = firstElement;
        Element prev = null;
        while (remove != null) {
            if (remove.value == i) {
                prev.next = remove.next;
                return;
            }
            prev = remove;
            remove = remove.next;
        }
    }

    @Override
    public void removeAt(int i) {
        if (i == 0) {
            firstElement = firstElement.next;
        } else {
            Element before = getElement(i - 1);
            if (before.next == null) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                before.next = before.next.next;
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

        Element target = firstElement;
        while (target != null) {
            target = target.next;
            i++;
        }
        return i;
    }

    @Override
    public boolean isEmpty() {
        return firstElement == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
