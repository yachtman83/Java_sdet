public class WrongLoginException extends Exception {

    public WrongLoginException() {
        super();  // вызывает конструктор класса Exception без параметров
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
