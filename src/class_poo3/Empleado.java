/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_poo3;

/**
 *
 * @author itadmin
 */
public class Empleado {

    private String name;
    private String document;
    private String surname;

    public Empleado() {
    }

    public Empleado(String name, String document, String surname) {
        this.name = name;
        this.document = document;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void print(){
    
        System.out.println("El nombre del empleado es : "+this.name);
    }
    
     

}
