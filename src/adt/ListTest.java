package adt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ListTest {

    @Test
    void get() {
        List list = new List();
        list.insert(0, 123);
        list.insert(1, 5456);
        list.insert(2, -12);
        list.insert(3, 81);
        list.insert(4, 0);
        list.insert(5, 1);
        list.insert(6, 51);

        assertEquals(123, list.get(0));
        assertEquals(5456, list.get(1));
        assertEquals(-12, list.get(2));
        assertEquals(81, list.get(3));
        assertEquals(0, list.get(4));
        assertEquals(1, list.get(5));
        assertEquals(51, list.get(6));

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(7);
        });
    }

    @Test
    void insert() {
        List list = new List();
        list.insert(0, 123);
        list.insert(1, 5456);
        list.insert(2, -12);
        list.insert(3, 81);
        list.insert(4, 0);
        list.insert(5, 1);
        list.insert(6, 51);
        list.insert(2, 541);
        list.insert(3, 854);
        list.insert(4, 12);
        list.insert(9, 13);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.insert(21, 123);
        });

        assertEquals(123, list.get(0));
        assertEquals(5456, list.get(1));
        assertEquals(541, list.get(2));
        assertEquals(854, list.get(3));
        assertEquals(12, list.get(4));
        assertEquals(-12, list.get(5));
        assertEquals(81, list.get(6));
        assertEquals(0, list.get(7));
        assertEquals(1, list.get(8));
        assertEquals(13, list.get(9));
        assertEquals(51, list.get(10));
    }

    @Test
    void remove() {
        List list = new List();
        list.insert(0, 123);
        list.insert(1, 5456);
        list.insert(2, -12);
        list.insert(3, 81);
        list.insert(4, 0);
        list.insert(5, 1);
        list.insert(6, 51);

        list.remove(1231);
        list.remove(81);

        assertEquals(123, list.get(0));
        assertEquals(5456, list.get(1));
        assertEquals(-12, list.get(2));
        assertEquals(0, list.get(3));
        assertEquals(1, list.get(4));
        assertEquals(51, list.get(5));
    }

    @Test
    void removeAt() {
        List list = new List();
        list.insert(0, 123);
        list.insert(1, 5456);
        list.insert(2, -12);
        list.insert(3, 81);
        list.insert(4, 0);
        list.insert(5, 1);
        list.insert(6, 51);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.removeAt(21);
        });

        list.removeAt(4);
        assertEquals(123, list.get(0));
        assertEquals(5456, list.get(1));
        assertEquals(-12, list.get(2));
        assertEquals(81, list.get(3));
        assertEquals(1, list.get(4));
        assertEquals(51, list.get(5));
    }

    @Test
    void replace() {
        List list = new List();
        list.insert(0, 123);
        list.insert(1, 5456);
        list.insert(2, -12);
        list.insert(3, 81);
        list.insert(4, 0);
        list.insert(5, 1);
        list.insert(6, 51);

        list.replace(1, 54);
        list.replace(5, 121);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.replace(21, 7);
        });

        assertEquals(123, list.get(0));
        assertEquals(54, list.get(1));
        assertEquals(-12, list.get(2));
        assertEquals(81, list.get(3));
        assertEquals(0, list.get(4));
        assertEquals(121, list.get(5));
        assertEquals(51, list.get(6));
    }

    @Test
    void size() {
        List list = new List();

        assertEquals(0, list.size());

        list.insert(0, 123);
        list.insert(1, 5456);
        list.insert(2, -12);
        list.insert(3, 81);
        list.insert(4, 0);
        list.insert(5, 1);
        list.insert(6, 51);

        assertEquals(7, list.size());

        list.removeAt(0);

        assertEquals(6, list.size());


    }

    @Test
    void isEmpty() {
        List list = new List();

        assertEquals(true, list.isEmpty());

        list.insert(0, 123);
        list.insert(1, 5456);
        list.insert(2, -12);
        list.insert(3, 81);
        list.insert(4, 0);
        list.insert(5, 1);
        list.insert(6, 51);

        assertEquals(false, list.isEmpty());
    }

    @Test
    void isFull() {
        List list = new List();

        assertEquals(false, list.isFull());

        list.insert(0, 123);
        list.insert(1, 5456);
        list.insert(2, -12);
        list.insert(3, 81);
        list.insert(4, 0);
        list.insert(5, 1);
        list.insert(6, 51);

        assertEquals(false, list.isFull());
    }
}