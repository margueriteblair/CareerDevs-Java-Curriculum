package com.margieblair;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Animal {
    private int numberOfLegs;
    private String name;
    private char gender;
    private String color;
    private List<String> children;



    public Animal(int numberOfLegs, String name, char gender, String color, List<String> childList) {
        this.numberOfLegs = numberOfLegs;
        this.name = name;
        this.gender = gender;
        this.color = color;
        this.children = childList;
    }

    public String makesNoise() {
        return "makes noise";
    }

    public void printChildren()  {
        for (int i = 0; i < this.children.size(); i++) {
            System.out.println(this.children.get(i)); //arr[i] list.get(i)
        }
    }


    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}

