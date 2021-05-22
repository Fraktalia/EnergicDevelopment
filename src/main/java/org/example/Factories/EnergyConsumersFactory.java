package org.example.Factories;

import org.example.EnergyConsumers.EnergyConsumer;
import org.example.EnergyConsumers.NewYork;
import org.example.EnergyConsumers.Poland;
import org.example.EnergyConsumers.World;
import org.example.Mines.*;

public class EnergyConsumersFactory {

    public EnergyConsumer getEnergyConsumer(String energyConsumerName){
        switch (energyConsumerName){
            case "Poland":
                return new Poland();
            case "NewYork":
                return new NewYork();
            case "World":
                return new World();
        } return new Poland();
    }

}
