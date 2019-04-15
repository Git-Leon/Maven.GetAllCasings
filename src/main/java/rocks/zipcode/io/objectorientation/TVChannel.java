package rocks.zipcode.io.objectorientation;

import java.util.Arrays;

public enum TVChannel {
    MSN,
    CNN,
    FOX,
    AE,
    MTV,
    BET,
    HBO,
    NBC,
    CBS;

    public static TVChannel getByOrdinal(int ordinal) {
        return Arrays.asList(TVChannel.values())
                .stream()
                .filter(val -> val.ordinal() == ordinal)
                .findFirst()
                .get();
    }
}
