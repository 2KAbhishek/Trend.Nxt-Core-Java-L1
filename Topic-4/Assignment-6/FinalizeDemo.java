public class FinalizeDemo {
    public static void main(String[] args) {
        Finalizable fin = new Finalizable();
        fin = new Finalizable();
        fin = new Finalizable();
        Runtime.getRuntime().gc();
    }
}
