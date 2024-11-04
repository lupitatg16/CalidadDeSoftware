import java.util.Scanner;

public class SonarQubeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inyección de dependencias insegura
        System.out.println("Introduce el nombre del archivo para leer:");
        String filename = scanner.nextLine();
        readFile(filename);  // Posible problema de seguridad (Inyección de archivo)

        // Código duplicado (lo mismo dos veces)
        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();

        int result = addNumbers(num1, num2);
        System.out.println("Resultado de la suma: " + result);

        // Código innecesariamente complejo (alta complejidad ciclomatica)
        if (num1 > 0) {
            if (num2 > 0) {
                if (num1 > num2) {
                    System.out.println("El primer número es mayor.");
                } else if (num1 == num2) {
                    System.out.println("Ambos números son iguales.");
                } else {
                    System.out.println("El segundo número es mayor.");
                }
            } else {
                System.out.println("El segundo número es negativo.");
            }
        } else {
            System.out.println("El primer número es negativo.");
        }

        // Bloques de código anidados que podrían simplificarse
        if (num1 > 10) {
            if (num2 > 10) {
                System.out.println("Ambos números son mayores a 10.");
            }
        }

        scanner.close();
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Falta manejo adecuado de excepciones (riesgo de crash por archivos inexistentes)
    public static void readFile(String filename) {
        try {
            System.out.println("Leyendo archivo: " + filename);
            // Aquí debería haber lógica para leer un archivo
        } catch (Exception e) {
            System.out.println("Error leyendo archivo.");
        }
    }

    // Método sin uso (SonarQube señalará código muerto)
    public static void unusedMethod() {
        System.out.println("Este método nunca es llamado.");
    }
}
