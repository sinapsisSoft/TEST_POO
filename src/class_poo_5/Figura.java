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
public class Figura implements Int_Figura{
    
    private String color;
    private int base;
    private int altura;
    private String respuesta;

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

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    public Figura(){
        this.color="Negro";
        this.respuesta="";
        this.base=0;
        this.altura=0;
    }
    
    public Figura(String color,int base,int altura){
        this.color=color;
        this.respuesta="";
        this.base=base;
        this.altura=altura;
    }
    
    public void printColor(){
        System.out.println(this.color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String area(){
        respuesta=""+this.base*this.altura/2;
        return  respuesta;
    }
    public String radio(){
       
        return  respuesta;
    }
    public String area(int base , int altura){
        respuesta=""+base*altura/2;
        return  respuesta;
    }

    @Override
    public String mostrar(String dato) {
      return dato;
    }

    @Override
    public void calcular() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
