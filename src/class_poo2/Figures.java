/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_poo2;

/**
 *
 * @author DIEGO CASALLAS
 * @date 21/09/2021
 */
public class Figures {

    private String name;
    private String[] arrayColors;
    private int type;
    private String[] arrayDescriptions;
    private String[] arrayType;
    private String result;

    public Figures(String[] type, String[] descriptions, String[] colors) {

        this.arrayType = type;
        this.arrayDescriptions = descriptions;
        this.arrayColors = colors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getColors() {
        return arrayColors;
    }

    public void setColors(String[] colors) {
        this.arrayColors = colors;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String[] getDescriptions() {
        return arrayDescriptions;
    }

    public void setDescriptions(String[] descriptions) {
        this.arrayDescriptions = descriptions;
    }

    public String[] getArrayType() {
        return arrayType;
    }

    public void setArrayType(String[] arrayType) {
        this.arrayType = arrayType;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String area(int base, int height, int type) {

        result = "El área es :";

        switch (type) {
            case 0:
                result += String.valueOf(base * base);
                break;
            case 1:
                result += String.valueOf((base * height) / 2);
                break;
            case 2:
                result += String.valueOf(base * height);
                break;
            case 3:
                result += String.valueOf(Math.PI * base * base);
                break;
        }

        return result;

    }

    public String perimeter(int base, int height, int type) {

        result = "El perimetro es :";

        switch (type) {
            case 0:
                result += String.valueOf(4 * base);
                break;
            case 1:
                result += String.valueOf(3 * base);
                break;
            case 2:
                result += String.valueOf(2 * (base + height));
                break;
            case 3:
                result += String.valueOf(Math.PI * 2 * base);
                break;
        }

        return result;

    }

    public String radio(int base, int height, int type) {

        result = "El Radio es :";
        double getRadio;
        switch (type) {
            case 0:
                getRadio = base / 2;
                getRadio = getRadio * getRadio;
                getRadio = getRadio * 2;
                getRadio = Math.sqrt(getRadio);
                result += String.valueOf(getRadio);
                break;
            case 1:
                 getRadio = Math.sqrt(base ^ 2 + height ^ 2) / 2;
                result += String.valueOf(getRadio);
                break;
            case 2:
                getRadio = Math.sqrt(base ^ 2 + height ^ 2) / 2;
                result += String.valueOf(getRadio);
                break;
            case 3:
                result += String.valueOf(Math.PI * (base ^ 2));
                break;
        }

        return result;

    }

    public String print(int type) {

        result = "Descripción " + this.arrayDescriptions[type];
        result += "\n" + "Color " + this.arrayColors[type];
        return result;

    }

}
