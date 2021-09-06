package cutlery;

import java.util.Collection;
import java.util.ServiceLoader;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class CutleryService {

    public static Collection<Cutlery> currentCutlery() {
        return StreamSupport.stream(ServiceLoader.load(Cutlery.class).spliterator(), false).collect(Collectors.toList());
    }

}
