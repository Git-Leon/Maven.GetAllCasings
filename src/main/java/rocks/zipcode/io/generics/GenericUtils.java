package rocks.zipcode.io.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericUtils {
    public static  <T> T[] toArray(Collection<T> collection) {
        List<T> list = new ArrayList<>(collection);
        T[] toR = (T[]) new Object[collection.size()];
        for (int i = 0; i < list.size(); i++) {
            toR[i] = list.get(i);
        }
        return toR;
    }
}
