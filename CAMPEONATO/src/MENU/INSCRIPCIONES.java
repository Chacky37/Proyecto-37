
package MENU;

import java.util.Scanner;


public class INSCRIPCIONES {
    private String nombre;
    private String CDO;
    private String nombreT;
    private int inscripcion;
    Scanner cap=new Scanner (System.in);

    public INSCRIPCIONES() {
    }
    public void setcap(){
        
        System.out.print("\nDIGITE EL NOMBRE DEL EQUIPO : ");nombre=cap.nextLine();
        System.out.print("\nDIGITE SU CIUDAD DE ORIGEN : ");CDO=cap.nextLine();
        System.out.print("\nDIGITE EL NOMBRE DEL TECNICO : ");nombreT=cap.nextLine();
        System.out.print("\nDIGITE EL EL NUMERO DE  ");inscripcion=cap.nextInt();
    }

    @Override
    public String toString() {
        return "INSCRIPCION DE QUIPOS " + "nombre=" + nombre + ", CDO=" + CDO + ", nombreT=" + nombreT + ", inscripcion=" + inscripcion + ", cap=" + cap + '}';
    }
    
    
}
