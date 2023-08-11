public class Main {
    public static void main(String[] args) {
        try {
            AuthenticationValidator.checkAuthentication("qeffqgbev1",
                    "password", "passwword");
            System.out.println("Аутентификация проейдена успешно");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}