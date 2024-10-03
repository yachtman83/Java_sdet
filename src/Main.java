//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Warrior spm = new Archer("Ronald", 40, 15);
        Warrior clr = new Cavalry("Ronald", 40, 15);
        spm.defend();
        System.out.println(Warrior.getWarriorCount());
    }
}