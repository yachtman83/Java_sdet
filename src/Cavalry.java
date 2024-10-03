public class Cavalry extends Warrior implements RangedAttack, MeleeAttack {

    public Cavalry(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attack() {
        // Конница может как атаковать в ближнем бою, так и стрелять
        if (Math.random() > 0.5) {
            performRangedAttack();
        } else {
            performMeleeAttack();
        }
    }

    @Override
    public void performRangedAttack() {
        if (Math.random() > 0.3) {
            damage = 0;
        }
        System.out.println("Кавалерист " + name +  " стреляет из лука, нанося урон: " + damage);
    }

    @Override
    public void performMeleeAttack() {
        System.out.println("Кавалерист " + name + " атакует копьем, нанося урон: " + damage);
    }
}
