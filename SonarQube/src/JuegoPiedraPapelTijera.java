// Juego de Piedra, Papel, Tijeras
public class JuegoPiedraPapelTijera {
    
    public static String jugar(String jugador1, String jugador2) {
        if (jugador1.equals(jugador2)) {
            return "Empate";
        } else if ((jugador1.equals("piedra") && jugador2.equals("tijeras")) ||
                   (jugador1.equals("papel") && jugador2.equals("piedra")) ||
                   (jugador1.equals("tijeras") && jugador2.equals("papel"))) {
            return "Gana Jugador 1";
        } else if ((jugador2.equals("piedra") && jugador1.equals("tijeras")) ||
                   (jugador2.equals("papel") && jugador1.equals("piedra")) ||
                   (jugador2.equals("tijeras") && jugador1.equals("papel"))) {
            return "Gana Jugador 2";
        }
        return "Entrada inválida";
    }

}
