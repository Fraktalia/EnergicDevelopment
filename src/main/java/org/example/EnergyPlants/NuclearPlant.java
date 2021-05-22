package org.example.EnergyPlants;


public class NuclearPlant extends EnergyPlant{

    @Override
    public void produceEnergy() {
        this.resourceStorage.changeFuel("uranium", -1);
        this.resourceStorage.changeEnergy(10000);
    }
}
