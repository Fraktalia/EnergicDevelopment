package org.example.EnergyConsumers;

import org.example.ResourceStorage;

public class NewYork extends EnergyConsumer{



    @Override
    public void consumeEnergy() {
        this.resourceStorage.changeEnergy(-10000);
    }
}
