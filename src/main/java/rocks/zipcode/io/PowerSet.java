package rocks.zipcode.io;

import java.util.*;

/**
 * @author leon on 10/01/2019.
 */
public class PowerSet<TypeOfSet> {
    protected final LinkedHashSet<TypeOfSet> originalSet;

    public PowerSet(TypeOfSet[] typeOfSet) {
        this.originalSet = new LinkedHashSet<>(Arrays.asList(typeOfSet));
    }

    public Set<Set<TypeOfSet>> permute() {
        Set<Set<TypeOfSet>> sets = new LinkedHashSet<>();
        if (originalSet.isEmpty()) {
            sets.add(new LinkedHashSet<>());
            return sets;
        }
        List<TypeOfSet> list = new ArrayList<>(originalSet);
        TypeOfSet head = list.get(0);
        Set<TypeOfSet> rest = new LinkedHashSet<>(list.subList(1, list.size()));
        TypeOfSet[] arr = GenericUtils.toArray(rest);
        for (Set<TypeOfSet> set : new PowerSet<>(arr).permute()) {
            Set<TypeOfSet> newSet = new LinkedHashSet<>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }

    public Set<TypeOfSet> getOriginalSet() {
        return originalSet;
    }
}
