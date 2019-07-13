package Java.Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in); 
     double t=0;
     int mayorprom=0,poseslent=0,posesrapi=0; //posiciones de estudiante lento y rapido
     double estrapi,estlent; //estudiantes mas rapidos comparacion (lentos tambien)
     double sprom=0,promedio=0;
     ArrayList <String> nom = new ArrayList ();
     ArrayList <Double> vel = new ArrayList();
     ArrayList <Double> time = new ArrayList();
     boolean fin=false;
     while(!fin){
         
         System.out.println("Ingresar nombre ");
         nom.add(leer.next());
         System.out.println("Ingresar la velocidad ");
         vel.add(leer.nextDouble());
         int des;
         
         System.out.println("1.Agregar otro estudiante  2.terminar 3.continuar");
         des=leer.nextInt();
         if (des==1){
             fin=true;
         }else if (des==2){
           fin=false;
         }
     }
        for(int x=0;x<vel.size();x++){ 
        t=0;
        t=(100/vel.get(x));
        time.add(t);
        sprom=(sprom+time.get(x));
        promedio=sprom/time.size();
        if(time.get(x)>promedio){
        mayorprom=mayorprom+1; //cantida de estudiantes mayores al promedio
        }
        }
        
        estrapi=time.get(0);
        estlent=time.get(0);
        System.out.println("Los estudiantes son: ");
        for(int y =0;y<nom.size();y++){
            if (estrapi>time.get(y)){
            estrapi=time.get(y); // estudiante mas rapido y su posicion
            posesrapi=y;
            }
            if (estlent<time.get(y)){
            estlent=time.get(y); // estudiante mas lento y su posicion
            poseslent=y;
            }
            System.out.println("nombre "+nom.get(y)+" velocidad "+time.get(y)+" tiempo "+time.get(y));
            System.out.println("");
        
        }
        System.out.println("El Promedio  es "+promedio);
        System.out.println("");
        System.out.println("El estudiante Rapido es "+nom.get(posesrapi)+" con tiempo "+time.get(posesrapi));
        System.out.println("");
        System.out.println("El estudiante Lento es "+nom.get(poseslent)+" con tiempo "+time.get(poseslent));
        System.out.println("");
        System.out.println("El mejor promedio es "+mayorprom);
    }
    
}
