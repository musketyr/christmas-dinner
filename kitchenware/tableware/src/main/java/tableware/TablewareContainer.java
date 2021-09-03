package tableware;

public class TablewareContainer {

    public static Tableware currentTableware() {
        return new Tableware() {
            @Override
            public void add(Object toBeServed) {
                // do nothing
            }
        };
    }
}
