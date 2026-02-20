package com.narxoz.rpg.enemy;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class DragonBoss implements Enemy {
    private String name;
    private int health;
    private int damage;
    private int defense;
    private int speed;
    private String element;
    private List<Ability> abilities;
    private Map<Integer, Integer> phases;
    private LootTable lootTable;
    private String aiBehavior;
    private boolean canFly;
    private boolean hasBreathAttack;
    private int wingspan;

    public DragonBoss(String name, int health, int damage, int defense,
                      int speed, String element,
                      List<Ability> abilities,
                      int phase1Threshold, int phase2Threshold, int phase3Threshold,
                      LootTable lootTable, String aiBehavior,
                      boolean canFly, boolean hasBreathAttack, int wingspan) {

        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
        this.element = element;
        this.abilities = abilities != null ? abilities : new ArrayList<>();
        this.phases = new HashMap<>();
        this.phases.put(1, phase1Threshold);
        this.phases.put(2, phase2Threshold);
        this.phases.put(3, phase3Threshold);
        this.lootTable = lootTable;
        this.aiBehavior = aiBehavior;
        this.canFly = canFly;
        this.hasBreathAttack = hasBreathAttack;
        this.wingspan = wingspan;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getHealth() {
        return health;
    }
    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public int getDefense() {
        return defense;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public List<Ability> getAbilities() {
        return abilities;
    }
    @Override
    public LootTable getLootTable() {
        return lootTable;
    }
    @Override
    public String getAI() {
        return aiBehavior;
    }
    @Override
    public void displayInfo() {
        System.out.println("=== " + name + " (Dragon Boss) ===");
        System.out.println("Health: " + health + " | Damage: " + damage
                + " | Defense: " + defense + " | Speed: " + speed);
        System.out.println("Element: " + element);
        System.out.println("Abilities (" + abilities.size() + "):");
        System.out.println("Boss Phases: " + phases.size());
        for (Map.Entry<Integer, Integer> phase : phases.entrySet()) {
            System.out.println("  Phase " + phase.getKey()
                    + ": triggers at " + phase.getValue() + " HP");
        }
        System.out.println("AI Behavior: " + aiBehavior);
        System.out.println("Can Fly: " + canFly
                + " | Breath Attack: " + hasBreathAttack
                + " | Wingspan: " + wingspan);
    }
    public void setElement(String element) {
        this.element = element;
    }
    public void multiplyStats(double multiplier) {
        this.health = (int) (this.health * multiplier);
        this.damage = (int) (this.damage * multiplier);
        this.defense = (int) (this.defense * multiplier);
        this.speed = (int) (this.speed * multiplier);
        for (Map.Entry<Integer, Integer> entry : phases.entrySet()) {
            entry.setValue((int) (entry.getValue() * multiplier));
        }
    }
    @Override
    public Enemy clone() {
        List<Ability> abilityCopies = new ArrayList<>();
        for (Ability ability : this.abilities) {
            abilityCopies.add(ability.clone());
        }
        LootTable lootCopy = lootTable != null
                ? lootTable.clone()
                : null;
        Map<Integer, Integer> phaseCopy = new HashMap<>(this.phases);
        return new DragonBoss(
                name, health, damage, defense, speed, element,
                abilityCopies,
                phaseCopy.getOrDefault(1, health),
                phaseCopy.getOrDefault(2, health / 2),
                phaseCopy.getOrDefault(3, health / 3),
                lootCopy,
                aiBehavior, canFly, hasBreathAttack, wingspan);
    }
}