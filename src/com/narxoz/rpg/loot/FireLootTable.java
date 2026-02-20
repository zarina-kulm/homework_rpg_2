package com.narxoz.rpg.loot;
import java.util.Arrays;
import java.util.List;
public class FireLootTable implements LootTable {
    private final List<String> items;
    private final int goldDrop;
    private final int experienceDrop;
    public FireLootTable() {
        this.items = Arrays.asList(
                "Fire Gem",
                "Dragon Scale",
                "Flame Rune"
        );
        this.goldDrop = 620;
        this.experienceDrop = 950;
    }
    @Override
    public List<String> getItems() {
        return items;
    }
    @Override
    public int getGoldDrop() {
        return goldDrop;
    }
    @Override
    public int getExperienceDrop() {
        return experienceDrop;
    }
    @Override
    public String getLootInfo() {
        return "Drops: " + String.join(", ", items) + ". Gold: " + goldDrop + ", EXP: " + experienceDrop;
    }
    @Override
    public LootTable clone() {
        return new FireLootTable();
    }
}
