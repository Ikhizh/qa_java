package com.example;

import java.util.List;

public class LionAlex extends Lion {
    public LionAlex(Feline feline) throws Exception {
        super(feline, "Самец");
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return List.of("Марти", "Алекс", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "New York";
    }

}
