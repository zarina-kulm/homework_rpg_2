package com.narxoz.rpg.combat;

public class ShadowStrike implements Ability{
    private final int damage;
    private final int blindDuration;
    public ShadowStrike(int damage, int blindDuration) {
        this.damage = damage;
        this.blindDuration = blindDuration;
    }
    @Override
    public String getName() {
        return "Shadow Strike";
    }
    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public String getDescription() {
        return "Deals " + damage + " shadow damage and blinds the target for " + blindDuration + " seconds.";
    }
    @Override
    public Ability clone() {
        return new ShadowStrike(damage, blindDuration);
    }
}
