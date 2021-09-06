package tableware;

import java.util.ServiceLoader;
import java.util.stream.StreamSupport;

public class TablewareContainer {

    public static Tableware currentTableware() {
        return StreamSupport.stream(ServiceLoader.load(Tableware.class).spliterator(), false).findFirst().orElse(new Tableware() { });
    }
}
