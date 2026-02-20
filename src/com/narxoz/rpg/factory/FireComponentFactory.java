package com.narxoz.rpg.factory;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;
import java.util.Arrays;
import java.util.List;
public class FireComponentFactory implements EnemyComponentFactory{
    @Override
    public List<Ability> createAbilities() {
        return Arrays.asList(new FlameBreath(100, 10), new FireShield(25, 10), new MeteorStorm(150, 20));
    }
    @Override
    public LootTable createLootTable() {
        return new FireLootTable();
    }
    @Override
    public String createAIBehavior() {
        return "AGGRESSIVE";
    }
}
