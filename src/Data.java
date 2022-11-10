public class Data {

    public static void checkingDataEntry(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        if (login.matches("[0-9a-zA-Z\\_]{1,20}")) ;
        else throw new WrongLoginException("Некорретный логин");


        if (password.matches("[0-9a-zA-Z\\_]{1,20}")) ;
        else throw new WrongPasswordException("Некорректный пароль");

        if (password.equals(confirmPassword)) ;
        else throw new WrongPasswordException("Пароли не совпадают");

        System.out.println("Успешная регистрация");


    }
}

