package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_rozszerzona.zadanie_6;

import java.util.ArrayList;
import java.util.List;

public class Zbieranina {
    List<Fish>fishList = new ArrayList<>();
    List<Mammal>mammalList = new ArrayList<>();

    public void addFish(Fish fish) {
        fishList.add(fish);
    }
    public void addMammal(Mammal mammal) {
        mammalList.add(mammal);
    }

    public void showFishList() {
        for(Fish fish : fishList) {
            System.out.println(fish);
        }
    }
    public void showMammalList() {
        for(Mammal mammal : mammalList) {
            System.out.println(mammal);
        }
    }

    @Override
    public String toString() {
        return "Zbieranina{" +
                "fishList=" + fishList +
                ", mammalList=" + mammalList +
                '}';
    }
}
