public class Spearman extends Warrior implements MeleeAttack{

    public Spearman(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attack() {
        performMeleeAttack();
    }

    @Override
    public void defend() {
        System.out.println("Щит поднят");
    }

    @Override
    public void performMeleeAttack() {
        System.out.println("Атакую копьем");
    }
}
