package org.example.EnergyPlants;


public class SolarPlant extends EnergyPlant{

    @Override
    public void produceEnergy() {
        this.resourceStorage.changeEnergy(2);
    }
}
