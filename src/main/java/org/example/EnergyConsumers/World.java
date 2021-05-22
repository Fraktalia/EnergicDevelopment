package org.example.EnergyConsumers;

import org.example.ResourceStorage;

public class World extends EnergyConsumer{

    @Override
    public void consumeEnergy() {
        this.resourceStorage.changeEnergy(-6000000);
    }
}
