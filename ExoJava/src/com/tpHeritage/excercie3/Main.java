package com.tpHeritage.excercie3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Building> list = Arrays.asList(
                new Villa("Pedro0", "1 street of NoWhere", 20.0, 2, Boolean.FALSE),
                new Company("Charles0", "42 avenue Bloody Mary", 42.0, "42 School", 2, 4.0),
                new Villa("Pedro1", "2 street of NoWhere", 211.0, 4, Boolean.TRUE),
                new Company("Charles1", "43 avenue Bloody Mary", 42.0, "43 School", 1, 34.0),
                new Villa("Pedro2", "3 street of NoWhere", 10.2, 1, Boolean.FALSE),
                new Company("Charles2", "44 avenue Bloody Mary", 4.0, "44 School", 1, 41.0),
                new Villa("Pedro3", "4 street of NoWhere", 203.0, 6, Boolean.FALSE),
                new Company("Charles3", "45 avenue Bloody Mary", 422.0, "45 School", 12, 32.0),
                new Villa("Pedro4", "5 street of NoWhere", 2.04, 1, Boolean.TRUE),
                new Company("Charles4", "46 avenue Bloody Mary", 423.0, "46 School", 52, 90.7),
                new Villa("Pedro5", "6 street of NoWhere", 51.5, 4, Boolean.FALSE),
                new Company("Charles5", "47 avenue Bloody Mary", 42.42, "47 School", 4, 1.5)
        );

        double totalArea =  list.stream().mapToDouble(Building::getArea).sum();
        System.out.println("Total Area for all buildings : " + totalArea);
        double totalTax = list.stream().mapToDouble(Building::tax).sum();
        System.out.println("Total taxes for all buildings : " + totalTax);
        int totalSwimmingPool = Math.toIntExact(list.stream()
                .filter(building -> building instanceof Villa)
                .filter(building -> ((Villa) building).getSwimmingPool()).count());
        System.out.println("Total swimming pools for all buildings : " + totalSwimmingPool);

        System.out.println("Printing buildings in Area's order:");
        list.stream().sorted(Comparator.comparing(Building::getArea)).forEach(Building::print);
        System.out.println("Printing buildings in Owner's order");
        list.stream().sorted(Comparator.comparing(Building::getOwner)).forEach(Building::print);
    }
}
