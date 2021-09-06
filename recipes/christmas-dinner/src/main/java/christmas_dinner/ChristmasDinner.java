package christmas_dinner;

import breaded_carp.BreadedCarp;
import cutlery.CutleryService;
import dish.Dish;
import potato_salad_with_ham.PotatoSaladWithHam;
import tableware.Tableware;
import tableware.TablewareContainer;

import java.util.Collection;
import java.util.Collections;

public class ChristmasDinner implements Dish {

    @Override
    public Collection<Tableware> serve() {
        Tableware tableware = TablewareContainer.currentTableware();
        tableware.add(new PotatoSaladWithHam());
        tableware.add(new BreadedCarp());
        return Collections.singleton(tableware);
    }

    public static void main(String[] args) {
        ChristmasDinner dinner = new ChristmasDinner();
        System.out.println("Serving:");
        System.out.println(dinner.serve());
        System.out.println("Cutlery:");
        System.out.println(CutleryService.currentCutlery());
    }

}



