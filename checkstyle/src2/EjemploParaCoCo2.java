public class EjemploParaCoCo2 {

    public void exampleMethod() {
        int a = 6,  b = 2, c = 3, d = 1, e = 6;

        if (a > 5) {
            for (int i = 0; i < 10; i++) {
                if ((b < 3) && (e > 5)) {
                    while (c != 0) {
                        do {
                            c--;
                        } while (c > 0);
                    }
                }
            }
        } else {
            switch (d) {
                case 1:
                    System.out.println("Doing something 1");
                    break;
                case 2:
                    System.out.println("Doing another thing 2");
                    break;
                default:
                    System.out.println("Doing default thing X");
            }
        }
    }

    public static void main(String[] args) {
        EjemploParaCoCo obj = new EjemploParaCoCo();
        obj.exampleMethod();
    }
}

