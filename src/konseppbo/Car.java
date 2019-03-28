/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package konseppbo;

/**
 *
 * @author harysay
 */
public class Car extends Vehicle { 
    protected String gps;
    public Car(){ 
        System.out.println("Isi dari Car:Constructor");
        //Pemanggilan induknya
        super.fuel = "bahan bakar"; 
        super.capacity = "kapasitas";
        gps = "GPS Tercanggih";
    } 
    public String memilikiGPS() { 
            System.out.println("Car: atribut baru "+gps+" merupakan "
                    + "perluasan dari Class Vehicle"); 
            getFuelAmount();
            return gps; 
        }
}


