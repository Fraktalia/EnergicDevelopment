package org.example.Mines;

import org.example.ResourceStorage;

public class UraniumMine extends Mine{

    @Override
    public void produceFuel() {
        this.resourceStorage.changeFuel("uranium", 100);
    }
}
