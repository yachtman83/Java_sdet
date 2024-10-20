import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean CheckInf(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Логин не может содержать больше 20 символов");
            }
            if (!login.matches("^[a-zA-Z0-9_]+$")) {
                throw new WrongLoginException("Логин может содержать только латинские буквы, цифры и знак подчеркивания");
            }

            if (password.length() > 20 || confirmPassword.length() > 20) {
                throw new WrongPasswordException("Пароль не может содержать больше 20 символов");
            }
            if (!password.matches("^[a-zA-Z0-9_]+$")) {
                throw new WrongPasswordException("Пароль может содержать только латинские буквы, цифры и знак подчеркивания");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль не подтвержден");
            }

            return true;

        }catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        return false;
    }



    public static void main(String[] args) {
        boolean result = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин: ");
        String login = scanner.nextLine();

        System.out.print("\n");
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        System.out.print("\n");
        System.out.print("Подтвердите пароль: ");
        String confirmPassword = scanner.nextLine();

        result = CheckInf(login, password, confirmPassword);
        if(result) {
            System.out.print("Авторизация удалась");
        }
        else {
            System.out.print("Авторизация не удалась");
        }
    }
}