package com.margieblair.BasicClasses;

import java.security.PublicKey;

public class Cup {
    private String name; //"champagne flute"
    private int mouthSize; //3
    private int baseSize;
    private boolean hasStem; //true || false
    private double capacity; //5.0
    private String material; //"glass"
    private String collection; //"christmas set"

    public Cup(String cupName, int mouthSize, int baseSize, boolean hasStem, double capacity, String material, String collection) {
        this.name = cupName;
        this.mouthSize = mouthSize;
        this.baseSize = baseSize;
        this.hasStem = hasStem;
        this.capacity = capacity;
        this.material = material;
        this.collection = collection;
    }
    //getters retrieve the values
    //setters set the values
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getMouthSize() {
        return mouthSize;
    }

    public void setMouthSize(int newMouthSize) {
        mouthSize = newMouthSize;
    }

    public boolean getStem() {
        return hasStem;
    }
}
