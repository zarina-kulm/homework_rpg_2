package com.narxoz.rpg.combat;
public class FlameBreath implements Ability {
    private final int damage;
    private final int burnDuration;

    public FlameBreath(int damage, int burnDuration) {
        this.damage = damage;
        this.burnDuration = burnDuration;
    }

    @Override
    public String getName() {
        return "Flame Breath";
    }
    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public String getDescription() {
        return "Deals AoE fire damage and burns target for " + burnDuration + " seconds.";
    }
    @Override
    public Ability clone() {
        return new FlameBreath(damage, burnDuration);
    }
}
