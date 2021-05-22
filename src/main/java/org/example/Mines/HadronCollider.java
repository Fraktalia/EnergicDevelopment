package org.example.Mines;

import org.example.ResourceStorage;

public class HadronCollider extends Mine{
    private int progress = 7;

    @Override
    public void produceFuel() {
        if(progress>1){
            this.progress = progress -1;
        }else{
            this.resourceStorage.changeFuel("antimater", 1);
            this.progress = 7;
        }
    }
}
