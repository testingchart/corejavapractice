public class CustomExceptions extends Exception {
    public CustomExceptions (String msg) {
        super(msg);
    }

    public CustomExceptions (String msg, Throwable cause){
        super(msg, cause);
    }
}
