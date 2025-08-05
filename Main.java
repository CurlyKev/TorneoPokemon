import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TorneoVista vista = new TorneoVista();
        TorneoController controller = new TorneoController(vista);

        Entrenador ash = new Entrenador("Ash");
        Entrenador misty = new Entrenador("Goku");

        System.out.println("Selecciona tu entrenador:");
        System.out.println("1. Ash");
        System.out.println("2. Goku");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        Entrenador jugador = (opcion == 1) ? ash : misty;
        Entrenador rival = (opcion == 1) ? misty : ash;

        List<Pokemon> todos = generarPokemones();
        Collections.shuffle(todos);

        for (int i = 0; i < 4; i++) {
            jugador.agregarPokemon(todos.get(i));
            rival.agregarPokemon(todos.get(i + 4));
        }

        controller.iniciarTorneo(jugador, rival);
    }

    public static List<Pokemon> generarPokemones() {
        List<Pokemon> pokemones = new ArrayList<>();

        pokemones.add(new Pokemon("Pikachu", "Eléctrico", 55, 40,
            new Habilidad("Impacto Relámpago", "daño", 10, 30)));

        pokemones.add(new Pokemon("Bulbasaur", "Planta", 50, 45,
            new Habilidad("Escudo Natural", "defensa", 20, 40)));

        pokemones.add(new Pokemon("Charmander", "Fuego", 60, 35,
            new Habilidad("Llama Final", "ataque", 15, 30)));

        pokemones.add(new Pokemon("Squirtle", "Agua", 45, 50,
            new Habilidad("Burbuja Protectora", "defensa", 25, 35)));

        pokemones.add(new Pokemon("Pikachu", "Eléctrico", 55, 40,
            new Habilidad("Impacto Relámpago", "daño", 10, 30)));

        pokemones.add(new Pokemon("Bulbasaur", "Planta", 50, 45,
            new Habilidad("Escudo Natural", "defensa", 20, 40)));

        pokemones.add(new Pokemon("Charmander", "Fuego", 60, 35,
            new Habilidad("Llama Final", "ataque", 15, 30)));

        pokemones.add(new Pokemon("Squirtle", "Agua", 45, 50,
            new Habilidad("Burbuja Protectora", "defensa", 25, 35)));

        return pokemones;
    }
}
