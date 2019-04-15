package rocks.zipcode.io;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class GenericUtils {
    public static  <T> T[] toArray(Collection<T> set) {
        List<T> list = new ArrayList<>(set);
        T[] toR = (T[]) new Object[set.size()];
        for (int i = 0; i < list.size(); i++) {
            toR[i] = list.get(i);
        }
        return toR;
    }
}
