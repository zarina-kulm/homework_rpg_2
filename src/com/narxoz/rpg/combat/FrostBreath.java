package com.narxoz.rpg.combat;

public class FrostBreath implements Ability{
    private final int damage;
    private final int slowDuration;
    public FrostBreath(int damage, int slowDuration) {
        this.damage = damage;
        this.slowDuration = slowDuration;
    }
    @Override
    public String getName() {
        return "Frost Breath";
    }
    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public String getDescription() {
        return "Deals " + damage + " ice damage and slows enemies for " + slowDuration + " seconds.";
    }
    @Override
    public Ability clone() {
        return new FrostBreath(damage, slowDuration);
    }
}
