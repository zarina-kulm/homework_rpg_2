package com.narxoz.rpg.factory;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;
import java.util.Arrays;
import java.util.List;
public class IceComponentFactory implements EnemyComponentFactory{
    @Override
    public List<Ability> createAbilities() {
        return Arrays.asList(new FrostBreath(100, 6), new IceShield(35, 8), new Blizzard(340, 10));
    }
    @Override
    public LootTable createLootTable() {
        return new IceLootTable();
    }
    @Override
    public String createAIBehavior() {
        return "DEFENSIVE";
    }
}
