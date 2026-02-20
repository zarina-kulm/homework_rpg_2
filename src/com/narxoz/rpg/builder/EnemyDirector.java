package com.narxoz.rpg.builder;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.factory.EnemyComponentFactory;
public class EnemyDirector {
    private EnemyBuilder builder;
    public EnemyDirector(EnemyBuilder builder) {
        this.builder = builder;}
    public Enemy createMinion(EnemyComponentFactory factory) {
        return builder
                .setName("Minion")
                .setHealth(50)
                .setDamage(10)
                .setDefense(5)
                .setSpeed(20)
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAIBehavior())
                .build();
    }
    public Enemy createElite(EnemyComponentFactory factory) {
        return builder
                .setName("Elite Enemy")
                .setHealth(200)
                .setDamage(40)
                .setDefense(15)
                .setSpeed(30)
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAIBehavior())
                .build();
    }
    public Enemy createMiniBoss(EnemyComponentFactory factory) {
        return builder
                .setName("Mini Boss")
                .setHealth(2000)
                .setDamage(200)
                .setDefense(80)
                .setSpeed(40)
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAIBehavior())
                .addPhase(1, 2000)
                .addPhase(2, 1000)
                .build();
    }
    public Enemy createRaidBoss(EnemyComponentFactory factory) {
        return builder
                .setName("Raid Boss")
                .setHealth(100000)
                .setDamage(1000)
                .setDefense(300)
                .setSpeed(60)
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAIBehavior())
                .addPhase(1, 100000)
                .addPhase(2, 50000)
                .addPhase(3, 25000)
                .build();
    }
}
