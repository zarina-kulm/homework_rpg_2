package com.narxoz.rpg.combat;

public class MeteorStorm implements Ability{
    private final int damage;
    private final int radius;
    public MeteorStorm(int damage, int radius) {
        this.damage = damage;
        this.radius = radius;
    }
    @Override
    public String getName() {
        return "Meteor Storm";
    }
    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public String getDescription() {
        return "Calls down meteors dealing " + damage + " fire damage within a radius of " + radius + " meters.";
    }
    @Override
    public Ability clone() {
        return new MeteorStorm(damage, radius);
    }
}
