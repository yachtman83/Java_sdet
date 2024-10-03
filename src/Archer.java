public class Archer extends Warrior implements RangedAttack{

    public Archer(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attack() {
        performRangedAttack();
    }

    public void defend() {
        System.out.println("не могу");
    }

    @Override
    public void performRangedAttack() {
        System.out.println("Стреляю из лука");
    }
}
