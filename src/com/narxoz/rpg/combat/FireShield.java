package com.narxoz.rpg.combat;

public class FireShield implements Ability {
    private final int defenseBonus;
    private final int duration;

    public FireShield(int defenseBonus, int duration) {
        this.defenseBonus = defenseBonus;
        this.duration = duration;
    }
    @Override
    public String getName() {
        return "Fire Shield";
    }
    @Override
    public int getDamage() {
        return 0;
    }
    @Override
    public String getDescription() {
        return "Grants +" + defenseBonus + " defense for " + duration + " seconds.";
    }
    @Override
    public Ability clone() {
        return new FireShield(defenseBonus, duration);
    }
}
