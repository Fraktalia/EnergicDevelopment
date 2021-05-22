package org.example.Mines;

import org.example.ResourceStorage;

public abstract class Mine {
    protected ResourceStorage resourceStorage;

    public Mine() {
        this.resourceStorage = ResourceStorage.INSTANCE.getInstance();
    }

    public abstract void produceFuel();

}
