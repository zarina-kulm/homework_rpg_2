package com.narxoz.rpg.loot;
import java.util.Arrays;
import java.util.List;
public class IceLootTable implements LootTable{
    private final List<String> items;
    private final int goldDrop;
    private final int experienceDrop;
    public IceLootTable() {
        this.items = Arrays.asList(
                "Ice Gem",
                "Frost Scale",
                "Ice Rune"
        );
        this.goldDrop = 490;
        this.experienceDrop = 800;
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
        return new IceLootTable();
    }
}
