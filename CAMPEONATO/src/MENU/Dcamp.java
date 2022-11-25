
package MENU;

import java.util.Scanner;

public class Dcamp {
    private String nombre;
    private int meces;
    private String premio;
    Scanner cap=new Scanner (System.in);
    public Dcamp() {
    }

    public void setcap(){
        System.out.print("DIGITE EL NOMBRE DEL CAMPEONATO : ");nombre=cap.nextLine();
        System.out.print("\nDIGITE LOS MECES DE DURACION = ");meces=cap.nextInt();
        System.out.print("\nDIGITE EL PREMIO QUE VA A DAR : ");premio=cap.nextLine();
    }

    public String toString() {
        return "\nDATOS DEL CAMPEONATO\n" 
                + "\nNOMBRE DEL CAMPEONATO : "+ nombre 
                +"\nMECES DE DURACION = " + meces
                + "\n PREMIO PRA EL GANADOR : " + premio + "\n";
    }
}
