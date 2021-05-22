package org.example.Mines;

import org.example.ResourceStorage;

public class MoonMine extends Mine{

    @Override
    public void produceFuel() {
        this.resourceStorage.changeFuel("helium", 10);
    }
}
