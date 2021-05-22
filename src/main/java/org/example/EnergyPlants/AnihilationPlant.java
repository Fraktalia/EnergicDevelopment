package org.example.EnergyPlants;


public class AnihilationPlant extends EnergyPlant {

    @Override
    public void produceEnergy() {
        this.resourceStorage.changeFuel("antimater", -1);
        this.resourceStorage.changeEnergy(25000);
    }
}
