/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author harysay
 */
public class CobaPertama implements InterfaceA{
    public void methodSatuA(){ 
        System.out.println("Isi method pertama dari interface A"); 
    } 
    public String methodDuaA(){ 
        return atributA; 
    } 
    public static void main (String []args){ 
        CobaPertama obj = new CobaPertama(); 
        obj.methodSatuA(); 
        String pesan = obj.methodDuaA(); 
        System.out.println(pesan); 
    }
    
}

