package rocks.zipcode.io.collections;

import java.util.Collection;

public class CollectionUtils {
    public static Boolean contains(Collection<? extends Collection<?>> nestedCollection, Collection<?> collection) {
        for(Collection<?> subCollection : nestedCollection) {
            if(subCollection.containsAll(collection)) {
                return true;
            }
        }
        return false;
    }
}
