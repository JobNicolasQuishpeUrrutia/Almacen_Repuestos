/*
  NOMBRE DEL PROYECTO: Almacen_RepuestosApp
 */
package almacen_repuestosapp;

/**
    @author Quishpe Urrutia Job Nicolas
 */

// Clase Almacen_Repuestos
class Almacen_Repuestos {
    
    // Atributos
    private String propietario;
    private int cantidad_repuestos;
    
    // Constructores
    public Almacen_Repuestos(String propietario) {
        this (propietario, 0); // Sobrecarga
    }
    
    public Almacen_Repuestos(String propietario, int cantidad_repuestos) {
        this.propietario = propietario;
        // Si la cantidad de repuestos es menor que cero, lo ponemos a cero
        if(cantidad_repuestos<0){
            this.cantidad_repuestos = 0;
        } else {
            this.cantidad_repuestos = cantidad_repuestos;
        }
    }    
    
    // Métodos
    public void setPropietario(String propietario) { // set, modifica o almacena valor variable
        this.propietario = propietario;
    }
    public String getPropietario(){  // get, muestra o extrae el valor del dato.
        return propietario;
    }
    
    public void setCantidad_repuestos(int cantidad_repuestos){
        this.cantidad_repuestos = cantidad_repuestos;
    }
    public int getCantidad_repuestos(){
        return cantidad_repuestos;
    }
    
    
    /* Ingresar repuestos al almacén,
       solo si es positiva la cantidad de repuestos. */
    public void Ingresar_Repuestos(int cantidad_repuestos) {
        if(cantidad_repuestos > 0){
            this.cantidad_repuestos += cantidad_repuestos;
        }   //   cantidad_repuestos += cantidad_repuestos + cantidad_repuestos
    }
    
    
    /* Venda una cantidad de repuestos del almacén,
        si se quedará en negativo, la cantidad de respuestos quedará en 0.*/
    public void Vender_Repuestos(int cantidad_repuestos) {
        if(cantidad_repuestos < 0){
            this.cantidad_repuestos = cantidad_repuestos;
        } else {
            this.cantidad_repuestos -= cantidad_repuestos;
        }   //   cantidad_repuestos -= cantidad_repuestos - cantidad_repuestos
    }
    
    /* Devuelve el estado del objeto
    @return
    */
    @Override
    public String toString() {
        return " El propietario " + propietario + " tiene " +cantidad_repuestos + 
               " repuestos disponibles en almacén";
    }
}

// Clase Ejecutable
public class Almacen_RepuestosApp {
    public static void main(String[] args) {
        Almacen_Repuestos almacen_1 = new Almacen_Repuestos("Julian Urutia");
        Almacen_Repuestos almacen_2 = new Almacen_Repuestos("Nicolas Quishpe", 40);
        
        // Ingreso de respuestos al almacén
        almacen_1.Ingresar_Repuestos(20);
        almacen_2.Ingresar_Repuestos(30);
        
        // Venta de repuestos del almacén
        almacen_1.Vender_Repuestos(40);  
        almacen_2.Vender_Repuestos(20);  
        
        // Presentación de disponibilidad de repuestos en el almacén
        System.out.println(almacen_1);  // 0 repuestos en almacén
        System.out.println(almacen_2);  // 50 repuestos en almacén
    }
}