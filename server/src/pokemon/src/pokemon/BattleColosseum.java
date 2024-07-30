package pokemon;

public class BattleColosseum {
    public void startBattle(Pokemon p1, Pokemon p2) {
        System.out.println("開始 " + p1.getName() + " 対 " + p2.getName());

        while (p1.getHP() > 0 && p2.getHP() > 0) {
            // p1がp2に攻撃
            p2.reduceHP(p1.getAttackPower());
            System.out.println(p1.getName() + " の攻撃で " + p2.getName() + "は " + p1.getAttackPower() + " のダメージを受けた"
                    + p2.getName() + " HP: " + p2.getHP());

            if (p2.getHP() <= 0) {
                System.out.println(p2.getName() + " は気絶した");
                System.out.println(p1.getName() + " の勝ち!");
                break;
            }

            // p2がp1に攻撃
            p1.reduceHP(p2.getAttackPower());
            System.out.println(p2.getName() + " の攻撃で " + p1.getName() + "は " + p2.getAttackPower() + " のダメージを受けた"
                    + p1.getName() + " HP: " + p1.getHP());

            if (p1.getHP() <= 0) {
                System.out.println(p1.getName() + " は気絶した");
                System.out.println(p2.getName() + " の勝ち!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Pokemon pikachu = new Pikachu();
        Pokemon bulbasaur = new Bulbasaur();

        BattleColosseum colosseum = new BattleColosseum();
        colosseum.startBattle(pikachu, bulbasaur);
    }
}
