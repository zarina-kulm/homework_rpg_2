package com.narxoz.rpg.builder;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.enemy.DragonBoss;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.loot.LootTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BossEnemyBuilder implements EnemyBuilder {
    private String name;
    private int health;
    private int damage;
    private int defense;
    private int speed;
    private String element;
    private List<Ability> abilities = new ArrayList<>();
    private LootTable lootTable;
    private String aiBehavior;
    private Map<Integer, Integer> phases = new HashMap<>();
    @Override
    public EnemyBuilder setName(String name) {
        this.name = name;
        return this;
    }
    @Override
    public EnemyBuilder setHealth(int health) {
        this.health = health;
        return this;
    }
    @Override
    public EnemyBuilder setDamage(int damage) {
        this.damage = damage;
        return this;
    }
    @Override
    public EnemyBuilder setDefense(int defense) {
        this.defense = defense;
        return this;
    }
    @Override
    public EnemyBuilder setSpeed(int speed) {
        this.speed = speed;
        return this;
    }
    @Override
    public EnemyBuilder setElement(String element) {
        this.element = element;
        return this;
    }
    @Override
    public EnemyBuilder addAbility(Ability ability) {
        this.abilities.add(ability);
        return this;
    }
    @Override
    public EnemyBuilder setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
        return this;
    }
    @Override
    public EnemyBuilder addPhase(int phaseNumber, int healthThreshold) {
        this.phases.put(phaseNumber, healthThreshold);
        return this;
    }
    @Override
    public EnemyBuilder setLootTable(LootTable loot) {
        this.lootTable = loot;
        return this;
    }
    @Override
    public EnemyBuilder setAI(String aiBehavior) {
        this.aiBehavior = aiBehavior;
        return this;
    }
    @Override
    public Enemy build() {
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("Enemy must have a name");}
        if (health <= 0) {
            throw new IllegalStateException("Enemy must have positive health");}
        return new DragonBoss(
                name, health, damage, defense, speed, element, abilities,
                phases.getOrDefault(1, health),
                phases.getOrDefault(2, health / 2),
                phases.getOrDefault(3, health / 3),
                lootTable, aiBehavior,
                true,
                true,
                20
        );
    }
}
