import java.util.Scanner;

/*
Everything in java is an object except the primitive types
methods and java file is also referred as object types


Note: using thread.sleep() just for realistic feel!
 */
public class Object extends Base {
    static Scanner scanner = new Scanner(System.in);
    static String loginData;

    public static void createUser() throws Exception{
        loginData = askInputs();
        Thread.sleep(500);
        System.out.println("User Created!!!!");
    }

    public static void verifyLogin() throws Exception{
        Thread.sleep(500);
        System.out.println("Enter login details...");
        while (!loginData.equals(askInputs())) {
            System.out.println("Invalid Credentials, Please try again:: ");
        }
        Thread.sleep(750);
        System.out.println("user found!!!");
    }

    private static String askInputs() {
        System.out.print("Enter Username: ");
        String catchUsername = scanner.next();
        System.out.print("Enter Password: ");
        String catchPassword = scanner.next();
        return catchUsername + catchPassword;
    }

}
    

