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
public class Aplicacion {
    
     public static void main(String[] args) {
      
         Figura objFigura=new Figura();
         objFigura.setColor("Rojo");
         objFigura.printColor();
         objFigura.setAltura(30);
         objFigura.setBase(20);
         
         Circulo objCirculo=new Circulo();
         objCirculo.setAltura(30);
          objCirculo.setBase(40);
        System.out.println(""+objCirculo.area());
     }
    
}
