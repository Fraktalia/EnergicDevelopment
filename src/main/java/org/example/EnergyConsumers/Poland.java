package org.example.EnergyConsumers;

import org.example.ResourceStorage;

public class Poland extends EnergyConsumer{



    @Override
    public void consumeEnergy() {
        this.resourceStorage.changeEnergy(-40000);
    }
}
