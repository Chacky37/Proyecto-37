/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Scanner;

/**
 *
 * @author <Xaul H..>
 */
public class Menu {
     private int OP,K;
     private char S;
     private Scanner cap=new Scanner(System.in);
     public Menu(){
         S='X';
     }
   

    public void getMenu(){
        do{
            System.out.println("\n\n\n ");
            System.out.println("========== MENU PRINCIPAL ==========");
            System.out.println("1--- REGISTRAR: ");
            System.out.println("2--- ACTUALIZAR ");//PACIENTE Y MEDICO
            System.out.println("4--- CONSULTAR "); //RESULTADOS, RECETA EXAMENES, ENFERMEDAD
            System.out.println("5--- BUSCAR PACIENTE");
            System.out.println("6--- IMPRIMIR LA INFORMACION EN PANTALLA ");
            System.out.println("7--- ANOTACIONES");
            System.out.println("\n4--- SALIR ");
            System.out.print("\nDIGITE SU OPCION : ");OP=cap.nextInt();
            System.out.println("----------------------------------------------------------------------");
            switch(OP){
                case 1:
                    do{
                    System.out.println("\n\t======== REGISTRAR ========");
                    System.out.println("\n INFORMACION  A REGISTRAR: ");
                    System.out.println("1--- DATOS DEL PACIENTE: PERSONALES");
                    System.out.println("2--- DATOS DEL PACIENTE: UBICACION");
                    System.out.println("3--- DATOS DEL MEDICO: PERSONALES");
                    System.out.println("4--- DATOS DEL MEDICO: ESPECIALIZACION");
                    System.out.println("5--- DIAGNOSTICO");
                    System.out.println("4--- RETORNAR AL MENU PRINCIPAL");
                    System.out.println("INGRESE OPCION: "); K=cap.nextInt();
                    switch(K){
                    case 1:
                        //iniciarInventario();
                        break;
                    case 2:
                       // mls.MostrarDato();
                        break;
                    case 3:
                        //gol.RegistrarMedico();
                        break;
                    case 4:
                        //gol.Especializacion();
                     break;
                    }
                    }
                    while (K == 0);
                     break;
                case 2://Ta.ConsultarPaciente();
                    break;
                case 3:
                    break;
                case 4://R='N';
                    break;
            }
        }while (K == 'N');
    
}
}
