/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_poo4;

/**
 *
 * @author itadmin
 */
public class Circulo extends Figura {
    private int radio;
    
    public Circulo(){
        super();
    }
    
    public int area(){
        
       return this.getAltura()*this.getBase()/2;
    }
}
