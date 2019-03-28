/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package konseppbo;

/**
 *
 * @author harysay
 */
public class MainVehicle { 
    public static void main(String[]args ) { 
        Car mobil = new Car(); 
        mobil.memilikiGPS();
        mobil.setFuelAmount("90 Liter");
        mobil.setCapacity("2 Ton");
        System.out.println(mobil.fuel);
        mobil.sebutIdentitas();
        MobilSport sport = new MobilSport();
        sport.rearWheels();
    }
}


