/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas.xirpl;

import konseppbo.Vehicle;

/**
 *
 * @author harysay
 */
public class Student extends Person 
{ 
    public Student()
    { 
        
        System.out.println("Isi dari Student:Constructor");
        //beberapa kode di sini 
        
        //Pemanggilan induknya
        super.name = "somename"; 
        super.address = "some address";
        
        
    } 
    
    public String getName() 
        { 
            System.out.println("Student: getName baru tidak sama dengan Class Person"); 
            return name; 
        }
}


