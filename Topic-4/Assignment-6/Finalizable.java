public class Finalizable {
    Finalizable() {
        System.out.println("Creating finalizable");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called.");
        // super.finalize();
    }
}
