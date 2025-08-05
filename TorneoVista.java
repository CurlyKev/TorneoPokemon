import java.util.Scanner;

public class TorneoVista {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarRonda(int ronda) {
        System.out.println("\nRonda " + ronda);
    }

    public Pokemon seleccionarPokemon(Entrenador entrenador) {
        System.out.println("Entrenador " + entrenador.getNombre() + ", elige tu Pokémon:");
        for (int i = 0; i < entrenador.getEquipo().size(); i++) {
            Pokemon p = entrenador.getEquipo().get(i);
            System.out.println(i + ". " + p.getNombre() + " (" + p.getTipo() + ")");
        }
        int index = scanner.nextInt();
        return entrenador.elegirPokemon(index);
    }

    public boolean decidirUsoHabilidad(Entrenador entrenador, Pokemon p) {
        System.out.println(entrenador.getNombre() + ", ¿Usar habilidad especial de " + p.getNombre() + "? (si/no)");
        String respuesta = scanner.next();
        return respuesta.equalsIgnoreCase("si");
    }

    public void mostrarResultadoRonda(Pokemon p1, int ataque1, Pokemon p2, int ataque2) {
        System.out.println(p1.getNombre() + " ataque total: " + ataque1);
        System.out.println(p2.getNombre() + " ataque total: " + ataque2);
        if (ataque1 > ataque2) System.out.println(p1.getNombre() + " gana la ronda.");
        else if (ataque2 > ataque1) System.out.println(p2.getNombre() + " gana la ronda.");
        else System.out.println("Empate.");
    }

    public void mostrarGanadorFinal(Entrenador e1, int puntos1, Entrenador e2, int puntos2) {
        System.out.println("\nResultado Final");
        System.out.println(e1.getNombre() + ": " + puntos1 + " rondas ganadas.");
        System.out.println(e2.getNombre() + ": " + puntos2 + " rondas ganadas.");
        if (puntos1 > puntos2) System.out.println("¡" + e1.getNombre() + " gana el torneo!");
        else if (puntos2 > puntos1) System.out.println("¡" + e2.getNombre() + " gana el torneo!");
        else System.out.println("Empate!");
    }
}
