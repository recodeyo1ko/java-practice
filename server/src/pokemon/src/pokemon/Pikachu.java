package pokemon;

public class Pikachu extends Pokemon {
    public Pikachu() {
        super(35, 55); // HPと攻撃力を初期化
    }

    @Override
    public String getName() {
        return "ピカチュウ";
    }
}
