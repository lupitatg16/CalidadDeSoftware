public class EvaluacionDePrestamo {
    // Ejercicio 4: Evaluación de Préstamo
    public static String evaluarPrestamo(int edad, double salario, boolean tieneDeudas) {
        if (edad < 18 || edad > 65) {
            return "No elegible por edad";
        }
        if (tieneDeudas && salario < 2000) {
            return "No elegible por deudas y salario bajo";
        }
        if (salario >= 3000) {
            return "Préstamo aprobado";
        } else if (salario >= 2000 && !tieneDeudas) {
            return "Préstamo aprobado con condiciones";
        } else {
            return "Préstamo denegado";
        }
    }
}