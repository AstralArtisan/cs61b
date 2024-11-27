package deque;

import java.util.Comparator;

public class MaxArrayDeque<T> extends ArrayDeque<T> {
    private Comparator<T> cmpt;

    /** Creates a MaxArrayDeque with the given Comparator.*/
    public MaxArrayDeque(Comparator<T> c) {
        super();
        cmpt = c;
    }

    /** Returns the maximum element in the deque as governed by the previously given Comparator.
     *  If the MaxArrayDeque is empty, simply return null.*/
    public T max() {
        if (isEmpty()) {
            return null;
        }
        return findMax(cmpt);
    }

    /** Returns the maximum element in the deque as governed by the parameter Comparator c.
     *  If the MaxArrayDeque is empty, simply return null.*/
    public T max(Comparator<T> c) {
        if (isEmpty()) {
            return null;
        }
        return findMax(c);
    }

    /** Helper method to find the maximum element using the given Comparator. */
    private T findMax(Comparator<T> c) {
        T maxItem = get(0);
        for (int i = 1; i < size(); i++) {
            if (c.compare(get(i), maxItem) > 0) {
                maxItem = get(i);
            }
        }
        return maxItem;
    }
}
