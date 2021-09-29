/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_poo_5;

/**
 *
 * @author itadmin
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        Figura objFigura = new Figura();
                //Datos cargados del constructor
        //objFigura.printColor();
        //Datos modifcados 
        //objFigura.setColor("Morado");
        objFigura.setBase(40);
        objFigura.setAltura(35);
        objFigura.printColor();
        System.out.println(objFigura.area());
        System.out.println("****************************");
        System.out.println(objFigura.area(20, 10));
        System.out.println("****************************");
        System.out.println(objFigura.mostrar("Diego"));
        System.out.println("****************************");
        Circulo objCirculo = new Circulo();
        //objCirculo.setAltura(30);
        //objCirculo.setBase(40);
        //System.out.println(objCirculo.area());
    }
    
}
