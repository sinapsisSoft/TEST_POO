/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_poo_3;

/**
 *
 * @author itadmin
 */
public class Operario extends Empleado {
     private int id;
    private int phone;

    public Operario() {
    }

    public Operario(String name, String document, String surname) {
        super(name, document, surname);
    }
    public Operario(int id, int phone) {
        this.id = id;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
     public void print(){
       String name_="nombre "+getName()+" Apellido "+getSurname(); 
       System.out.println("Operario :"+name_);
    }
    
}
