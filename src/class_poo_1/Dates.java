/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_poo_1;

/**
 *
 * @author itadmin
 */
public class Dates {
    private int day;
    private int month;
    private int year;
    
    public Dates(int day,int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
        
    }
    /* Methods Set */
    public void setDay(int day){
        if(day>0 && day <32){
            this.day=day;
        }
        else{
            System.out.println("Dia no valido");
        }
    
    }
    public void setMonth(int month){
        if(month>0 && month <13){
            this.month=month;
        }
        else{
            System.out.println("Mes no valido");
        }
    
    }
    public void setYear(int year){
        if(year>0 ){
            this.year=year;
        }
        else{
            System.out.println("Año no valido");
        }
    
    }
    /* Methods Get */
    public int getDay(){
        
        return this.day;
    }
     public int getMonht(){
        
        return this.month;
    }
      public int getYear(){
        
        return this.year;
    }
}
