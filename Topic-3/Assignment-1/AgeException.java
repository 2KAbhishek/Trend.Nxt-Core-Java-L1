public class AgeException extends Exception {
    String msg = "";

    AgeException(int a) {
        if (a < 18) {
            msg = "age below 18 is not accepted";
        }
        if (a >= 60) {
            msg = "age above 59 is not accepted";
        }
    }

    public String toString() {
        return this.getClass().getTypeName() + ": " + msg;
    }
}
