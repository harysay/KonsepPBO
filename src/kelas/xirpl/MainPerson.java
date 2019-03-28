/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas.xirpl;

import konseppbo.Car;

/**
 *
 * @author harysay
 */
public class MainPerson {
    
    public static void main(String[]args ) 
    { 
        Student anna = new Student(); 
        anna.getName();
        anna.setName("Abraham");
        anna.setAddress("Jogja");
        System.out.println(anna.name);
        
        anna.sebutIdentitas();
    }
    
}


