package rocks.zipcode.io;

import java.util.*;

/**
 * @author leon on 10/01/2019.
 */
public class IntegerPermutator extends GenericPermutator<Integer> {
    public IntegerPermutator(Integer... integers) {
        super(integers);
    }

    @Override
    public Set<Set<Integer>> permute() {
        Set<Set<Integer>> sets = new HashSet<>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<>());
            return sets;
        }
        List<Integer> list = new ArrayList<>(originalSet);
        Integer head = list.get(0);
        Set<Integer> rest = new HashSet<>(list.subList(1, list.size()));
        for (Set<Integer> set : new IntegerPermutator(rest.toArray(new Integer[0])).permute()) {
            Set<Integer> newSet = new HashSet<>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }
}