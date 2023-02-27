/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento_burbuja;

/**
 *
 * @author Personal
 */
public class Ordenamiento_burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // arreglo
        int []arreglo = {21,40,4,9,10,35};
        
        imprimirArray(arreglo,"Array inicial");
        
        System.out.println("");
        
        // recorremos el arreglo 
        for(int elem = 0; elem < arreglo.length ; elem++){
            /*  
                recorremos de nuevo el arreglo pero ya
                restando una posición para validar 
                el valor en la posición anterior
            */
                System.out.println("Recorrido #"+(elem + 1));
                System.out.println("");
                
                String mensaje = "Proceso de ordenamiento";
                
            
            for(int i = 0; i<arreglo.length - 1;i++){
                /*  validamos que el arreglo en 
                    la posicion 0 es mayor hacia la derecha en la posicion 1 
                    entramos al if y realizamos el cambio en el array                
                */ 
                if(arreglo[i] > arreglo[i+1]){
                    // asignamos a la variable aux el valor de la posicion
                    int aux = arreglo[i];
                    // asignamos la variable que comparamos 
                    // y la ponemos en la posición que comparamos
                    arreglo[i] = arreglo[i+1];
                    // le asignamos el valor de la posicion correcta 
                    // con la variable aux que tiene el valor que comparamos
                    arreglo[i+1] = aux;
                    imprimirArray(arreglo,mensaje);                  
                }                
            }
            System.out.println("");
        }
        /* Realizamos un foreach para recorrer 
        el nuevo arreglo ya ordenado 
        y pintamos el nuevo valor  */
        System.out.println("Arreglo ordenado desde el mismo metodo por dos for");
        for(int a:arreglo){            
            System.out.println(a);            
        }
        
        System.out.println("*****************");
        
        /* metodo llamando una clase para realiza el recorrido */         
        OrdenAsc or = new OrdenAsc();
        or.ordenarBurbuja(arreglo);
        
        
        /* 
        Realizamos un foreach para recorrer 
        el nuevo arreglo ya ordenado desde la clase
        y pintamos el nuevo valor  
         System.out.println("Arreglo ordenado desde una clase donde realizamos la validación");
         for(int a:arreglo){            
            System.out.println(a);            
        }*/
        System.out.println("*****************");
        
        
        
    }
    
    public static void imprimirArray  (int []arreglo, String mensaje) {
        System.out.println(mensaje);
        System.out.print("{");
        
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]);
            if(i  != (arreglo.length - 1)){
                System.out.print(",");
            }      
        }
        
        System.out.print("}"+"\n");
    }
    
}