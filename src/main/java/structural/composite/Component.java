package structural.composite;

import java.util.Optional;

public interface Component {

    void rename(String name);
    void open();
    Optional<Component> findComponentByName(String nameFragment);

}
