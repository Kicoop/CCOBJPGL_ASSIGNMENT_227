package Planets;

import Explorers.Explorer;

public class Elizarito implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
