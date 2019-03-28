/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas.xirpl;

/**
 *
 * @author harysay
 */
public class Person 
{ 
    protected String name; 
    protected String address; 
    public Person()
    { 
        System.out.println("Isi dari Person:Constructor");
        name = ""; 
        address = ""; 
    } 
    public Person(String name,String address )
    { 
        this.name = name; this.address = address; 
    } 
    public String getName()
    { 
        System.out.println("Parent: getName");
        return name; 
    } 
    public String getAddress()
    {
    return address; 
    } 
    public void setName( String name )
    { 
        this.name = name; 
    } 
    public void setAddress( String add )
    { 
        this.address = add; 
    } 
    public void sebutIdentitas(){
    System.out.println("Nama : "+name);
    System.out.println("Alamat : "+address);
    }
}

