/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_poo_1;

import java.util.Scanner;

/**
 *
 * @author DIEGO HERNANDO CASALLAS
 * @date: 14/09/2021 Description: Class two of POO Encapsulation
 */
public class CLASS_POO_1 {

    /**
     * @param args the command line arguments
     */
    public static String newName;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        System.out.println(data);

        Person objPerson = new Person();
        objPerson.setName("Diego");
        objPerson.setSurname("Casallas");
        objPerson.setDocument("12345678");
        objPerson.setTypePerson(2);

        Dates objDate = new Dates(21, 2, 1880);
        System.out.println("El señor:" + objPerson.getName() + "  " + objPerson.getSurname());

        System.out.println("Fecha: Día" + objDate.getDay() + " - Mes" + objDate.getMonht() + " - Año " + objDate.getYear());

    }

}
