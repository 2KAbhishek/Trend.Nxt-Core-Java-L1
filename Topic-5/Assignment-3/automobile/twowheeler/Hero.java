package automobile.twowheeler;

public class Hero extends automobile.Vehicle {

    public int getSpeed() {
        return 60;
    }

    public void radio() {
        System.out.println("Hero radio operator.");
    }

    public String getModelName() {
        return "Hero Glamour";
    }

    public String getRegistrationNumber() {
        return "Hero 1234";
    }

    public String getOwnerName() {
        return "Abhishek Keshri";
    }
}
