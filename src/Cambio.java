import javax.swing.*;
import java.util.ArrayList;

public class Cambio{
    public void vuelto(int retiro){
        int[] billetes ={200, 100, 50, 20, 10}; //billetes disponibles en ATM
        ArrayList<Integer> solucion = new ArrayList<Integer>(); //conjunto de solucion / Blletes devueltos

        int x=0; //billete seleccionado para devolver
        int acum=0; //acumula los billetes devueltos
        int dif=retiro; //diferencia en cada retiro respecto al monto solicitado

        if(retiro<=3000){
            while(acum != retiro){ //mientras los billetes hasta ahora devueltos no cumplan el valor solicitado
                dif=dif-x; //se acumula la diferencia
                x=seleccionar(billetes, dif); //eleccion del billete adecuado y guardar -> revisar linea 28
                acum=acum+x; //guardar el billete elegido
                solucion.add(x); //agregar al conjunto solucion
            }
            for(int j=0; j<solucion.size(); j++){ //recorrido e impresion del conjunto solucion
                //JOptionPane.showMessageDialog(null, solucion.get(j));
                System.out.println(solucion.get(j));
            }
        }else{
            JOptionPane.showMessageDialog(null,"No puede retirar mas de 3000");
        }
    }

    public int seleccionar(int[] Bill, int dif){ //metodo de eleccion del billete ideal
        int aux=0;

        for(int j=0; j<Bill.length; j++){ //recorrido de los billetes disponibles
            if(Bill[j]<=dif){ //si es menor que la cantidad por devolver
                aux=Bill[j]; //guardar billete ideal
                break;
            }
        }
        return aux; // -> revisar linea 16
    }
}