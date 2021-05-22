package org.example.EnergyConsumers;

import org.example.ResourceStorage;

public abstract class EnergyConsumer {

    protected ResourceStorage resourceStorage;

    public EnergyConsumer() {
        this.resourceStorage = ResourceStorage.INSTANCE.getInstance();
    }


    public abstract void consumeEnergy();

}

