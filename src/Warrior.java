// Абстрактный класс Warrior
abstract class Warrior {
    // Поля класса
    protected String name;
    protected int health;
    protected int damage;

    // Статическое поле - общее для всех воинов
    protected static int warriorCount = 0;

    // конструктор с параметрами
    public Warrior(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        warriorCount++;  // Увеличиваем количество воинов при создании
    }

    // Абстрактный метод атаки - будет реализован в каждом подклассе
    public abstract void attack();

    // Метод для защиты - общий для всех
    public void defend() {
        System.out.println(name + " защищается!");
    }

    // Статический метод для получения общего количества воинов
    public static int getWarriorCount() {
        return warriorCount;
    }
}