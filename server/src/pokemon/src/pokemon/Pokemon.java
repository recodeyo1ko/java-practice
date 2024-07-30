package pokemon;

import pokemon.stats.BattleStats;

public abstract class Pokemon implements BattleStats {
    // カプセル化されたフィールド
    private int hp;
    private int attackPower;

    public Pokemon(int hp, int attackPower) {
        this.hp = hp;
        this.attackPower = attackPower;
    }

    // カプセル化されたメソッド
    @Override
    public int getHP() {
        return hp;
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public void reduceHP(int damage) {
        this.hp -= damage;
    }

    // 抽象メソッド
    public abstract String getName();
}
