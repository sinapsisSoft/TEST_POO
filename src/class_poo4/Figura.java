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
public class Figura {
    
    private String color;
    private int base;
    private int altura;
    
    public Figura(){
        this.color="Negro";
    }
    
    public void printColor(){
        System.out.println(this.color);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
}
