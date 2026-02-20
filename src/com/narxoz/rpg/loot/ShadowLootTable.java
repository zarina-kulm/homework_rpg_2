package com.narxoz.rpg.loot;
import java.util.Arrays;
import java.util.List;
public class ShadowLootTable implements LootTable{
    private final List<String> items;
    private final int goldDrop;
    private final int experienceDrop;
    public ShadowLootTable() {
        this.items = Arrays.asList(
                "Shadow Gem",
                "Dark Essence",
                "Shadow Rune"
        );
        this.goldDrop = 740;
        this.experienceDrop = 1200;
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
        return new ShadowLootTable();
    }
}
