package deque;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Comparator;

public class MaxTest {

    @Test
    public void testMaxWithDefaultComparator() {
        // Comparator for integers
        Comparator<Integer> intComparator = Integer::compare;

        // Create a MaxArrayDeque with the comparator
        MaxArrayDeque<Integer> mad = new MaxArrayDeque<>(intComparator);

        // Add elements
        mad.addLast(10);
        mad.addLast(30);
        mad.addLast(20);

        // Test max() with default comparator
        assertEquals(Integer.valueOf(30), mad.max()); // 30 should be the max
    }

    @Test
    public void testMaxWithCustomComparator() {
        // Custom comparator for finding the smallest element (reverse logic)
        Comparator<Integer> reverseComparator = (a, b) -> b - a;

        // Create a MaxArrayDeque with a default comparator
        Comparator<Integer> intComparator = Integer::compare;
        MaxArrayDeque<Integer> mad = new MaxArrayDeque<>(intComparator);

        // Add elements
        mad.addLast(10);
        mad.addLast(30);
        mad.addLast(20);

        // Test max() with the custom comparator
        assertEquals(Integer.valueOf(10), mad.max(reverseComparator)); // 10 is the smallest
    }

    @Test
    public void testMaxOnEmptyDeque() {
        // Comparator for integers
        Comparator<Integer> intComparator = Integer::compare;

        // Create an empty MaxArrayDeque
        MaxArrayDeque<Integer> mad = new MaxArrayDeque<>(intComparator);

        // Test max() on an empty deque
        assertNull(mad.max());
        assertNull(mad.max(intComparator));
    }

    @Test
    public void testMaxOnSingleElement() {
        // Comparator for integers
        Comparator<Integer> intComparator = Integer::compare;

        // Create a MaxArrayDeque and add one element
        MaxArrayDeque<Integer> mad = new MaxArrayDeque<>(intComparator);
        mad.addLast(42);

        // Test max() on a deque with one element
        assertEquals(Integer.valueOf(42), mad.max());
    }
}