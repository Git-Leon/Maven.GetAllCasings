package rocks.zipcode.io;

import java.util.*;

/**
 * @author leon on 10/01/2019.
 */
public class GenericPermutator<TypeOfSet> {
    protected final HashSet<TypeOfSet> originalSet;

    public GenericPermutator(TypeOfSet[] typeOfSets) {
        this.originalSet = new HashSet<>(Arrays.asList(typeOfSets));
    }

    public Set<Set<TypeOfSet>> permute() {
        Set<Set<TypeOfSet>> sets = new HashSet<>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<>());
            return sets;
        }
        List<TypeOfSet> list = new ArrayList<>(originalSet);
        TypeOfSet head = list.get(0);
        Set<TypeOfSet> rest = new HashSet<>(list.subList(1, list.size()));
        TypeOfSet[] arr = GenericUtils.toArray(rest);
        for (Set<TypeOfSet> set : new GenericPermutator<>(arr).permute()) {
            Set<TypeOfSet> newSet = new HashSet<>();
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
