package christmas_dinner;

import breaded_carp.BreadedCarp;
import dish.Dish;
import potato_salad_with_ham.PotatoSaladWithHam;
import tableware.Tableware;
import tableware.TablewareContainer;

public class ChristmasDinner implements Dish {

    @Override
    public void serve() {
        Tableware tableware = TablewareContainer.currentTableware();
        tableware.add(new PotatoSaladWithHam());
        tableware.add(new BreadedCarp());
    }
}



