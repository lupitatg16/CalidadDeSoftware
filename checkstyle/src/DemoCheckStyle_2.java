public class DemoCheckStyle {

    public void metodoSimple() {
        System.out.println("Este método es simple.");
    }

    public boolean metodoCondicionalSimple(int numero) {
        if (numero > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String metodoConMultiplesCondiciones(int edad, boolean esEstudiante, String nacionalidad) {
        if (edad < 18) {
            return "Menor de edad";
        } else if (edad >= 18 && edad < 65) {
            if (esEstudiante) {
                return "Estudiante adulto";
            } else if (nacionalidad.equals("Español")) {
                return "Adulto español";
            } else {
                return "Adulto extranjero";
            }
        } else {
            return "Adulto mayor";
        }
    }

    public int metodoConBuclesAnidados(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
            suma += numeros[i];
        }
        return suma;
    }

    public void metodoConSwitchYBreaks(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Opción 1");
                break;
            case 2:
                System.out.println("Opción 2");
                break;
            case 3:
                System.out.println("Opción 3");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    public int metodoRecursivo(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * metodoRecursivo(n - 1);
    }

    public void metodoConExcepciones(String texto) {
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número válido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("No es un número válido");
        } catch (Exception e) {
            System.out.println("Otro tipo de error");
        }
    }
}