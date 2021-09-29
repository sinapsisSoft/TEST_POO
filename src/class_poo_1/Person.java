/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_poo_1;

/**
 *
 * @author Diego Casallas
 * @date 14/09/2021
 */
public class Person {

    private String name;
    private String surname;
    private String document;
    private Number typePerson;

    /* Methods Get */
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDocument() {
        return document;
    }

    public Number getTypePerson() {
        return typePerson;
    }

    /* Methods Set */
    
    public void setName(String name){
        this.name=name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public void setDocument(String document){
        this.document=document;
    }
    public void setTypePerson(Number typePerson){
        this.typePerson=typePerson;
    }
    
}
