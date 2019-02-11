package com.tp2.Exo2;

import java.util.HashSet;

public class MainHashCode {
    public static void main(String[] args) {
        Mark mark1 = new Mark(10.0f, "Java");
        Mark mark2 = new Mark(10.0f, "Java");

        if (mark1.equals(mark2))
            System.out.println("Mark1 == Mark2");
        else
            System.out.println("Mark1 != Mark2");

        if (mark1.hashCode() == mark2.hashCode())
            System.out.println("Mark1 Hashcode == Mark2 Hashcode");
        else
            System.out.println("Mark1 Hashcode != Mark2 Hashcode");

        HashSet<Mark> markHashSet = new HashSet<>();


        // Je n'ai rajouté que mark1, mais vu que le hashcode de mark1 et mark2 sont les mêmes,
        // Alors je ne peux pas rajouter mark2 au set. Car d'après son hash il existe déjà
        markHashSet.add(mark1);

        if (markHashSet.contains(mark1))
            System.out.println("Has Mark1");
        if (markHashSet.contains(mark2))
            System.out.println("Has Mark2 even if we never did 'markHashSet.add(mark2)'");

        // Si nous n'avions pas eu un override de la méthode clone, alors le hash aurait été différent.
        // Donc mark2 ne serait pas trouvé dans le hashset. Il aurait fallu le rajouter.
        // Il y a donc un rajout de donnée, bien que cette note existe déjà pour cette matière.


    }
}
