package org.example;

import org.example.EnergyConsumers.EnergyConsumer;
import org.example.EnergyPlants.EnergyPlant;
import org.example.Factories.EnergyConsumersFactory;
import org.example.Factories.EnergyPlantsFactory;
import org.example.Factories.MinesFactory;
import org.example.Mines.Mine;

import java.util.ArrayList;

public class Test {
    private final ArrayList<EnergyPlant> energyPlantsArrayList;
    private final ArrayList<Mine> mineArrayList;
    private final ResourceStorage resourceStorage;
    private final EnergyPlantsFactory energyPlantsFactory = new EnergyPlantsFactory();
    private final MinesFactory minesFactory = new MinesFactory();
    private final EnergyConsumer consumer;

    public Test() {
        this.energyPlantsArrayList = new ArrayList<>();
        this.mineArrayList = new ArrayList<>();
        this.resourceStorage = ResourceStorage.INSTANCE.getInstance();
        EnergyConsumersFactory energyConsumersFactory = new EnergyConsumersFactory();
        this.consumer = energyConsumersFactory.getEnergyConsumer("NewYork");
    }


    public void addCoalPlants() {
        for (int i = 0; i < 10; i++) {
            energyPlantsArrayList.add(energyPlantsFactory.getEnergyPlant("coalPlant"));
        }
    }

    public void addCoalMine() {
        for (int i = 0; i < 100; i++) {
            mineArrayList.add(minesFactory.getMine("coalMine"));
        }
    }


    public void run() {
        mineArrayList.add(minesFactory.getMine("uraniumMine"));
        System.out.println("Dodano kopalnie uranu.");
        energyPlantsArrayList.add(energyPlantsFactory.getEnergyPlant("nuclearPlant"));
        System.out.println("Dodano elektrownie atomową.");
        this.addCoalMine();
        System.out.println("Dodano 100 kopalni węgla");
        this.addCoalPlants();
        System.out.println("Dodano 10 elektorwni węglowych.");
        for (int i = 0; i < 30; i++) {
            for (Mine mine : mineArrayList) {
                mine.produceFuel();
            }

            for (EnergyPlant plant : energyPlantsArrayList) {
                plant.produceEnergy();
            }
            System.out.println("Elektrownie wyprodukowały energię.");
            consumer.consumeEnergy();
            System.out.println("Nowy York pobrał energię.");
            System.out.println("Ilość pozostałej energii: " + resourceStorage.getEnergy());
            System.out.println("Ilość pozostałego uranu: " + resourceStorage.getUranium());
            System.out.println("Ilość pozostałego węgla: " + resourceStorage.getCoal());
            System.out.println("Ilość pozostałego helu: " + resourceStorage.getHelium());
            System.out.println("Ilość pozostałej antymaterii: " + resourceStorage.getAntimatter());
            System.out.println("-----------------------KONIEC DNIA " + (i + 1) + "--------------------------------");

        }

    }
}
