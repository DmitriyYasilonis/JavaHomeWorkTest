package jUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import OOPHomeTask3.Task3.MyLinkedList;

import static org.junit.Assert.*;

public class MyLinkedListTest {
    private MyLinkedList<String> elements = new MyLinkedList<>();
    private MyLinkedList<Integer> elemebtsInt = new MyLinkedList<>();

    @Before
    public void setup() {
        elements.add("1");
        elements.add("2");
        elements.add("3");
        elements.add("4");
        elements.add("5");
    }

    @Test
    public void add() {
        assertEquals("1,2,3,4,5", elements.toString());
        int[] testIntArray = {1, 2, 3, 4, 5};
    }

    @Test
    public void remove() {
        elements.remove(3);
        assertEquals("1,2,3,5", elements.toString());
    }

    @Test
    public void get() {
        assertEquals("4", elements.get(3));
    }
}
