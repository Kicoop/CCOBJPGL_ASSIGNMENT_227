package Explorers;

import Planets.Mars;
import Planets.Planet;
import Planets.Mercury;
import Planets.Saturn;
import Planets.Poniolito;
import Planets.Elizarito;

public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Poniolito poniolito);

    void visit(Elizarito elizarito);

    void visit();
    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}
