
package poliformismo;

public class Poliformismo {
    public static void main(String[] args){
        armas armas1[]=new armas[4];
        armas1[0]=new armas(1101, " mediano", " retráctile");
        armas1[1]=new rifles(1102," calibre 22"," retráctile","R3 para madera");
        armas1[2]=new escopetas(1103,"basculante","abatibles","DT11");
        armas1[3]=new pistolas(1105,"9mm","Empuñadura","Glock 9mm");
        
        for(armas armas: armas1){
            System.out.println(armas.mostrar_datos());
            System.out.println("");
        }
    }
    
}
