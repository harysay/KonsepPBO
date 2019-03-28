/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package konseppbo;

/**
 *
 * @author harysay
 */
public class Vehicle { 
    protected String fuel; //jika dirubah menjadi rovate maka tidak bisa diakses langsung
    protected String capacity; //harus diakses melalui get setter nya
    protected String breaks;
    public Vehicle(){ 
        System.out.println("Isi dari Vehicle:Constructor");
    } 
    public Vehicle(String fuel,String capacity ){ 
        this.fuel = fuel; this.capacity = capacity; 
    } 
    public String getFuelAmount(){ 
        System.out.println("Parent: fuelAmount");
        return fuel; 
    } 
    public String getCapacity(){
    return capacity; 
    } 
    public void setFuelAmount( String fuel ){ 
        this.fuel = fuel; 
    } 
    public void setCapacity (String cap ){ 
        this.capacity = cap; 
    } 
    public void sebutIdentitas(){
    System.out.println("Jumlah Bahan Bakar : "+fuel);
    System.out.println("Kapasitas : "+capacity);
    }
}

