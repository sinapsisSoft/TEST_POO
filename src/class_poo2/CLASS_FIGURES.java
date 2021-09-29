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
public class CLASS_FIGURES {

    public static String[] colors =new String[4];
    public static String[] descriptions =new String[4];
    public static String[]arrayType=new String[4];

    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner sc = new Scanner(System.in);
         String data = sc.nextLine();
         System.out.println(data);*/
        
        /*This array Tyoe */
        /*positions 0 ="Square", 1="Triangle",2="Rectangle",3="Circle"  */
        arrayType[0] = "Cuadrado";
        arrayType[1] = "Triangulo";
        arrayType[2] = "Rectangulo";
        arrayType[3] = "Circulo";

        descriptions[0] = "El cuadrado es un polígono de cuatro lados, todos sus lados son iguales y sus cuatro ángulos son de 90 grados cada uno";
        descriptions[1] = "El triángulo es el polígono que resulta de unir 3 puntos con líneas rectas. Los puntos de intersección son los vértices y los segmentos son los lados.";
        descriptions[2] = "El rectángulo es una figura formada por 4 rectas llamadas lados. Las características de los rectángulos son que sus lados opuestos son paralelos y sus 4 ángulos miden 90º.";
        descriptions[3] = "El círculo es una figura geométrica que se realiza trazando una curva que está siempre a la misma distancia de un punto que llamamos centro. La línea que bordea al círculo se llama circunferencia.";

        colors[0] = "Azul";
        colors[1] = "Amarillo";
        colors[2] = "Rojo";
        colors[3] = "Verde";

        Figures objFigure = new Figures(arrayType,descriptions,colors);
        String result = objFigure.area(30, 20, 1);
        System.out.println(result);
         result = objFigure.perimeter(30, 0, 1);
        System.out.println(result);
         result = objFigure.radio(30, 20, 1);
        System.out.println(result);
        System.out.println(objFigure.print(1));
       
    }
}
