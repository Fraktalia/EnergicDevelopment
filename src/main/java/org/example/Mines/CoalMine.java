package org.example.Mines;


public class CoalMine extends Mine{

    @Override
    public void produceFuel() {
        this.resourceStorage.changeFuel("coal", 40);
    }
}
