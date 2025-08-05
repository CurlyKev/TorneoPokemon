import java.util.ArrayList;
import java.util.List;

public class Entrenador {
    private String nombre;
    private List<Pokemon> equipo = new ArrayList<>();
    private List<Pokemon> usados = new ArrayList<>();

    public Entrenador(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPokemon(Pokemon p) {
        if (equipo.size() < 4) equipo.add(p);
    }

    public Pokemon elegirPokemon(int index) {
        Pokemon elegido = equipo.get(index);
        usados.add(elegido);
        return elegido;
    }

    public boolean yaUsado(Pokemon p) {
        return usados.contains(p);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Pokemon> getEquipo() {
        return equipo;
    }
}

