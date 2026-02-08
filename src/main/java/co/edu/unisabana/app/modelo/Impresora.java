package co.edu.unisabana.app.modelo;

public class Impresora {
    
    private static Impresora impresora;
    private int totalPaginasHoy;

    private Impresora() {
        totalPaginasHoy = 0;
    }

    public static Impresora obtenerInstancia() {
        if (impresora == null) {
            impresora = new Impresora();
        }
        return impresora;
    }

    public void imprimir(String contenido) {
        System.out.println(contenido +
            "\n" + "número de páginas impresas hoy: " + ++ totalPaginasHoy +
            "\n" + "---------");
    }
}
