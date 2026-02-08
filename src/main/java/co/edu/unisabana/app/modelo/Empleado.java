package co.edu.unisabana.app.modelo;

import co.edu.unisabana.app.modelo.Impresora;

public class Empleado {
    
    private final String nombre;
    private final String posicion;
    private final String rol;


    public Empleado(String nombre, String posicion, String rol) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.rol = rol;
    }

    public void imprimirFuncionActual() {
        Impresora impresora = Impresora.obtenerInstancia();
        impresora.imprimir("El empleado " + this.nombre + " tiene la función de " + rol + " en la posición de " + posicion);
    }
}
