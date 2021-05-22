package org.example.Factories;

import org.example.EnergyPlants.*;

public class EnergyPlantsFactory {

    public EnergyPlant getEnergyPlant(String energyPlantName){
        switch (energyPlantName){
            case "anihilationPlant":
                return new AnihilationPlant();
            case "coalPlant":
                return new CoalPlant();
            case "fusionPlant":
                return new FusionPlant();
            case "nuclearPlant":
                return new NuclearPlant();
            case "solarPlant":
                return new SolarPlant();
        } return new AnihilationPlant();
    }
}
