package rocks.zipcode.io.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionUtils {
    public static List<?> toList(Collection collection) {
        List<?> list = new ArrayList<>();
        list.addAll(collection);
        return list;
    }

    public static Boolean contains(Collection<? extends Collection<?>> nestedCollection, Collection<?> collection) {
        for(Collection<?> subCollection : nestedCollection) {
            if(subCollection.containsAll(collection)) {
                return true;
            }
        }
        return false;
    }

    public static Collection<? extends Collection<?>> nest(Collection<?>... collections) {
        return Arrays.asList(collections);
    }

    public static Collection<?> flatten(Collection<?>... collections) {
        return null;
    }
}
