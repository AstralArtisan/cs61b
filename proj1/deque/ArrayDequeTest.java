package deque;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayDequeTest {
        private ArrayDeque<Integer> deque = new ArrayDeque<>();

        @Test
        public void testAddFirst() {
            deque.addFirst(10);
            deque.addFirst(20);
            assertEquals(20, deque.get(0));
            assertEquals(10, deque.get(1));
            assertEquals(2, deque.size());
        }

        @Test
        public void testAddLast() {
            deque.addLast(30);
            deque.addLast(40);
            assertEquals(30, deque.get(0));
            assertEquals(40, deque.get(1));
            assertEquals(2, deque.size());
        }

        @Test
        public void testIsEmpty() {
            assertTrue(deque.isEmpty());
            deque.addFirst(50);
            assertFalse(deque.isEmpty());
        }

        @Test
        public void testSize() {
            assertEquals(0, deque.size());
            deque.addFirst(60);
            deque.addLast(70);
            assertEquals(2, deque.size());
        }

        @Test
        public void testRemoveFirst() {
            deque.addLast(80);
            deque.addLast(90);
            assertEquals(80, deque.removeFirst());
            assertEquals(1, deque.size());
            assertEquals(90, deque.removeFirst());
            assertTrue(deque.isEmpty());
        }

        @Test
        public void testRemoveLast() {
            deque.addFirst(100);
            deque.addFirst(110);
            assertEquals(100, deque.removeLast());
            assertEquals(1, deque.size());
            assertEquals(110, deque.removeLast());
            assertTrue(deque.isEmpty());
        }

        @Test
        public void testGet() {
            deque.addFirst(120);
            deque.addLast(130);
            assertEquals(120, deque.get(0));
            assertEquals(130, deque.get(1));
        }

        @Test
        public void testPrintDeque() {
            deque.addFirst(140);
            deque.addLast(150);
            // This test assumes printDeque prints items in the order they are in the deque
            // You can capture System.out and verify the output if necessary
            deque.printDeque();
        }
    }

