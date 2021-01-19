import test.Foundation;

public class FoundationPackageTest {
    public static void main(String[] args) {
        Foundation fd = new Foundation();
        // System.out.println("private var1 = " + fd.var1);
        // System.out.println("default var2 = " + fd.var2);
        // System.out.println("protected var3 = " + fd.var3);
        System.out.println("public var4 = " + fd.var4);
        System.out.println("Can display only var4 because the field is public.");
    }

}
