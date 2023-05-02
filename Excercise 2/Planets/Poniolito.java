package Planets;

import Explorers.Explorer;

public class Poniolito implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
