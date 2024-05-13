package lesson20240318;

public class Task2 {

    public static void main(String[] args) {
        String correctPassword = "12345";
        String passwordFromUser = "1234";
        try {
            checkPassword(passwordFromUser, correctPassword);
        } catch (WrongPasswordException e) {
            System.out.println("Try again. You have three attempts");
            e.printStackTrace();
        }
    }

    public static void checkPassword(String passwordFromUser, String correctPassword) throws WrongPasswordException{
        if (!correctPassword.equals(passwordFromUser)) {
            throw new WrongPasswordException("Password is wrong");
        }
    }


}
