package co.edu.unisabana.app;

import co.edu.unisabana.app.modelo.Empleado;

public class App 
{
    public static void main( String[] args )
    {
        Empleado andreas = new Empleado ("Andreas",
        "Jefe",
        "Gestiona la sucursal");
        Empleado julia = new Empleado ("Julia",
        "Consultor",
        "Asesora a los clientes sobre las quejas");
        Empleado tom = new Empleado ("Tom",
        "Venta",
        "Vende los productos");
        Empleado stefanie = new Empleado ("Stefanie",
        "Desarrollador",
        " Mantenimiento informático en la sucursal");
        Empleado matthias = new Empleado ("Matthias",
        "Contable",
        "contabilidad financiera de la sucursal");
        andreas.imprimirFuncionActual();
        julia.imprimirFuncionActual ();
        tom.imprimirFuncionActual ();
        stefanie.imprimirFuncionActual ();
        matthias.imprimirFuncionActual ();
    }
}
