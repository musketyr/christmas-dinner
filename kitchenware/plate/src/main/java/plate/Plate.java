package plate;

import tableware.Tableware;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Plate implements Tableware {

    private final List<Object> content = new ArrayList<>();

    @Override
    public void add(Object toBeServed) {
        content.add(toBeServed);
    }

    @Override
    public String toString() {
        return "plate with " + content.stream().map(Object::toString).collect(Collectors.joining(", "));
    }

}
