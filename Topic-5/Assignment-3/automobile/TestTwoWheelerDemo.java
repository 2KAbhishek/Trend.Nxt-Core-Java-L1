package automobile;

import automobile.twowheeler.*;

public class TestTwoWheelerDemo {
    public static void main(String[] args) {
        Hero e = new Hero();
        Honda o = new Honda();
        System.out.println("HERO Class:");
        System.out.println("Model Name: " + e.getModelName());
        System.out.println("Owner Name: " + e.getOwnerName());
        System.out.println("Registration Number: " + e.getRegistrationNumber());
        System.out.println("Speed: " + e.getSpeed());
        e.radio();
        System.out.println();
        System.out.println("HONDA Class:");
        System.out.println("Model Name: " + o.getModelName());
        System.out.println("Owner Name: " + o.getOwnerName());
        System.out.println("Registration Number: " + o.getRegistrationNumber());
        System.out.println("Speed: " + o.getSpeed());
        o.cdplayer();
    }
}
