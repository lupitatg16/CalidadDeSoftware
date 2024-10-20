// Ejercicio 1: Sistema de Gestión de Inventario
class Producto {
    private int stock;
    private double precio;

    public boolean necesitaReabastecimiento(int umbralMinimo, int umbralMaximo) {
        return stock < umbralMinimo || (stock < umbralMaximo && precio > 100);
    }

    public void actualizarPrecio(double inflacion, boolean esProductoPremium) {
        if ((inflacion > 0.05 && precio < 50) || (esProductoPremium && inflacion > 0.02)) {
            precio *= (1 + inflacion);
        } else if (inflacion > 0.1) {
            precio *= (1 + inflacion / 2);
        }
    }
}

class GestorInventario {
    public void gestionarInventario(Producto producto, int umbralMinimo, int umbralMaximo) {
        if (producto.necesitaReabastecimiento(umbralMinimo, umbralMaximo)) {
            // Lógica de reabastecimiento
        }
        producto.actualizarPrecio(0.03, true);
    }
}
