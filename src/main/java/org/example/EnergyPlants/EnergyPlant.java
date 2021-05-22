package org.example.EnergyPlants;

import org.example.ResourceStorage;

public abstract class EnergyPlant {

    protected ResourceStorage resourceStorage;

    public EnergyPlant() {
        this.resourceStorage = ResourceStorage.INSTANCE.getInstance();
    }

    public abstract void produceEnergy();

}
