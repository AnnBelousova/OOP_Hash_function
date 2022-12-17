package transport;

public class Data {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        String login = "jkjh44444_";
        String password = "jksa";
        String confirmPassword = "вап45";
        checkCredentials(login, password, confirmPassword);
    }
    public static void checkCredentials (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        if (checkCred(login)) {
            System.out.println("Login is Ok");
        }else {
            throw new WrongLoginException("Login is wrong");
        }

        if (checkCred(password)) {
            System.out.println("Password is Ok");
        }else {
            throw new WrongPasswordException("Password is wrong");
        }

        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Confirm Password is wrong");
        }else {
            System.out.println("Confirm Password is Ok");
        }
    }
    public static Boolean checkCred(String str){
        return str.matches("([A-Z]*[a-z]*[0-9]*[_]*){1,20}");
    }
}
