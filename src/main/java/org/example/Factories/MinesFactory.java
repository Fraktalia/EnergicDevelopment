package org.example.Factories;

import org.example.Mines.*;

public class MinesFactory{


    public Mine getMine(String mineName){
        switch (mineName){
            case "coalMine":
                return new CoalMine();
            case "hadronCollider":
                return new HadronCollider();
            case "moonMine":
                return new MoonMine();
            case "uraniumMine":
                return new UraniumMine();
        } return new CoalMine();
    }
}
