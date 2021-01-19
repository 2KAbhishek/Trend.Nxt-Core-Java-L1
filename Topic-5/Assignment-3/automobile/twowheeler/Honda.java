package automobile.twowheeler;

public class Honda extends automobile.Vehicle {

    public int getSpeed() {
        return 70;
    }

    public void cdplayer() {
        System.out.println("Honda CD_Player which is available in the car.");
    }

    public String getModelName() {
        return "Honda Shine";
    }

    public String getRegistrationNumber() {
        return "Honda 5678";
    }

    public String getOwnerName() {
        return "Hadoken!";
    }
}
