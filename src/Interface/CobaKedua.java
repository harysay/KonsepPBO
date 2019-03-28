/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author harysay
 */
public class CobaKedua implements InterfaceA{
    public void methodSatuA(){ 
        System.out.println("Isi method pertama dari interface A");
    
    } 
    public String methodDuaA(){ 
        return atributA; 
    } 
    public void methodSatuB(){
        System.out.println("Isi method pertama dari Interface B"); 
    } 
    public void methodDuaB(){ 
        System.out.println("Isi method kedua dari Interface B"); 
    } 
    public static void main (String []args){ 
        CobaKedua obj = new CobaKedua(); 
        String pesan = obj.methodDuaA(); 
        System.out.println(pesan); 
        obj.methodSatuA(); 
        obj.methodSatuB(); 
        obj.methodDuaB(); 
    }
    
}

