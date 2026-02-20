package com.narxoz.rpg.combat;

public class Vanish implements Ability{
    private final int duration;
    public Vanish(int duration) {
        this.duration = duration;
    }
    @Override
    public String getName() {
        return "Vanish";
    }
    @Override
    public int getDamage() {
        return 0;
    }
    @Override
    public String getDescription() {
        return "Becomes invisible and avoids attacks for " + duration + " seconds.";
    }
    @Override
    public Ability clone() {
        return new Vanish(duration);
    }
}
