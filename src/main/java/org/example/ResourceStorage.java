package org.example;

public enum ResourceStorage {
    INSTANCE ();
    private int uranium;
    private int energy;
    private int coal;
    private int helium;
    private int antimatter;

    ResourceStorage(){
        this.uranium = 0;
        this.energy = 0;
        this.coal = 0;
        this.helium = 0;
        this.antimatter = 0;
    }

    public ResourceStorage getInstance(){
        return INSTANCE;
    }

    public void changeFuel(String name, int number){
        switch (name){
            case "uranium":
                this.uranium = this.uranium + number;
                break;
            case "coal":
                this.coal = this.coal + number;
                break;
            case "helium":
                this.helium = this.helium + number;
                break;
            case "antimatter":
                this.antimatter = this.antimatter + number;
                break;

        }
    }

    public void changeEnergy(int number){
        this.energy = this.energy + number;
    }

    public int getUranium() {
        return uranium;
    }

    public int getEnergy() {
        return energy;
    }

    public int getCoal() {
        return coal;
    }

    public int getHelium() {
        return helium;
    }

    public int getAntimatter() {
        return antimatter;
    }

}
