public class Main {
    public static void main(String[] args) {
    }

    private static void site(String login, String password, String confirmPassword) {
        if (login.length() > 20) {
            throw new WrongLoginException();
        }
        if (password.length() <= 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
}