package src;

import java.util.Scanner;

public class DemoCheckstyle {

    // Variables de clase con acceso público (violación de encapsulamiento)
    public int counter;
    public String message;

    // Constructor con mal formato
    public DemoCheckstyle(){
        counter = 0;
        message = "Hello, Checkstyle!";
    }

    // Método que tiene demasiadas líneas de código y lógica anidada
    public void longMethodExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Number is positive and even.");
            } else {
                System.out.println("Number is positive and odd.");
            }
        } else if (number == 0) {
            System.out.println("Number is zero.");
        } else {
            if (number % 2 == 0) {
                System.out.println("Number is negative and even.");
            } else {
                System.out.println("Number is negative and odd.");
            }
        }

        // Bucle innecesario que podría ser optimizado
        for (int i = 0; i < 10; i++) {
            counter++;
        }

        // Uso innecesario de varias sentencias en una sola línea
        System.out.println("Counter incremented by 10"); System.out.println("Done.");
    }

    // Método sin comentarios y con mal formato
    public void doSomething(){
      System.out.println("Doing something");
    }

    // Método main
    public static void main(String[] args) {
        DemoCheckstyle demo = new DemoCheckstyle();
        demo.longMethodExample();
        demo.doSomething();
    }
}
