package org.example.EnergyPlants;


public class FusionPlant extends EnergyPlant{

    @Override
    public void produceEnergy() {
        this.resourceStorage.changeFuel("helium", 1);
        this.resourceStorage.changeEnergy(20000);
    }
}
