import java.util.*;

public class DemoCheckstyleCompleto {

    public static final int CONSTANTE_MAL_NOMBRADA = 100;
    private int variableConNombreMuyLargo = 0;
    public String stringPublico;

    public void MetodoConNombreIncorrecto() {
        int a = 5;
        if (a == 5) {
            System.out.println("a es 5");
        }
        // Comentario innecesario
    }

    public void metodoConMuchosParametros(int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        // Método con demasiados parámetros
    }

    public void metodoConBucleVacio() {
        for (int i = 0; i < 10; i++) {
            // Bucle vacío
        }
    }

    public boolean metodoConComplejidadCiclomaticaAlta(int a, int b, int c) {
        if (a > 0) {
            if (b > 0) {
                if (c > 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (c > 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }

    public void metodoConMagicNumber() {
        int resultado = 42 * 7;
    }

    public void metodoConVariableNoUsada() {
        int variableNoUsada = 10;
        System.out.println("Hola");
    }

    public void metodoConEspaciadoIncorrecto(){
        if(true){System.out.println("Sin espacios");}
    }

    public void metodoConImportNoUsado() {
        // El import java.util.* no se usa en este método
    }

    public String metodoConRetornoImplicito(boolean condicion) {
        if (condicion)
            return "Verdadero";
        // Falta un return explícito aquí
    }

    public void metodoConBloqueVacio() {}

    public void metodoConComentarioLargo() {
        // Este es un comentario muy largo que probablemente debería ser un comentario de bloque en su lugar.
        // Checkstyle puede advertir sobre comentarios de una sola línea que son demasiado largos.
    }

    @Override
    public String toString() {
        return "DemoCheckstyleCompleto";
    }
}
