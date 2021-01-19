public class MarksException extends Exception {
    String s = "";

    MarksException(float f) {
        if (f > 100) {
            s = " is out of range";
        }
        if (f < 0) {
            s = " is negative";
        }
    }

    public String toString() {
        return s;
    }

}
