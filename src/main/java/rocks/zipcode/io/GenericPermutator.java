package rocks.zipcode.io;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author leon on 10/01/2019.
 */
public class GenericPermutator<TypeOfSet> {
    protected final HashSet<Integer> originalSet;

    public GenericPermutator(Integer[] integers) {
        this.originalSet = new HashSet<>(Arrays.asList(integers));
    }
}
