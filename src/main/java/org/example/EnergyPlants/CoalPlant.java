package org.example.EnergyPlants;

public class CoalPlant extends EnergyPlant{

    @Override
    public void produceEnergy() {
        this.resourceStorage.changeFuel("coal", -100);
        this.resourceStorage.changeEnergy(7);
    }
}
