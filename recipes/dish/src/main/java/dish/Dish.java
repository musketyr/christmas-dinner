package dish;

import tableware.Tableware;

import java.util.Collection;
import java.util.Collections;

public interface Dish {

    default Collection<Tableware> serve() {
        return Collections.emptyList();
    };

}
